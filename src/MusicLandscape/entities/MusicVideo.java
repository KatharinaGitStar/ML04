package MusicLandscape.entities;

public class MusicVideo extends Release {
    private Track track;

    public MusicVideo() {
    }

    public Track getTrack(){
        return track;
    }
    public void setTrack(Track track){
        this.track = track;
    }
    public int totalTime(){
        return track.getDuration();
    }
    public String toString(){
        //adds -Video to the string representation of a general release
        String baseString = super.toString();
        return String.format("%s-%s", baseString, new MusicVideo());
    }
}
