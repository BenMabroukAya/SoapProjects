package org.soa.jaxrs.banquesjaxrs;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.soa.jaxrs.banquesjaxrs.Compte;

@Path("/api/banque")
public class BanqueRestService {
    @GET
    @Path("/conversion/{montant}")
    @Produces(MediaType.APPLICATION_JSON)
    public double conversion(@PathParam(value = "montant") double mt){
        return mt*3;
    }
    @GET
    @Path("/conversion/{montant}")
    @Produces(MediaType.APPLICATION_JSON)
    public org.soa.jaxrs.banquesjaxrs.Compte getCompte(int code){
        return new Compte(code,Math.random()*67500,new Date());
    }
    @GET
    @Path("/comptes")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Compte> listcomptes(){
        List<Compte> list = new ArrayList<>();
        list.add(new Compte(1,Math.random()*67500,new Date()));
        list.add(new Compte(2,Math.random()*67500,new Date()));
        list.add(new Compte(3,Math.random()*67500,new Date()));
        return list;
    }
}