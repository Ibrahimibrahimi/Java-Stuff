
public class Password {
	// verifier si deux mots de passes sont la même
	public static boolean checkSim(String psw , String repsw){
		return psw.equals(repsw);
	}
	// verifier si le mot de passe ne contient pas des caracters non acceptée qui seron donnée comme parametre
	public static boolean CanUseIt(String psw,String[] NonAcceptedChars){
		// if password contains non accepted chars
		for(String i : psw.split("")){
			for(String j : NonAcceptedChars){
				if (i.equals(j)){
					return false;
				}
			}
		}
		return true;
	}
	public static boolean VerifierLongueur(String psw,int length){
		return psw.length() == length;
	}
	public static void main(String[] args) {
		// example to check if password acceptable or not 
		String chars[] = {"l","0"};
		System.out.println(CanUseIt("ab0cd", chars)); // false => contains "0" wich is an unacceptable
		// example to check similarity 
		String psw = "hello",reps = "hello";
		System.out.println(checkSim(psw, reps)); // true "hello" == "hello"
	}
}
