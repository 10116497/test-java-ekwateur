package fr.ekwateur.facturation;

import fr.ekwateur.facturation.model.Client;
import fr.ekwateur.facturation.model.Facturation;
import fr.ekwateur.facturation.model.TypeClient;
import fr.ekwateur.facturation.service.ClientFactory;
import fr.ekwateur.facturation.service.FacturationService;

public class Main {

    /**
     * Arguments à renseigner :
     *
     * 0 : client type (PRO/PART)
     * 1 à 3 : client informations (Siret, Raison Sociale, CA / Civilité, Nom, Prénom)
     * 4 : Consommation Electricité
     * 5 : Consommation Gaz
     *
     * Exemple d'arguments :
     *  Client Particulier : PART EKW03030404 Mr Charbonneau Antoine 123 45
     *  Client Pro 1 : PRO EKW03030404 123456781 Pme 100000 7500 13000
     *  Client Pro 2 : PRO EKW03030404 123456791 Groupe 12365478912 45000 56000
     */
    public static void main(String[] args) {
        if(args.length != 7) {
            throw new IllegalArgumentException("nombre d'arguments erronés");
        }
        Client client = ClientFactory.createClient(TypeClient.fromString(args[0]), args[1], args[2], args[3], args[4]);
        FacturationService facturationService = new FacturationService();
        Facturation facturation = facturationService.calculerFacturation(client, Long.valueOf(args[5]), Long.valueOf(args[6]));

        System.out.println("Le montant à facturer est de %s".formatted(facturation.getMontantFacture()));
    }
}
