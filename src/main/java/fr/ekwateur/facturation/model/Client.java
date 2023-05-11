package fr.ekwateur.facturation.model;

import fr.ekwateur.facturation.exception.ClientReferenceFormatException;

public abstract class Client {

    private String reference;

    protected Client(String reference) {
        if(reference == null || !reference.matches("EKW\\d{8}")) {
            throw new ClientReferenceFormatException(reference);
        }
        this.reference = reference;
    }

    public abstract TypeClient getTypeClient();

    public String getReference() {
        return reference;
    }
}
