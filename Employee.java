import java.util.*; 

public class Employee {
	
	private String firstName, lastName, address;
	private Date dateOfBirth; 
	private int age;

//Getters and Setters	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
//---------------------------------------------------------------
	//add method to calculate age from date of birth inputted
	public Employee(String fName, String lName, String address, Date DOB, int age) {
		this.firstName = fName;
		this.lastName = lName; 
		this.address = address; 
		this.dateOfBirth = DOB; 
		this.age = age;	
	}
//-----------------------------------------------------------------------------------------	
	public String toString() {
		String output = "\n First Name: " + firstName + "\n Last Name: " + lastName 
						+ "\n Address: " + address + "\n DOB: " + dateOfBirth + "\n Age: " + age;
		return output;
	}

}
