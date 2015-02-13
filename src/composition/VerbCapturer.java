package composition;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerbCapturer {

	public VerbCapturer() {
		// empty constructor
	}

	public List<String> captureVerbs(String content) {
		List<String> verbs = new LinkedList<String>();

		// TODO - regex composer fills this in instead of me

		Pattern p = Pattern.compile("\\s?([a-zA-Z]+)(?:ing)",Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(content);
	    while (m.find()) {
	      verbs.add(m.group(1));
	    }
		return verbs;
	}

}
