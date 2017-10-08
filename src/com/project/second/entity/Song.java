package com.project.second.entity;

public class Song extends MusicComposition{
    private String performerFirstName;
    private String performerLastName;
    private String soundRecordingStudio;


    public Song(String title, int durationSeconds, String authorFirstName, String authorLastName, String country, MusicStyle style) {
        super(title, durationSeconds, authorFirstName, authorLastName, country, style);
    }
     public Song(String title, int durationSeconds, String authorFirstName, String authorLastName, String country, MusicStyle style, String performerFirstName, String performerLastName, String soundRecordingStudio) {
            super(title, durationSeconds, authorFirstName, authorLastName, country, style);
            this.performerFirstName = performerFirstName;
            this.performerLastName = performerLastName;
            this.soundRecordingStudio = soundRecordingStudio;
        }



    public String getPerformerFirstName() {
        return performerFirstName;
    }

    public void setPerformerFirstName(String performerFirstName) {
        this.performerFirstName = performerFirstName;
    }

    public String getPerformerLastName() {
        return performerLastName;
    }

    public void setPerformerLastName(String performerLastName) {
        this.performerLastName = performerLastName;
    }

    public String getSoundRecordingStudio() {
        return soundRecordingStudio;
    }

    public void setSoundRecordingStudio(String soundRecordingStudio) {
        this.soundRecordingStudio = soundRecordingStudio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        if (!super.equals(o)) return false;

        Song song = (Song) o;

        if (!getPerformerFirstName().equals(song.getPerformerFirstName())) return false;
        if (!getPerformerLastName().equals(song.getPerformerLastName())) return false;
        return getSoundRecordingStudio().equals(song.getSoundRecordingStudio());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getPerformerFirstName().hashCode();
        result = 31 * result + getPerformerLastName().hashCode();
        result = 31 * result + getSoundRecordingStudio().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Song{" +
                "performerFirstName='" + performerFirstName + '\'' +
                ", performerLastName='" + performerLastName + '\'' +
                ", soundRecordingStudio='" + soundRecordingStudio + '\'' +
                '}';
    }
}
