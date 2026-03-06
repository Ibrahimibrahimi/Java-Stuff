
public class User {
	private String name , lastName , numTele , Birth , password ;
	public User(String name , String lastName , String numTele , String Birth , String password){
		this.name = name ;
		this.lastName = lastName;
		this.numTele = numTele;
		this.Birth = Birth;
		this.password = password;
	}
	// setters if user want to modify its infos , and getters to make modification easy , 
	/* why getters ? => if user want to modify just one or two letters it will be easy for him */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNumTele() {
		return numTele;
	}
	public void setNumTele(String numTele) {
		this.numTele = numTele;
	}
	public String getBirth() {
		return Birth;
	}
	public void setBirth(String birth) {
		Birth = birth;
	}
	public String getPassword() {
		return password;
	}
	public boolean ModifyPassword(String newPassword){
		// check if new password similiar to old one 
		if (this.password.equals(newPassword)){
			this.password = newPassword; 
			return true;
		}else {
			return false;
		}
	}
	
}
