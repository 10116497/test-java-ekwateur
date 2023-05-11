package fr.ekwateur.facturation.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public enum TarifPart {
    TRANCHE_ELEC(TypeEnergie.ELECTRICITE, BigDecimal.valueOf(0.121)),
    TRANCHE_GAZ(TypeEnergie.GAZ, BigDecimal.valueOf(0.115));

    private TypeEnergie typeEnergie;

    private BigDecimal prix;


    TarifPart(TypeEnergie typeEnergie, BigDecimal prix) {
        this.typeEnergie = typeEnergie;
        this.prix = prix;
    }

    public static BigDecimal calculerMontant(TypeEnergie typeEnergie, Long consommation) {
        return Arrays.stream(TarifPart.values())
                .filter(t -> t.getTypeEnergie().equals(typeEnergie))
                .map( t -> t.getPrix().multiply(BigDecimal.valueOf(consommation)).setScale(2, RoundingMode.HALF_DOWN))
                .findFirst().get();

    }


    public TypeEnergie getTypeEnergie() {
        return typeEnergie;
    }

    public BigDecimal getPrix() {
        return prix;
    }


}
