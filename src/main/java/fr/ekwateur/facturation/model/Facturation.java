package fr.ekwateur.facturation.model;

import java.math.BigDecimal;

public class Facturation {

    private BigDecimal montantFacture;

    public Facturation(BigDecimal montantFacture) {
        this.montantFacture = montantFacture;
    }

    public BigDecimal getMontantFacture() {
        return montantFacture;
    }
}
