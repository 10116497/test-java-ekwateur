package fr.ekwateur.facturation.model;

public class ClientParticulier extends Client {

    private Civilite civilite;

    private String nom;

    private String prenom;

    public ClientParticulier(String reference, String civilite, String nom, String prenom) {
        super(reference);
        this.civilite = Civilite.fromString(civilite);
        this.nom = nom;
        this.prenom = prenom;
    }

    public Civilite getCivilite() {
        return civilite;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public TypeClient getTypeClient() {
        return TypeClient.PART;
    }
}
