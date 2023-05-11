package fr.ekwateur.facturation.model;

import fr.ekwateur.facturation.exception.ClientReferenceFormatException;
import fr.ekwateur.facturation.exception.ClientSiretFormatException;

import java.math.BigDecimal;

public class ClientProfessionnel extends Client {

    private String siret;

    private String raisonSociale;

    private Long ca;

    public ClientProfessionnel(String reference, String siret, String raisonSociale, Long ca) {
        super(reference);
        if(siret == null || !siret.matches("\\d{9}")) {
            throw new ClientSiretFormatException(siret);
        }
        this.siret = siret;
        this.raisonSociale = raisonSociale;
        this.ca = ca;
    }

    public String getSiret() {
        return siret;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public Long getCa() {
        return ca;
    }
    @Override
    public TypeClient getTypeClient() {
        return TypeClient.PRO;
    }

}
