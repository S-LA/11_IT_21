package unit_1;

public class EmailCheck {

	public static void main(String[] args) {
		
		String email = "khilder@gmail.com";
		String phone = "0829203898";
		String name = "Kurt Hilder";
		// find the user name of the email address
		// find the email provider
		// check if phone number has 10 digits.
		// split name into first and last(uppercase).
		
		// CODE GOES HERE
		int atPos = email.indexOf("@");
		
		String username = email.substring(0,atPos);
		
		String onlyemail = email.substring(atPos+1, email.indexOf("."));
		
		boolean numCorrect = false;
		if(phone.length()==10) {
			numCorrect  = true;
		} 
		
		for(int i = 0; i < phone.length();i++) {
			char digit = phone.charAt(i);
			if(!Character.isDigit(digit)) {
				numCorrect = false;
			}
			
		}
		
		String firstname  = name.substring(0, name.indexOf(" "));
		String lastname = name.substring(name.indexOf(" ")+1);
		
		
		
		// print out
		System.out.println("UserName: " + username);
		System.out.println("EmailSer: " + onlyemail);
		System.out.println("ValidNum: " + numCorrect);
		System.out.println("FirstNam: " + firstname);
		System.out.println("LastName: " + lastname.toUpperCase());
		
		

	}

}
