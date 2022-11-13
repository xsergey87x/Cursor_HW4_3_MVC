package org.example.service;

import lombok.Data;
import lombok.ToString;
import org.example.model.MusicTrack;

import java.util.ArrayList;

@ToString
@Data
public class ClassicPlayer {

    ArrayList<MusicTrack> classicTrackList = new ArrayList<>();

    public ClassicPlayer(ArrayList<MusicTrack> classicTrackList) {
        this.classicTrackList = classicTrackList;
    }

    public String playTrack(int numberTrack) {
        return "Now track number" + numberTrack + "is playing" + "Track information:  " + classicTrackList.get(numberTrack);
    }
}
