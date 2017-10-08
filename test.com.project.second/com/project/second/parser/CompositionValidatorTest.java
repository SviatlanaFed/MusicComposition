package com.project.second.parser;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.testng.Assert.*;

public class CompositionValidatorTest {
    String s="song TOO MUCH LOVE WILL KILL YOU 257 Brian Harold May Great Britain Spike Edney Brian Harold May Parlophone Records,Hollywood Records POPULAR";
    private static final String SONG = "^song(\\s[\\w\\D]*)(\\s[\\d]*)(\\s[\\w]*)(\\s[\\w]*)(\\s[\\w]*)" +
            "(\\s[\\w]*)(\\s[\\w]*)(\\s[\\w\\D]*)(\\s[\\w]*)$";
    private static final String DANCE = "^dance(\\s[\\w\\D]*)(\\s[\\d]*)(\\s[\\w]*)(\\s[\\w]*)(\\s[\\w]*)" +
            "(\\s[.\\d]*)(\\s[\\w]*)(\\s[\\w]*)$";
    @Test
    public void testValidate() throws Exception {
        Pattern patternSong = Pattern.compile(SONG);
        Pattern patternDance = Pattern.compile(DANCE);
        Matcher matcherSong = patternSong.matcher(s);
        Matcher matcherDance = patternDance.matcher(s);
        assertTrue(matcherSong.matches()||matcherDance.matches());
    }

}