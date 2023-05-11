package fr.ekwateur.facturation.model;

import fr.ekwateur.facturation.exception.ClientCiviliteUnknownException;

public enum Civilite {

    Mr,
    Mme;

    public static Civilite fromString(String valeur) {
        try {
            return Civilite.valueOf(valeur);
        } catch (IllegalArgumentException e) {
            throw new ClientCiviliteUnknownException(valeur);
        }
    }
}
