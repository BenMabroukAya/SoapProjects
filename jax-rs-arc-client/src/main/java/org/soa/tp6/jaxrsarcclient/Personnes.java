package org.soa.tp6.jaxrsarcclient;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;
@XmlRootElement(name = "personnes")
@XmlAccessorType(XmlAccessType.FIELD)
public class Personnes {
    @XmlElement(name = "personne")
    private List<Personne> personnes;
    // Getters et Setters
    public List<Personne> getPersonnes() {
        return personnes;
    }
    public void setPersonnes(List<Personne> personnes) {
        this.personnes = personnes;
    }
}