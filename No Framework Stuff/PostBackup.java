/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testicons;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PostBackup {
    String userName = "";
    Properties props;
    public PostBackup(String userName) {
        // get username for file name
        this.userName = userName;
        // set up the object
        this.props = new Properties();
    }
    public void setPropriety(String key, String value){
        // Set your key-value , example : Name="ibeahim";
        props.setProperty(key, value);
    }
    public void finish(String folder){
        // save file into username + .proprieties => usernames are uniques
        try (FileOutputStream output = new FileOutputStream(folder + "/" + this.userName + ".properties")) {
            System.out.println("Properties file saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void finish(){
        // save file into username + .proprieties => usernames are uniques
        try (FileOutputStream output = new FileOutputStream(this.userName + ".properties")) {
            System.out.println("Properties file saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
