package org.soa.tp6.jaxrsarc;
public interface PersonneService {
    public Reponse ajouterPersonne(Personne p);
    public Reponse supprimerPersonne(int id);
    public Personne getPersonne(int id);
    public Personne[] getAllPersonnes();
    public Reponse updatePersonne(Personne p);
}