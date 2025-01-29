package org.soa.oxm.tpoxm;
import java.io.File;
import java.util.Date;
import org.soa.oxm.tpoxm.TypeCompte;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;



public class TestSerialisation {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Banque.class);
        Banque banque = new Banque();
        banque.comptes.add(new Compte(1, 3200, new Date(), TypeCompte.EPARGNE));
        banque.comptes.add(new Compte(2, 400, new Date(), TypeCompte.COURANT));
        banque.comptes.add(new Compte(3, 500, new Date(), TypeCompte.EPARGNE));

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(banque, new File("comptes.xml"));
    }
}
