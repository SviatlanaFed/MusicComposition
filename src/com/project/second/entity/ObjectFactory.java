package com.project.second.entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {
    private final static QName _SONG_QNAME = new QName("song");
    private final static QName _DANCE_QNAME = new QName("dance");
    private final static QName _COMPOSITION_QNAME = new QName("composition");

    public ObjectFactory() {
    }
    public Compositions createStudents() {
        return new Compositions();
    }

    public Song createSong() {
        return new Song();
    }
    public Dance createDance() {
        return new Dance();
    }

    public MusicComposition createMusicComposition() {
        return new MusicComposition();
    }

    @XmlElementDecl(name = "song")
    public JAXBElement<Song> createSong(Song value) {
        return new JAXBElement<>(_SONG_QNAME, Song.class, null, value);
    }

    @XmlElementDecl(name = "dance")
    public JAXBElement<Dance> createDance(Dance value) {
        return new JAXBElement<>(_DANCE_QNAME, Dance.class, null, value);
    }

    @XmlElementDecl(name = "composition")
    public JAXBElement<MusicComposition> createComposition(MusicComposition value) {
        return new JAXBElement<>(_COMPOSITION_QNAME, MusicComposition.class, null, value);
    }

}
