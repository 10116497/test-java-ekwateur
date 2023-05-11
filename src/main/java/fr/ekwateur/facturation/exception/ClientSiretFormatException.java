package fr.ekwateur.facturation.exception;

public class ClientSiretFormatException extends EkFacturationException {

    public ClientSiretFormatException(String valeur) {
        super("Le SIRET %s est erronée".formatted(valeur));
    }


}
