package team02.pojos.AdminController;

import java.io.Serializable;

public class RequestDBPojo implements Serializable {
	private String birthDay;
	private String birthPlace;
	private String gender;
	private String name;
	private String password;
	private String phoneNumber;
	private String ssn;
	private String surname;
	private String username;
	private String builtIn;

	public RequestDBPojo() {
	}

	public RequestDBPojo(String birthDay, String birthPlace, String gender, String name, String password, String phoneNumber, String ssn, String surname, String username, String builtIn) {
		this.birthDay = birthDay;
		this.birthPlace = birthPlace;
		this.gender = gender;
		this.name = name;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.ssn = ssn;
		this.surname = surname;
		this.username = username;
		this.builtIn = builtIn;
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

	public void setBuiltIn(String builtIn){
		this.builtIn = builtIn;
	}

	public String getBuiltIn(){
		return builtIn;
	}

	@Override
 	public String toString(){
		return 
			"RequestDBPojo{" + 
			"birthDay = '" + birthDay + '\'' + 
			",birthPlace = '" + birthPlace + '\'' + 
			",gender = '" + gender + '\'' + 
			",name = '" + name + '\'' + 
			",password = '" + password + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",ssn = '" + ssn + '\'' + 
			",surname = '" + surname + '\'' + 
			",username = '" + username + '\'' + 
			",built_in = '" + builtIn + '\'' + 
			"}";
		}
}