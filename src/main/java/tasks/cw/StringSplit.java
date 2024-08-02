package tasks.cw;

public class StringSplit {

	public static String[] solution(String s) {
		int length = s.length() % 2 == 0 ? s.length() / 2 : s.length() / 2 + 1;
		String[] aString = new String[length];
		int n = 0;
		for (int i = 0; i < length; i++) {
			if (n + 1 >= s.length())
				aString[i] = s.substring(n, n + 1) + "_";
			else
				aString[i] = s.substring(n, n + 2);
			n = n + 2;
		}
		return aString;
	}

	public static String[] solutionCW(String s) {
		s = (s.length() % 2 == 0) ? s : s + "_";
		return s.split("(?<=\\G.{2})");
	}

}
