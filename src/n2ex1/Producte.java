package n2ex1;

public class Producte {
    private String nom;
    private Double preu;

    public Producte(String nom, Double preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public Double getPreu() {
        return preu;
    }

    @Override
    public String toString() {
        return "n2ex1.Producte{" +
                "nom='" + nom + '\'' +
                ", preu=" + preu +
                '}';
    }
}
