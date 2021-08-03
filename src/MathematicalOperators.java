import java.util.*;
public class MathematicalOperators {

	public static void main(String[] args) {
		// Create a seeded random number generator
		Random rand = new Random(47);
		int i, j, k;
		// Choose a value from 1 to 100
		j = rand.nextInt(100) + 1;
		System.out.println("j : " + j);
		k = rand.nextInt(100) + 1;
		System.out.println("k : " + k);
		i = k + j;
		System.out.println("k + j : " + i);
		i = j - k;
		System.out.println("j - k : " + i);
		i = k / j;
		System.out.println("k / j : " + i);
		i = k * j;
		System.out.println("k * j : " + i);
		i = k % j;
		System.out.println("k % j : " + i);
		j %= k;
		System.out.println("j %= k : " + j);
		// Floating point number test. Also works with double
		float u, v, w;
		v = rand.nextFloat();
		System.out.println("v : " + v);
		w = rand.nextFloat();
		System.out.println("w :" + w);
		u = v + w;
		System.out.println("v + w :" + u);
		u = v - w;
		System.out.println("v - w :" + u);
		u = v * w;
		System.out.println("v * w :" + u);
		u = v / w;
		System.out.println("v / w :" + u);
		// The following also works for char, double, int, byte, short, long
		u += v;
		System.out.println("u += v : " + u);
		u -= v;
		System.out.println("u -= v : " + u);
		u *= v; 
		System.out.println("u *= v : " + u);
		u /= v;
		System.out.println("u /= v : " + u);
	}

}