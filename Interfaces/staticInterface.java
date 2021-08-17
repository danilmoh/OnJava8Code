interface Operations {
	void execute();
	static void runOps(Operations... ops) {
		for(Operations op : ops)
			op.execute();
	}
	static void show(String msg) {
		System.out.println(msg);
	}
}

class Bing implements Operations {
	@Override public void execute() {
		Operations.show("Bing");
	}
}

class Crack implements Operations {
	@Override public void execute() {
		Operations.show("Crack");
	}
}

class Machine {
	public static void main(String[] args) {	// run from here
		Operations.runOps(new Bing(), new Crack());
	}
}
