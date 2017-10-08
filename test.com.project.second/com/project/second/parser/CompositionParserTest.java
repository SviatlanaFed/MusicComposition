package com.project.second.parser;


import com.project.second.exception.FileReadException;
import com.project.second.reader.CompositionReader;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CompositionParserTest {

    @Test
    public void compositionParserTest() throws FileReadException {
        CompositionReader reader=new CompositionReader();
        List<String> strings = reader.reader("resources/songs.txt");
        strings.stream().filter(new CompositionValidator()::validate).
            collect(Collectors.toList());
        List<List <String>> compos= new ArrayList<>();
        List<String> track=new ArrayList<>();
        for (int num=0;num<strings.size();num++) {
            if (!strings.get(num).equalsIgnoreCase(";")) {
                track.add(strings.get(num));


            } else {
                compos.add(track);
                track=new ArrayList<>();
            }
        }
        assert (compos!=null);
    }
}