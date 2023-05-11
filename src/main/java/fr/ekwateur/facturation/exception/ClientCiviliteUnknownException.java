package fr.ekwateur.facturation.exception;

public class ClientCiviliteUnknownException extends EkFacturationException {

    public ClientCiviliteUnknownException(String valeur) {
        super("La civilité %s est inconnue".formatted(valeur));
    }


}
