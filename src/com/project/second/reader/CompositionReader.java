package com.project.second.reader;

import java.io.IOException;
import com.project.second.exception.FileReadException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;



public class CompositionReader {

    public List<String> reader(String fileName) throws FileReadException   {
        List <String> composition = null;
        try{
            composition=Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8) ;}
        catch (IOException e) {
            new FileReadException("file not found");
            e.printStackTrace();
        }
        if (composition.isEmpty()){
            throw new FileReadException ("file is empty");
        }

        return composition;

    }



}

