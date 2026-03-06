/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tools;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author admin
 */
public class DateTools {
    public static String getDateNow(){
        String[] temp = LocalDate.now().toString().split("-");
        return temp[2] + "-" + temp[1] + "-" + temp[0]; // day-mounth-year

    }
    public static String getTimeNow(){
        return LocalTime.now().toString().substring(0,5); // 00:00 => 5
    }
}
