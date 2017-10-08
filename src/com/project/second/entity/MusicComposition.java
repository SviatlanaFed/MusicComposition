package com.project.second.entity;

public abstract class MusicComposition {
    private String title;
    private int durationSeconds;
    private String authorFirstName;
    private String authorLastName;
    private String country;
    private MusicStyle style;

    public MusicComposition(String title, int durationSeconds, String authorFirstName, String authorLastName, String country, MusicStyle style) {
        this.title = title;
        this.durationSeconds = durationSeconds;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.country = country;
        this.style = style;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String performerLastName) {
        this.authorLastName = authorLastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public MusicStyle getStyle() {
        return style;
    }

    public void setStyle(MusicStyle style) {
        this.style = style;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MusicComposition)) return false;

        MusicComposition that = (MusicComposition) o;

        if (getDurationSeconds() != that.getDurationSeconds()) return false;
        if (!getTitle().equals(that.getTitle())) return false;
        if (!getAuthorFirstName().equals(that.getAuthorFirstName())) return false;
        if (!getAuthorLastName().equals(that.getAuthorLastName())) return false;
        if (!getCountry().equals(that.getCountry())) return false;
        return getStyle() == that.getStyle();
    }

    @Override
    public int hashCode() {
        int result = getTitle().hashCode();
        result = 31 * result + getDurationSeconds();
        result = 31 * result + getAuthorFirstName().hashCode();
        result = 31 * result + getAuthorLastName().hashCode();
        result = 31 * result + getCountry().hashCode();
        result = 31 * result + getStyle().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "MusicComposition{" +
                "title='" + title + '\'' +
                ", durationSeconds=" + durationSeconds +
                ", authorFirstName='" + authorFirstName + '\'' +
                ", authorLastName='" + authorLastName + '\'' +
                ", country='" + country + '\'' +
                ", style=" + style +
                '}';
    }
}
