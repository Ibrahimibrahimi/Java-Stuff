/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

/**
 *
 * @author admin
 */
public class User {
    private String name , phoneNumber , password , bio , birthDate;

    public User(String name, String phoneNumber, String password, String bio, String birthDate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.bio = bio;
        this.birthDate = birthDate;
    }

    // getters
    public String getName() {return name;}
    public String getPhoneNumber() {return phoneNumber;}
    public String getPassword() {return password;}
    public String getBio() {return bio;}
    public String getBirthDate() {return birthDate;}

    // setters
    public void setName(String name) {this.name = name;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
    public void setBio(String bio) {this.bio = bio;}
    public void setBirthDate(String birthDate) {this.birthDate = birthDate;}
    public boolean setPassword(String old , String newp){
        if (old.equals(newp)){
            this.password = newp;
            return true; // modified successfully
        }else{return false;} // cannot modify
    }
    // save user => add to users list file to a property file that has the filename == phone number
    public void saveUser(){
        
    }    
}
