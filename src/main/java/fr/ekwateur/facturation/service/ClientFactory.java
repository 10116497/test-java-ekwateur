package fr.ekwateur.facturation.service;

import fr.ekwateur.facturation.exception.ClientTypeUnknownException;
import fr.ekwateur.facturation.exception.EkFacturationException;
import fr.ekwateur.facturation.model.Client;
import fr.ekwateur.facturation.model.ClientParticulier;
import fr.ekwateur.facturation.model.ClientProfessionnel;
import fr.ekwateur.facturation.model.TypeClient;

import java.math.BigDecimal;

public class ClientFactory {

    public static Client createClient(TypeClient typeClient, String... args) {
        try {
            switch (typeClient) {
                case PRO -> {
                    return new ClientProfessionnel(args[0], args[1], args[2], Long.valueOf(args[3]));
                }
                case PART -> {
                    return new ClientParticulier(args[0], args[1], args[2], args[3]);
                }
                default -> throw new ClientTypeUnknownException("inconnu");
            }
        }catch (EkFacturationException e) {
            throw e;
        }catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

}
