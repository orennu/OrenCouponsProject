
public class Client {
	
	int VALID_ID_LENGTH = 9;
	int VALID_PHONE_LENGTH = 10;
	
	private String firstName, lastName, email, id, phoneNumber;
	
	public Client(String firstName, String lastName, String email, String id, String phoneNumber) {
		
		this.firstName = firstName;
		this.lastName = lastName;		
		
		if (isValidEmail(email)) {
			this.email = email;
		}
		
		if (isValidId(id)) {
			this.id = id;
		}
		
		if (isValidPhoneNumber(phoneNumber)) {
			this.phoneNumber = phoneNumber;
		}
	}
	
	public String getClientInfo() {
		String clientInfo = "Dear Customer ,\n\nBelow are your details as provided by you:\n"
				+ "\nFull Name: " + this.firstName + " " + this.lastName
				+ "\nEmail address: " + this.email
				+ "\nID: " + this.id
				+ "\nPhone number: " + this.phoneNumber;
		
		String clientInfoError = "Dear Customer ,\n\n Some of the details you provded could not"
				+ "be processed, please submit application form again and contact us if you encounter"
				+ "any issue.";
		
		if (firstName != null) {
			if (lastName != null) {
				if (email != null) {
					if (id != null) {
						if (phoneNumber != null) {
							return clientInfo;
						}
					}
				}
			}
		}

		return clientInfoError;
	}
	private boolean isValidEmail(String email) {
		
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		return email.matches(regex);
	}
	
	private boolean isValidPhoneNumber(String phoneNumber) {
		return isValidLength(phoneNumber, VALID_PHONE_LENGTH);
	}
	
	private boolean isValidId(String id) {
		return isValidLength(id, VALID_ID_LENGTH);
	}
	
	private boolean isValidLength(String string, int len) {
		return string.length() == len;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (isValidEmail(email)) {
			this.email = email;
		}
		else {
			System.out.println("You entered invalid email");
		}
			
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		if (isValidPhoneNumber(phoneNumber)) {
			this.id = phoneNumber;
		}
		else {
			System.out.println("You entered invalid phone number");
		}
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		if (isValidId(id)) {
			this.id = id;
		}
		else {
			System.out.println("You entered invalid ID");
		}
	}	
}
