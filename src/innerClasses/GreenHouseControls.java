package innerClasses;
import innerClasses.controller.*;

public class GreenHouseControls extends Controller {
	private boolean light = false;
	public class LightOn extends Event {
		public LightOn(long delayTime) {
			super(delayTime);
		}
		@Override public void action() {
			light = true;
		}
		@Override public String toString() {
			return "Light is on";
		}
	}
	public class LightOff extends Event {
		public LightOff(long delayTime) {
			super(delayTime);
		}
		@Override public void action() {
			light = false;
		}
		@Override public String toString() {
			return "Light is off";
		}
	}
	private boolean water = false;
	public class WaterOn extends Event {
		public WaterOn(long delayTime) {
			super(delayTime);
		}
		@Override public void action() {
			water = true;
		}
		@Override public String toString() {
			return "Greenhouse water is on";
		}
	}
	public class WaterOff extends Event {
		public WaterOff(long delayTime) {
			super(delayTime);
		}
		@Override public void action() {
			water = false;
		}
		@Override public String toString() {
			return "Greenhouse water is off";
		}
	}
	private String thermostat = "Day";
	public class ThermostatNight extends Event {
		ThermostatNight(long delayTime){
			super(delayTime);
		}
		@Override public void action() {
			thermostat = "Night";
		}
		@Override public String toString() {
			return "Thermostat is on night setting";
		}
	}
	public class ThermostatDay extends Event {
		ThermostatDay(long delayTime){
			super(delayTime);
		}
		@Override public void action () { 
			thermostat = "Day";
		}
		@Override public String toString() {
			return "Thermostat is on day setting";
		}
	}
	public class Bell extends Event {
		Bell(long delayTime){
			super(delayTime);
		}
		@Override public void action() {
			addEvent(new Bell(delayTime.toMillis()));	// delay time of event
		}
		@Override public String toString() {
			return "Bing!";
		}
	}
	public class Restart extends Event {
		private Event[] eventList;
		public Restart(long delayTime, Event[] eventList) {
			super(delayTime);
			this.eventList = eventList;
			for(Event e : eventList)
				addEvent(e);
		}
		@Override public void action() {
			for(Event e : eventList) {
				e.start();// rerun each element
				addEvent(e);
			}
			start();
			addEvent(this);
		}
		@Override public String toString() {
			return "Restarting system";
		}
	}
	public static class Terminate extends Event {
		public Terminate (long delayTime) {
			super(delayTime);
		}
		@Override public void action() {
			System.exit(0);
		}
		@Override public String toString() {
			return "Terminating";
		}
	}
}

