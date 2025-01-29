package services;
import domaine.Produit;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;

@WebService (serviceName ="ProduitSWSoap")
public interface ProduitSWSoapInterface {
    @WebMethod
    public Produit addProduit(@WebParam(name = "produit")Produit
                                      p);
    @WebMethod
    public Produit updateProduit(@WebParam(name =
            "produit")Produit p);
    @WebMethod
    public void deleteProduit(@WebParam(name = "id")Long id);
    @WebMethod
    public Produit getProduit(@WebParam(name = "id")Long id);
    @WebMethod
    public List<Produit> getAllProduits();
}