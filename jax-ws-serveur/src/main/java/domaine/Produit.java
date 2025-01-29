package domaine;
import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
public class Produit {
    @Override
    public String toString() {
        return "Produit [id=" + id + ", designation=" + designation + ", prix=" + prix + ", quantite=" + quantite + ", dateAchat=" + dateAchat + "]";
    }
    private Long id;
    private String designation;
    private double prix;
    private int quantite;
    private static final long serialVersionUID = 1L;
    private java.util.Date dateAchat;
    public java.util.Date getDateAchat() {
        return dateAchat;
    }
    public void setDateAchat(java.util.Date dateAchat) {
        this.dateAchat = dateAchat;
    }
    public Produit() {
        super();
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDesignation() {
        return this.designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return this.prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public int getQuantite() {
        return this.quantite;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}