package tasks.cw;

public class CheckThreeAndTwo {

	public boolean checkThreeAndTwo(char[] chars) {
		if (chars.length > 5)
			return false;
		int countA = 0;
		int countB = -1; //если нет ни одного вхождения в B
		char charA = chars[0];
		char charB = 0;
		for (int i = 0; i < chars.length; i++) {
			if (charA == chars[i])
				countA++;
			else {
				if (charB == 0) {
					charB = chars[i];
					countB = 1;
				} else if (charB == chars[i])
					countB++;

			}
		}
		return ((countA == 3 && countB == 2) || (countA==2 && countB == 3));
	}

}
