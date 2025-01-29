package org.soa.tp6.jaxrsarcclient;
import jakarta.xml.bind.annotation.*;
@XmlRootElement(name = "personne")
@XmlAccessorType(XmlAccessType.FIELD)
public class Personne {
    @XmlElement(name = "id")
    private int id;
    @XmlElement(name = "nom")
    private String nom;
    @XmlElement(name = "age")
    private int age;
    public Personne() {}
    public Personne(int id, String nom, int age) {
        this.id = id;
        this.nom = nom;
        this.age = age;
    }

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}