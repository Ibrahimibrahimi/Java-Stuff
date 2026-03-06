/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import java.util.HashMap;
import java.util.Map;

public class Post {
    private String authorName,authorNumber , text;
    private HashMap<String,String> comments = new HashMap<String, String>(); // key = comment author , value = text content
    public Post(String author , String text){
        this.authorName = authorName;
        this.authorNumber = authorNumber;
        this.text = text;
    }
    // setters 
    public boolean setText(String t,String CurrentUserphoneNumber){
        // check if can modify => if has acces
        String username = "";// get the username of the given phone number by searching files and get properties
        if (username.equals(authorName)){
            this.text = t;
            return true;
        }else return false;
    }
    public String getText(){return this.text;}
    
    
    public void savePost(){
        // save to properties file
        /*
        properties form : 
        authorPhoneNumber=0669369900 => used to make current able to see some infos about the post author (name , bio ,birth)
        authorName=ibrahim => getted using the phone number
        date=12-11-2025
        nbrComment=20
        nbrLikes=12
        Comments=ibrahim[sep1234]this comment is for ibrahim[sepComments]ahmed[sep1234]this comment is for ahmed        
        
        */
    }    
}
