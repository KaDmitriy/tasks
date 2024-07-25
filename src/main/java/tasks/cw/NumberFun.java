package tasks.cw;

public class NumberFun {
	
	  public static long findNextSquare(long sq) {
	      double a = Math.sqrt(sq); 
	      if(a % 1 == 0) {
	    	  long res = ((long)a+1)*((long)a+1);
	    	   return res;
	      }
	      System.out.println(Long.MAX_VALUE);
	      return -1; 
	  }

}
