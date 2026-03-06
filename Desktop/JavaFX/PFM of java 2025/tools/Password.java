/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tools;
public class Password {
   public static String generer(){
       String lettres = "abcdefghijklmnopqrstuvwxyz";
       String chiffres = "0123456789";
       String symbols = "(!@#$%&*)"; 
       String resultat = "";
       int randomN = (int)(Math.random() * 5); // pour mettre la longueur de mot de passe varier
       // generer une password avec 5 lettres , 2 digits and 1 symbols at least 
       for(int i = 0 ; i < 5 + randomN;i++) resultat += lettres.charAt((int)(Math.random() * lettres.length()));
       for(int i = 0 ; i < 2 + randomN ; i++) resultat += chiffres.charAt((int)(Math.random() * chiffres.length()));;
       for(int i = 0 ; i < 1 + randomN;i++) resultat += symbols.charAt((int)(Math.random() * symbols.length()));;
      return resultat; // generated password selon les conditions
   }
   public static String MotPasseCheckErreur(String motDePasse){
        if (motDePasse.length() <= 8) {
            return "Le mot de passe est trop court (doit dépasser 8 caractères)";
        }

        int nbrLetters = 0;
        int nbrChiffres = 0;
        int nbrSymbols = 0;

        for (char c : motDePasse.toCharArray()) {
            if (Character.isLetter(c)) {
                nbrLetters++;
            } else if (Character.isDigit(c)) {
                nbrChiffres++;
            } else if ("!@#$%^&*()".indexOf(c) >= 0) {
                nbrSymbols++;
            }
        }

        if (nbrLetters < 5) {
            return "Le mot de passe doit contenir au moins 5 lettres";
        }
        if (nbrChiffres < 2) {
            return "Le mot de passe doit contenir au moins 2 chiffres";
        }
        if (nbrSymbols < 1) {
            return "Le mot de passe doit contenir au moins 1 symbole (!@#$%^&*())";
        }
        return "";
   }
}
