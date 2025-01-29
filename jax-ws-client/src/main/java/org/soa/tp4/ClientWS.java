package org.soa.tp4;

public class ClientWS {
    public static <BanqueService> void main(String[] args)
    {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.conversionEuroToDT(20.0));
    }
}