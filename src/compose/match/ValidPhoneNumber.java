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
	 * number are not allowed (except newline at the end). For our purposes, we
	 * only accept phone numbers with dashes like: ###-###-####
	 * 
	 */
	public boolean isValidPhoneNumber(String line) {

		// TODO compose a regex to complete the challenge
		String regex = "([\\d]{3}|\\([\\d]{3}\\))[- ]?[\\d]{3}[- ]?[\\d]{4}";
		return Pattern.matches(regex, line);
	}
}
