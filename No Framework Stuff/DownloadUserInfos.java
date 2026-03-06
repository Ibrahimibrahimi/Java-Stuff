
public class DownloadUserInfos {
	public static String  getdownloadInfos(String name , String lastName , String numTele,String bio){
		return  "---------------------------------------------------------------------\n Nom : " + name + ".\nPrenom : " + lastName + ".\nTélephone : " + numTele + ".\n"
				+ "Biographi : " + bio + "\n---------------------------------------------------------------------"
				;
	}
	public static void main(String[] args) {
		System.out.println(getdownloadInfos("ibrahim", "id-wahman", "06606006", "hi i'm ibrahim id-wahman , im 18"));
	}
}
