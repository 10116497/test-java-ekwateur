package fr.ekwateur.facturation.model;

import java.math.BigDecimal;
import java.util.Arrays;

public enum TarifPro {
    TRANCHE_ELEC_1(TypeEnergie.ELECTRICITE, BigDecimal.valueOf(0.118), 0L, 10000000L),
    TRANCHE_ELEC_2(TypeEnergie.ELECTRICITE, BigDecimal.valueOf(0.114), 10000000L, null),
    TRANCHE_GAZ_1(TypeEnergie.GAZ, BigDecimal.valueOf(0.113), 0L, 10000000L),
    TRANCHE_GAZ_2(TypeEnergie.GAZ, BigDecimal.valueOf(0.111), 10000000L, null);

    private TypeEnergie typeEnergie;

    private BigDecimal prix;

    private Long caMinimum;
    private Long caMaximum;


    TarifPro(TypeEnergie typeEnergie, BigDecimal prix, Long caMinimum, Long caMaximum) {
        this.typeEnergie = typeEnergie;
        this.prix = prix;
        this.caMinimum = caMinimum;
        this.caMaximum = caMaximum;
    }

    public static BigDecimal calculerMontant(TypeEnergie typeEnergie, ClientProfessionnel pro, Long consommation) {
        return Arrays.stream(TarifPro.values())
                .filter(t -> t.getTypeEnergie().equals(typeEnergie))
                .filter(t -> t.getCaMinimum() < pro.getCa() && (t.getCaMaximum() == null || t.getCaMaximum() > pro.getCa()))
                .map( t -> t.getPrix().multiply(BigDecimal.valueOf(consommation)))
                .findFirst().get();

    }


    public TypeEnergie getTypeEnergie() {
        return typeEnergie;
    }

    public BigDecimal getPrix() {
        return prix;
    }

    public Long getCaMinimum() {
        return caMinimum;
    }

    public Long getCaMaximum() {
        return caMaximum;
    }


}
