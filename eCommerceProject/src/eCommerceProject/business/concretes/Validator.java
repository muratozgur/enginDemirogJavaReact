package eCommerceProject.business.concretes;

import java.util.regex.Pattern;

public class Validator {
	public static boolean passwordVerifaction(String password) {
		return password.length() >= 6;
	}
	public static boolean eMailVerifaction(String eMail) {
		 final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
	        return EMAIL_REGEX.matcher(eMail).matches();
	}
	public static boolean nameverifaction(String firstName, String lastName) {
		return firstName.length() >= 2 && lastName.length() >= 2;
	}
}
