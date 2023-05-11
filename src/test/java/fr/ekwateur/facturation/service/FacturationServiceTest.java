package fr.ekwateur.facturation.service;

import fr.ekwateur.facturation.model.ClientParticulier;
import fr.ekwateur.facturation.model.ClientProfessionnel;
import fr.ekwateur.facturation.model.Facturation;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacturationServiceTest {

    private FacturationService service = new FacturationService();

    @Test
    public void whenClientParticulier_thenReturnMontantAFacturer() {
        // given
        ClientParticulier clientParticulier = new ClientParticulier("EKW01020304", "Mr", "Dupont", "Albert");
        Long consommationElectricite = 1000L;
        Long consommationGaz = 2000L;


        // when
        Facturation facturation = service.calculerFacturation(clientParticulier, consommationElectricite, consommationGaz);

        // then
        assertEquals(BigDecimal.valueOf(351).setScale(2, RoundingMode.HALF_DOWN), facturation.getMontantFacture());
    }


    @Test
    public void whenClientPro_andCAInferieur1000000_thenReturnMontantAFacturer() {
        // given
        ClientProfessionnel clientProfessionnel = new ClientProfessionnel("EKW01020304", "123456789", "abc", 10L);
        Long consommationElectricite = 1000L;
        Long consommationGaz = 2000L;


        // when
        Facturation facturation = service.calculerFacturation(clientProfessionnel, consommationElectricite, consommationGaz);

        // then
        assertEquals(BigDecimal.valueOf(344).setScale(2, RoundingMode.HALF_DOWN), facturation.getMontantFacture());
    }

    @Test
    public void whenClientPro_andCASuperieur1000000_thenReturnMontantAFacturer() {
        // given
        ClientProfessionnel clientProfessionnel = new ClientProfessionnel("EKW01020304", "123456789", "abc", 10000000000L);
        Long consommationElectricite = 1000L;
        Long consommationGaz = 2000L;


        // when
        Facturation facturation = service.calculerFacturation(clientProfessionnel, consommationElectricite, consommationGaz);

        // then
        assertEquals(BigDecimal.valueOf(336).setScale(2, RoundingMode.HALF_DOWN), facturation.getMontantFacture());
    }
}
