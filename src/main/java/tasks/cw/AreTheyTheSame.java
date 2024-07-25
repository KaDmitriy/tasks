package tasks.cw;

import java.util.Arrays;

public class AreTheyTheSame {

	public static boolean comp(int[] a, int[] b) {
		if(a==null || b==null) return false;
		if(a.length==0 && b.length==0) return true;
		boolean result = false;
		//Validation array. Whether the index has already been checked
		boolean[] checks = new boolean[a.length];
		//check each with each
		for(int i=0; i<a.length; i++) {
			result=false;
			int pow = a[i]*a[i];
			for(int j = 0; j < b.length; j++) {
				//if a is the square of b and has not been checked, then true
				if(pow==b[j] && !checks[j]) {
					result = true;
					checks[j] = true;
					break;
				}
			}
			//if for any a there is no square b, then we finish the check
			//result false
			if(result==false) break;
		}
		return result;
	}
	
	/**
	 * codewars top
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean compCWTop(int[] a, int[] b) {
		if ((a == null) || (b == null)){
		      return false;
		}
		int[] aa = Arrays.stream(a).map(n -> n * n).toArray();
		Arrays.sort(aa);
		Arrays.sort(b);
		return (Arrays.equals(aa, b));
		
	}
	
	/**
	 * codewars top2
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean compCWTop2(final int[] a, final int[] b) {
		return a != null && b != null && a.length == b.length && Arrays.equals(Arrays.stream(a).map(i -> i * i).sorted().toArray(), Arrays.stream(b).sorted().toArray());
	}

}
