package com.project.second.creater;

import com.project.second.entity.Dance;
import com.project.second.entity.MusicComposition;
import com.project.second.entity.MusicStyle;
import com.project.second.entity.Song;
import com.project.second.exception.DataNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class CompositionCreater {
    public List <MusicComposition> createComp(List<List<String >> compos) throws DataNotFoundException {
        List<MusicComposition> musicCompositions = new ArrayList<>();
            for (List<String> track:compos ) {
            String compositionType = track.get(0);
            switch (compositionType) {
                case "song":
                    Song song=songCreate(track);
                    musicCompositions.add(song);
                    break;
                case "dance":
                    Dance dance=danceCreate(track);
                    musicCompositions.add(dance);
                    break;
                default:
                    throw new DataNotFoundException("no such argument");
            }
                return musicCompositions;
        }
        return musicCompositions;
    }

    private Dance danceCreate(List<String> track) {
        Dance dance=new Dance(track.get(1), Integer.parseInt(track.get(2)), track.get(3), track.get(4),
                track.get(5),MusicStyle.valueOf(track.get(8)));
        dance.setStyle(MusicStyle.valueOf(track.get(8)));
        dance.setMusicSize(Double.parseDouble(track.get(6)));
        dance.setCountryOfOrigin(track.get(7));
        return dance;
    }

    private Song songCreate(List<String> track) {
        Song song=new Song(track.get(1),Integer.parseInt(track.get(2)),track.get(3), track.get(4), track.get(5),MusicStyle.valueOf(track.get(9)));
        song.setStyle(MusicStyle.valueOf(track.get(9)));
        song.setSoundRecordingStudio(track.get(8));
        song.setPerformerFirstName(track.get(6));
        song.setPerformerLastName(track.get(7));
        return song;
    }
}
