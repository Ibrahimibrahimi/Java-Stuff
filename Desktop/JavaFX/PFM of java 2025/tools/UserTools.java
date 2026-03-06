/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tools;
import classes.User;
/**
 *
 * @author admin
 */
public class UserTools {
    public static  boolean exists(String phoneNumber){
        // search in property files if the phoneNumber.properties exists
        String searchBy = phoneNumber;
        
        return false;
    }
    public static boolean verifier(String name , String password){
        // if not exists
        if (!UserTools.exists(name)) return false;
        // else check the password , by comparing the giving password to 
        // the password from the property file 
        return true; // if similar
    }
    public static int countAll(){
        return 100; // by counting all files from users folder container, return the count of all files 
    }
}
