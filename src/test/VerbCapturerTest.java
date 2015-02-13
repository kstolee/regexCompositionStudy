package test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.BeforeClass;
import org.junit.Test;

import composition.VerbCapturer;

public class VerbCapturerTest {
	private static VerbCapturer verbCapturer = null;
	
    @BeforeClass public static void onlyOnce() {
        verbCapturer = new VerbCapturer();
     }

	@Test
	public void testFindsVerbs1() {
		//http://web.archive.org/web/20050207034920/http://www.eldritchpress.org/lh/diplo.html
		String ghostStory1 = "It was only my very great stupidity which caused the fault. Having been born stupid, by reason of my karma, I could not always help making mistakes. But to kill a man for being stupid is wrong--and that wrong will be repaid. So surely as you kill me, so surely shall I be avenged;--out of the resentment that you provoke will come the vengeance; and evil will be rendered for evil.";
		List<String> verbsInGhostStory1 = Arrays.asList("Hav","mak","be");
		
		List<String> verbsCapturedFromGhostStory1 = verbCapturer.captureVerbs(ghostStory1);
		assertThat(verbsCapturedFromGhostStory1, is(verbsInGhostStory1));
	}

	
	@Test
	public void testFindsVerbs2() {
		//http://web.archive.org/web/20050207034920/http://www.eldritchpress.org/lh/diplo.html
		String allVerbs = "eating drinking seeing being looking creating destroying searching knowing parting swimming running kicking peeking writing programming composing finding";
		List<String> prefixes = Arrays.asList("eat","drink","see","be","look","creat","destroy","search","know","part","swimm","runn","kick","peek","writ","programm","compos","find");
		
		List<String> prefixesFromAllVerbs = verbCapturer.captureVerbs(allVerbs);
		assertThat(prefixesFromAllVerbs, is(prefixes));
	}

	
	@Test
	public void testTrickyVerbs() {
		//http://web.archive.org/web/20050207034920/http://www.eldritchpress.org/lh/diplo.html
		String trickyWords = "Singing, cringing";
		List<String> verbsFromTrickyWords = Arrays.asList("Sing","cring");
		
		List<String> verbsCaptured = verbCapturer.captureVerbs(trickyWords);
		assertThat(verbsCaptured, is(verbsFromTrickyWords));
	}

	
	@Test
	public void testNoIngWordsFound() {
		//http://web.archive.org/web/20050207034920/http://www.eldritchpress.org/lh/diplo.html
		String noIngWords = "Vegatables";
		List<String> nothing = Arrays.asList();
		
		List<String> verbsCaptured = verbCapturer.captureVerbs(noIngWords);
		assertThat(verbsCaptured, is(nothing));
	}

}
