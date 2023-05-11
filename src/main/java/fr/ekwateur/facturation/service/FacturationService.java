package fr.ekwateur.facturation.service;

import fr.ekwateur.facturation.model.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FacturationService {

    public Facturation calculerFacturation(Client client, Long consommationElectricite, Long consommationGaz) {
        switch (client.getTypeClient()) {
            case PART ->  {
                BigDecimal montantElec =  TarifPart.calculerMontant(TypeEnergie.ELECTRICITE, consommationElectricite);
                BigDecimal montantGaz =  TarifPart.calculerMontant(TypeEnergie.GAZ, consommationGaz);
                return new Facturation(montantElec.add(montantGaz).setScale(2, RoundingMode.HALF_DOWN));
            }
            case PRO ->  {
                BigDecimal montantElec =  TarifPro.calculerMontant(TypeEnergie.ELECTRICITE, (ClientProfessionnel) client, consommationElectricite);
                BigDecimal montantGaz =  TarifPro.calculerMontant(TypeEnergie.GAZ, (ClientProfessionnel) client, consommationGaz);
                return new Facturation(montantElec.add(montantGaz).setScale(2, RoundingMode.HALF_DOWN));
            }
            default -> throw new IllegalArgumentException("Type de client inconnu");
        }
    }
}
