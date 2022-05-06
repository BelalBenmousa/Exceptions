package n2ex1;

import java.util.Collection;

public class Venda {
    private Collection<Producte> productes;
    private Double preuTotalVenda;

    public Venda(Collection<Producte> productes) {
        this.productes = productes;
    }

    public Collection<Producte> getProductes() {
        return productes;
    }

    public Double getPreuTotalVenda() {
        return preuTotalVenda;
    }

    public double calcularTotal(Collection<Producte> productes) throws VendaBuidaException {
        double preuTotal = 0;
        if(productes.isEmpty()){
            throw new VendaBuidaException();
        }
        else {
            preuTotal = productes.stream().mapToDouble(o -> o.getPreu()).sum();
        }

        return preuTotal;
    }

    public void afegirPreuTotal(double quantiat){
        this.preuTotalVenda =+ quantiat;
    }

    @Override
    public String toString() {
        return "n2ex1.Venda{" +
                "productes=" + productes +
                ", preuTotalVenda=" + preuTotalVenda +
                '}';
    }
}
