package com.project.second.creater;

import com.project.second.entity.Compositions;
import com.project.second.entity.Dance;
import com.project.second.entity.MusicComposition;
import com.project.second.entity.MusicStyle;
import com.project.second.entity.Song;
import com.project.second.exception.DataNotFoundException;

import com.project.second.parser.CompositionValidator;
import com.project.second.reader.CompositionReader;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CompositionCreaterTest {
    @Test
    public void testCreateComp() throws Exception {
        CompositionReader reader = new CompositionReader();
        List<String> strings = reader.reader("resources/songs.txt");
        strings.stream().filter(new CompositionValidator()::validate).
                collect(Collectors.toList());
        List<List<String>> compos = new ArrayList<>();
        List<String> track = new ArrayList<>();
        for (int num = 0; num < strings.size(); num++) {
            if (!strings.get(num).equalsIgnoreCase(";")) {
                track.add(strings.get(num));
            } else {
                compos.add(track);
                track = new ArrayList<>();
            }
        }
        List<MusicComposition> musicCompositions = new ArrayList<>();
        for (List<String> strings1 : compos) {
            String compositionType = strings1.get(0);
            switch (compositionType) {
                case "song":
                    Song song = new Song(strings1.get(1), Integer.parseInt(strings1.get(2)), strings1.get(3), strings1.get(4), strings1.get(5),MusicStyle.valueOf(strings1.get(9)));
                   musicCompositions.add(song);
                    break;
                case "dance":
                    Dance dance = new Dance(strings1.get(1), Integer.parseInt(strings1.get(2)), strings1.get(3), strings1.get(4),
                    strings1.get(5),MusicStyle.valueOf(strings1.get(8)));
                    musicCompositions.add(dance);
                    break;
                default:
                    throw new DataNotFoundException("no such argument");
            }
        }
        assert(musicCompositions.size()!=0);
    }

    @Test
    public void testCreateCompXml() throws Exception {
        CompositionCreater creater = new CompositionCreater();
        Compositions compositions = creater.createCompXml();
        assert(compositions.getComposition().size()==3);
    }
}