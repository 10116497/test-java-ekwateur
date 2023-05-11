package fr.ekwateur.facturation.model;

import fr.ekwateur.facturation.exception.ClientCiviliteUnknownException;
import fr.ekwateur.facturation.exception.ClientReferenceFormatException;
import fr.ekwateur.facturation.exception.ClientSiretFormatException;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class ClientParticulierTest {

    @Test
    public void whenCreationClient_andCiviliteEstInconnue_thenThrowException() {
        // given
        String reference = "EKW01020304";
        String civilite = "Aze";

        // when && then
        assertThrows(ClientCiviliteUnknownException.class, () -> {
            new ClientParticulier(reference, civilite, "Dupont", "Albert");
        });
    }

    @Test
    public void whenCreationClient_andToutesLesDonneesOk_thenClientCree() {
        // given
        String reference = "EKW01020304";
        String civilite = "Mr";

        // when
        ClientParticulier clientParticulier = new ClientParticulier(reference, civilite, "Dupont", "Albert");

        // then
        assertNotNull(clientParticulier);
        assertEquals("EKW01020304", clientParticulier.getReference());
    }



}
