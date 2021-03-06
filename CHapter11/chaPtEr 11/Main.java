

public class StuName implements Serializable {


	private static final long serialVersionUID = -6859744685824631220L;
	
	
	private String firstName;
	
	private String lastName;

	
	
	public StuName() {
		super();
	}


	

	public StuName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


	
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


	
	public String toString() {
		return String.format("%s, %s", firstName, lastName);
	}

	
	

}
