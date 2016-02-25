package DOM;

public class Facteur {
    private String nom;
    private String importance;
    private String valeur;

    public Facteur(String nom, String importance, String valeur) {
        this.nom = nom;
        this.importance = importance;
        this.valeur = valeur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }
    
    
}
