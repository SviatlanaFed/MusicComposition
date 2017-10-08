package com.project.second.parser;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompositionValidator {
    boolean valid;
    private static final String SONG = "^song(\\s[\\w\\D]*)(\\s[\\d]*)(\\s[\\w]*)(\\s[\\w]*)(\\s[\\w]*)" +
            "(\\s[\\w]*){6}(\\s[\\w]*)(\\s[\\w\\D]*)(\\s[\\w]*)$";
    private static final String DANCE = "^dance(\\s[\\w\\D]*)(\\s[\\d]*)(\\s[\\w]*)(\\s[\\w]*)(\\s[\\w]*)" +
            "(\\s[.\\d]*)(\\s[\\w]*)(\\s[\\w]*)$";

    public boolean validate(String s){
        Pattern patternSong = Pattern.compile(SONG);
        Pattern patternDance = Pattern.compile(DANCE);
        Matcher matcherSong = patternSong.matcher(s);
        Matcher matcherDance = patternDance.matcher(s);
        if(matcherSong.matches()==true||matcherDance.matches()==true){
            valid=true;
        }
        return valid;
    }

}
