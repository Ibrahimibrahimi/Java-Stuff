
public class CheckPassword {
	public static String checkSimiliarity(String first , String second){
		if(first.equals(second)){
			return "";
		}else {
			return "Passwords should be similar !";
		}
	}
	public static String checkSimiliarity(String first , String second,String errorText){
		if(first.equals(second)){
			return "";
		}else {
			return errorText;
		}
	}
	public static String  checkLength(String p ,int l,String errorMessage){
		if (p.length() >= l){
			return "";
		}
		else {
			return errorMessage;
		}
	}
	public static int checkStrength(String pass){
		boolean hasLetters = false , hasDigits = false;
		int strength = 0;
		String letters[] = "abcdefghijklmnopqrstuvwxyz".split("");
		String digits[] = "0123456789".split("");
		// check if includes letters 
		for(String i : letters){
			if (pass.contains(i)){
				hasLetters = true;
			}
		}
		// check if includes digits 
		for(String i : digits){
			if (pass.contains(i)){
				hasDigits = true;
			}
		}
		if (hasDigits){
			strength = 4 ;
		}
		if (hasLetters){
			strength += 5;
		}
		return strength; // strength = 5 => only letters , = 4 => only digits , = 9 => both of letters & digits
	}

}