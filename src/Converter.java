public class Converter {

	public String changeToHex(int intBase10) {
		String answer = "";
		
		int firstChar = 0;
		int secondChar = 0;
		
		firstChar = intBase10/16;
		if (firstChar > 9) {
			answer += digitToHex(firstChar);
		}
		else {
			answer += Integer.toString(firstChar);
		}
		
		secondChar = intBase10%16;
		if (secondChar > 9) {
			answer += digitToHex(secondChar);
		}
		else {
			answer += Integer.toString(secondChar);
		}
		
		return answer;
	}
	
	public String digitToHex(int f) {
		
		switch (f) {
		case 10:
			return "A";
		case 11:
			return "B";
		case 12:
			return "C";
		case 13:
			return "D";
		case 14:
			return "E";
		case 15:
			return "F";
		default:
			return "N";
		}
		
	}

}