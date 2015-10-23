package compose.findMany;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GoogleKeywords {

	/**
	 * Capture all the keywords entered by a google user using the url search
	 * string (as a single group). After some unspecified suffix, the string
	 * must contain "www.google.com" followed by any characters. Then the string
	 * must have "q=". Capture everything after the "q=".
	 * 
	 */
	public List<String> captureKeywords(String content) {
		List<String> keywords = new LinkedList<String>();

		// TODO compose a regex to complete the challenge
		//String regex = "";
		String regex = "(http|https):\\/\\/(www.){0,1}google.com[.]q=";
		// (http|https):\/\/(www.){0,1}google.[a-z.]+\/url\?sa=t&rct=j&q=&esrc=s&source=web&cd=10&ved=0CHoQFjAJ
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(content);
		while (matcher.find()) {
			keywords.add(matcher.group(1));
		}
		
		return keywords;
	}
}
