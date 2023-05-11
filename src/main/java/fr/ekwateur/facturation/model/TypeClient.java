package fr.ekwateur.facturation.model;

import fr.ekwateur.facturation.exception.ClientCiviliteUnknownException;

public enum TypeClient {

    PRO,
    PART;


    public static TypeClient fromString(String valeur) {
        try {
            return TypeClient.valueOf(valeur);
        } catch (IllegalArgumentException e) {
            throw new ClientCiviliteUnknownException(valeur);
        }
    }

}
