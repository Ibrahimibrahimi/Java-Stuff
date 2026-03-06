import java.util.ArrayList;


public class CheckUsername {
	public static String hasNonAcceptChars(String username){
		ArrayList<String> nonAcceptedLetters = new ArrayList();
		boolean hasNonAcceptableAscii = false;
		for(String i : "/*\"\\&^".split("")){ nonAcceptedLetters.add(i); }
		for(String i : username.split("")){
			if (nonAcceptedLetters.contains(i)){
				hasNonAcceptableAscii = true;
			}
		}
		return (hasNonAcceptableAscii)?"Username contains non acceptable characters":"";
	}
	public static String hasNonAcceptChars(String username,String errorMessage){
		boolean hasNonAcceptableAscii = false;
		// array for unnecceptable caracters 
		ArrayList<String> nonAcceptedLetters = new ArrayList();
		// fill array list with all unacceptable caracters like / * ( ...
		for(String i : "/*\"\\&^()".split("")){ nonAcceptedLetters.add(i); }
		// check each letters of the username to see if it contains non acceptable chars
		for(String i : username.split("")){
			if (nonAcceptedLetters.contains(i)){
				hasNonAcceptableAscii = true;
			}
		}
		return (hasNonAcceptableAscii)?errorMessage:"";
	}
	public static String checkLength(String username,int l){
		return username.length() >= l?"":"username length should be greather than 8";
	}
	public static String checkLength(String username,int l,String errorMessage){
		return username.length() >= l?"":errorMessage;
	}
	
}
