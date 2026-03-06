import java.time.LocalDate;;


public class DateTools {
	public static String now(){
		return LocalDate.now().toString(); // 2025-04-04
		/* Year = date.split("-")[0] */
		/* Mounth = date.split("-")[1] */
		/* Day = date.split("-")[2d] */
	}	
}
