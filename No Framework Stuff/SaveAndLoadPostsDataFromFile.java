import java.util.ArrayList;


public class SaveAndLoadPostsDataFromFile {
	public static void main(String[] args) {
		/*--------------------Save Data from post to file----------------------------*/
		String postAuthor = "ibrahim",PostDate="12/12/2026"
				,PostText="this is a post content just to text ";
		String file = "";
		file += "|" + postAuthor + "|" + PostDate + "|" + PostText + "|" + "[-]";
		// use '[-]' to split posts from each others 
		// use '|' to split every infos from the post 
		/*-----------------------Load Data from File --------------------------------------*/
		file = "ibrahim|12/12/2026|this is a post content just to test|[-]";
		String Posts[] = file.split("[-]"); // use "[-]" to split eaach post
		/*Posts[0] =  first post  , Posts[1] = second post ...*/;
		int l = Posts.length;
		// store all into arrays 
		ArrayList<String> Authors = new ArrayList<String>(),
				Dates= new ArrayList<String>(),
				TextContents = new ArrayList<String>();
		int temp = 0;
		for (String i : Posts){
			String post[] = i.split("|"); // split each post to data , post[0] = author name ...
			Authors.add(post[temp]);
			Dates.add(post[temp+1]);
			TextContents.add(post[temp+2]);
		}
		// if i want to access for example to the first post author name : 
		System.out.println(Authors.get(0));
		// first post date : 
		System.out.println(Dates.get(0));
		// first post text content 
		System.out.println(TextContents.get(0));
		
	}

}
