package team02.pojos.AdminController;

import java.io.Serializable;

public class RequestPojo implements Serializable {
	private String birthDay;
	private String birthPlace;
	private String builtIn;
	private String gender;
	private String name;
	private String password;
	private String phoneNumber;
	private String ssn;
	private String surname;
	private String username;

	public RequestPojo() {
	}

	public RequestPojo(String birthDay, String birthPlace, String builtIn, String gender, String name, String password, String phoneNumber, String ssn, String surname, String username) {
		this.birthDay = birthDay;
		this.birthPlace = birthPlace;
		this.builtIn = builtIn;
		this.gender = gender;
		this.name = name;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.ssn = ssn;
		this.surname = surname;
		this.username = username;
	}

	public RequestPojo(String date, String adana, String male, String yusuf1610, String kagan1610, String s, String s1, String ozer, String yusufOzer) {
	}

	public RequestPojo(String mail, String team02Project, String yusuf, String kagan) {
	}

	public void setBirthDay(String birthDay){
		this.birthDay = birthDay;
	}

	public String getBirthDay(){
		return birthDay;
	}

	public void setBirthPlace(String birthPlace){
		this.birthPlace = birthPlace;
	}

	public String getBirthPlace(){
		return birthPlace;
	}

	public void setBuiltIn(String builtIn){
		this.builtIn = builtIn;
	}

	public String getBuiltIn(){
		return builtIn;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setSsn(String ssn){
		this.ssn = ssn;
	}

	public String getSsn(){
		return ssn;
	}

	public void setSurname(String surname){
		this.surname = surname;
	}

	public String getSurname(){
		return surname;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return 
			"RequestPojo{" + 
			"birthDay = '" + birthDay + '\'' + 
			",birthPlace = '" + birthPlace + '\'' + 
			",built_in = '" + builtIn + '\'' + 
			",gender = '" + gender + '\'' + 
			",name = '" + name + '\'' + 
			",password = '" + password + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",ssn = '" + ssn + '\'' + 
			",surname = '" + surname + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}