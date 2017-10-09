package com.project.second.reader;

import java.io.IOException;
import com.project.second.exception.FileReadException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;



public class CompositionReader {
    private static final Logger LOGGER = LogManager.getLogger();

    public List<String> reader(String fileName) throws FileReadException   {
        List <String> composition = null;
        try{
            composition=Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8) ;}
        catch (IOException e) {
            new FileReadException("file not found");
            LOGGER.log(Level.FATAL,"file not found");
        }
        if (composition.isEmpty()){
            throw new FileReadException ("file is empty");
        }

        return composition;

    }



}

