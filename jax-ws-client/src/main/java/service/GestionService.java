package service;

import model.Compte;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.List;

@WebService(serviceName ="GestionWS")
public class GestionService
{
    @WebMethod(operationName="getCompte")
    public Compte getCompte(@WebParam(name="code") int codeCompte)
    {
        return new Compte (codeCompte, Math.random()*9000);
    }
    @WebMethod(operationName="listComptes")
    public List<Compte> getComptes()
    {
        List<Compte> cptes = new ArrayList<Compte>();
        for (int i=0; i<5;i++)
        {
            cptes.add(new Compte(i, Math.random()*6000));
        }
        return cptes;
    }
}