package com.project.second.parser;
import com.project.second.exception.DataNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CompositionParser {
    public List<List<String>> parse(List <String> composition) throws DataNotFoundException {
        if (composition!=null){
            List <String> validComposition=composition.stream().filter(new CompositionValidator()::validate).
                    collect(Collectors.toList());
            List<List <String>> compos= new ArrayList<>();
            List<String> track=new ArrayList<>();
            for (int num=0;num<validComposition.size();num++) {
                if (!validComposition.get(num).equalsIgnoreCase(";")) {
                    track.add(validComposition.get(num));
                }
                else{
                    compos.add(track);
                    track.clear();
                }
            }
            return compos;

        }
        else {
            throw new DataNotFoundException(" data not found");
        }

    }

}
