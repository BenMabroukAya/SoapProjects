package services;
import domaine.Produit;
import jakarta.jws.WebService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@WebService(serviceName ="ProduitSWSoap")
public class ProduitSWSoap implements ProduitSWSoapInterface{
    private HashMap<Long, Produit> listeProduits = new HashMap<>();

    @Override
    public Produit addProduit(Produit p) {
        if (p != null && p.getId() != null) {
            listeProduits.put(p.getId(), p);
        }
        return p;

    }

    @Override
    public Produit updateProduit(Produit p) {
        if (p != null && p.getId() != null &&
                listeProduits.containsKey(p.getId())) {
            listeProduits.put(p.getId(), p);
        }
        return p;
    }

    @Override
    public void deleteProduit(Long id) {
        listeProduits.remove(id);
    }

    @Override
    public Produit getProduit(Long id) {
        return listeProduits.get(id);
    }

    @Override
    public List<Produit> getAllProduits() {
        return new ArrayList<>(listeProduits.values());
    }
}