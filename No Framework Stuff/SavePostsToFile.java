
public class SavePostsToFile {
	public static String Save(String postAuthor,String postDate , String PostText){
		// prepare data 
		String PostSep = "[-]";
		String sep = "[*]";
		String FileText = PostSep +postAuthor + sep + postDate + sep + PostText;
		
		return FileText;
	}
	public static void main(String[] args) {
		System.out.println(Save("ibrahim","12-15-2006","this is a post text"));
		System.out.println(Save("ibrahim","12-15-2006","this is a post text").split("[*]")[0].split("[*]")[0]);
	}
}
