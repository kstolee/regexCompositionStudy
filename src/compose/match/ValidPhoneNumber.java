package compose.match;

import java.util.regex.Pattern;

public class ValidPhoneNumber {

	/**
	 * A line of text will contain at most one newline and only then at the end
	 * of the string (this input will not have multiple lines).
	 * 
	 * This function should take one line of text and verify that the entire
	 * string is composed of one valid phone number. Extra characters like
	 * whitespace before or after, or anything that would invalidate the phone
	 * number are not allowed (except newline at the end). A valid phone number
	 * for our purposes has 10 digits, which may be separated by dashes, spaces,
	 * or other familiar means (see test cases for the exact cases to match).
	 * 
	 */
	public boolean isValidPhoneNumber(String line) {

		// TODO compose a regex to complete the challenge
//		String regex = "\+\d(-\d{3}){2}-\d{4}";
		String regex = "\\d\\d\\d\\d\\d\\d([,\\s])?\\d\\d\\d\\d";
//		String regex = "^(\+\d{1,2}\s)?\(?\d{3}\)?[\s.-]\d{3}[\s.-]\d{4}$";
//		String regex ="^\s*(?:\+?(\d{1,3}))?[-. (]*(\d{3})[-. )]*(\d{3})[-. ]*(\d{4})(?: *x(\d+))?\s*$";
		return Pattern.matches(regex, line);
	}
}
