package com.project.second.reader;

import com.project.second.exception.FileReadException;
import org.testng.annotations.Test;


import java.util.List;

import static org.testng.Assert.*;

public class CompositionReaderTest {
    @Test
    public void testReader() throws FileReadException {
        CompositionReader reader=new CompositionReader();
        List<String> strings = reader.reader("resources/songs.txt");
        assertTrue(strings.size()!=0);
    }

}