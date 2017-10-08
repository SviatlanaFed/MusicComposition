package com.project.second.entity;

public class Dance extends MusicComposition {
    private double musicSize;
    private String countryOfOrigin;

    public Dance(String title, int durationSeconds, String authorFirstName, String authorLastName, String country, MusicStyle style) {
        super(title, durationSeconds, authorFirstName, authorLastName, country, style);
    }

    public Dance(String title, int durationSeconds, String authorFirstName, String authorLastName, String country, MusicStyle style, double musicSize, String countryOfOrigin) {
        super(title, durationSeconds, authorFirstName, authorLastName, country, style);
        this.musicSize = musicSize;
        this.countryOfOrigin = countryOfOrigin;
    }

    public double getMusicSize() {
        return musicSize;
    }

    public void setMusicSize(double musicSize) {
        this.musicSize = musicSize;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dance)) return false;
        if (!super.equals(o)) return false;

        Dance dance = (Dance) o;

        if (Double.compare(dance.getMusicSize(), getMusicSize()) != 0) return false;
        return getCountryOfOrigin().equals(dance.getCountryOfOrigin());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(getMusicSize());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getCountryOfOrigin().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Dance{" +
                "musicSize=" + musicSize +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                '}';
    }
}
