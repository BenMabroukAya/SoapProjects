package org.soap.tp2;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
@WebService(serviceName ="BanqueWS")
public class BanqueService
{
    @WebMethod (operationName="ConversionEuroToDT")
    public double conversion (@WebParam(name="montant") double mt)
    {
        return mt*3.32;
    }
    @WebMethod
    public String test()
    {
        return "test";
    }
}