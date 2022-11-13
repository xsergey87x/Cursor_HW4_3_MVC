package org.example.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.example.model.MusicTrack;

import java.util.ArrayList;

@ToString
@Data
public class RockPlayer {

    ArrayList<MusicTrack> rockTrackList = new ArrayList<>();

    public RockPlayer(ArrayList<MusicTrack> rockTrackList) {
        this.rockTrackList = rockTrackList;
    }

    public String playTrack(int numberTrack) {
        return "Now track number" + numberTrack + "is playing" + "Track information:  " + rockTrackList.get(numberTrack);
    }
}
