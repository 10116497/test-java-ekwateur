package fr.ekwateur.facturation.model;

import fr.ekwateur.facturation.exception.ClientReferenceFormatException;
import fr.ekwateur.facturation.exception.ClientSiretFormatException;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class ClientProfessionnelTest {

    @Test
    public void whenCreationClient_andReferencePrefixeEstFaux_thenThrowException() {
        // given
        String reference = "EPW01020304";
        String siret = "123456789";

        // when && then
        assertThrows(ClientReferenceFormatException.class, () -> {
            new ClientProfessionnel(reference, siret, "abc", 10L);
        });
    }

    @Test
    public void whenCreationClient_andReferenceSuffixeLongueurEstFaux_thenThrowException() {
        // given
        String reference = "EKW010203";
        String siret = "123456789";

        // when && then
        assertThrows(ClientReferenceFormatException.class, () -> {
            new ClientProfessionnel(reference, siret, "abc", 10L);
        });
    }


    @Test
    public void whenCreationClient_andSiretEstFaux_thenThrowException() {
        // given
        String reference = "EKW01020304";
        String siret = "123456qs9";

        // when && then
        assertThrows(ClientSiretFormatException.class, () -> {
            new ClientProfessionnel(reference, siret, "abc", 10L);
        });
    }

    @Test
    public void whenCreationClient_andToutesLesDonneesOk_thenClientCree() {
        // given
        String reference = "EKW01020304";
        String siret = "123456789";

        // when
        ClientProfessionnel clientProfessionnel = new ClientProfessionnel(reference, siret, "abc", 10L);

        // then
        assertNotNull(clientProfessionnel);
        assertEquals("EKW01020304", clientProfessionnel.getReference());
    }



}
