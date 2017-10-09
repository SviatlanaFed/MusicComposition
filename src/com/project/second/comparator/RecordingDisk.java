package com.project.second.comparator;

import com.project.second.entity.MusicComposition;
import java.util.Comparator;
import java.util.List;

public class RecordingDisk {
   public Integer calculateTheDuration(List <MusicComposition> musicCompositions){
        int sumDuration=0;
        for (MusicComposition music:musicCompositions) {
            sumDuration+=music.getDurationSeconds();
        }
       return sumDuration;
    }

    public  List <MusicComposition> compareToStyle(List <MusicComposition> musicCompositions,int durationFirst, int durationSecond){
       musicCompositions.sort(Comparator.comparing(MusicComposition::getStyle).thenComparing(MusicComposition::getTitle));
       return musicCompositions;
    }

    public  List <MusicComposition> compareToDuration(List <MusicComposition> musicCompositions,int durationFirst, int durationSecond){
        musicCompositions.stream().filter(track -> track.getDurationSeconds()>=durationFirst&&track.getDurationSeconds()<=durationSecond);
        return musicCompositions;
    }

}
