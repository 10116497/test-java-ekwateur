package fr.ekwateur.facturation.exception;

public class ClientReferenceFormatException extends EkFacturationException {

    public ClientReferenceFormatException(String valeur) {
        super("La référence client %s est erronée".formatted(valeur));
    }


}
