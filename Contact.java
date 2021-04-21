/* 
 * Jameel. H. Khan 
 * Module 11 Assignment - Contact Class
 * EN.605.201.83.SP21
 */ 

public class Contact
{
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	
	// constructor
	public Contact( String first, String last, String newPhone, String newEmail )
	{
		firstName = first;
		lastName = last;
		phone = newPhone;
		email = newEmail;
	}
	
	// default constructor
	public Contact()
	{
		firstName = "";
		lastName = "";
		phone = "";
		email = "";
	}
	
	// get methods
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	// set methods
	public void setFirstName( String newFirstName )
	{
		this.firstName = newFirstName;
	}
	
	public void setLastName( String newLastName )
	{
		this.lastName = newLastName;
	}
	
	public void setPhone( String newPhone )
	{
		this.phone = newPhone;
	}
	
	public void setEmail( String newEmail )
	{
		this.email = newEmail;
	}
	
	// miscellaneous methods
	public int compareTo( )
	{
		
	}
	
	public String toString()
	{
		
	}
}
