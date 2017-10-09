package com.project.second.entity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "compositions")
public class Compositions {
    @XmlElements({
        @XmlElement(name = "song", type = Song.class, required = true),
        @XmlElement(name = "dance", type = Dance.class, required = true)
    })
    protected List<JAXBElement<? extends MusicComposition>> composition;

    public List<JAXBElement<? extends MusicComposition>> getComposition() {
        if (composition == null) {
            composition = new ArrayList<>();
        }
        return this.composition;
    }
}

