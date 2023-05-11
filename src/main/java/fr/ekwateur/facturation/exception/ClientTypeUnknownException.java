package fr.ekwateur.facturation.exception;

public class ClientTypeUnknownException extends EkFacturationException {

    public ClientTypeUnknownException(String valeur) {
        super("Le type de client %s est inconnu".formatted(valeur));
    }


}
