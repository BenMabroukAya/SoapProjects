package org.soap.tp2;
import jakarta.xml.ws.Endpoint;
import services.ProduitSWSoap;


public class ServeurJaxws {

    public static void main(String[] args) {
        String url = "http://192.168.31.194:8588/GP/ProduitSWSoap";
        String url2 = "http://192.168.31.194:8588/BanqueWS";
        Endpoint.publish(url, new ProduitSWSoap());
        System.out.println("Service Web publié à l'adresse : " + url + "?wsdl");
        Endpoint.publish(url2, new BanqueService());
        System.out.println("Service Web publié à l'adresse : " + url2 + "?wsdl");

}
}