package n2ex1;

import java.util.ArrayList;
import java.util.Collection;

public class main {
    public static void main(String[] args) {
        Collection<Producte> productes = new ArrayList<>();
        Producte p1 = new Producte("pap", 20.5);
        Producte p2 = new Producte("sdad", 35.5);

        //si està buida provoquem una exepcio tipos VendaBuidaExepcion
        productes.add(p1);
        //productes.add(p2);

        Venda venda = new Venda(productes);
        double preuTotal = 0;

        //Creem un array per probocar una exepcio tipos ArrayIndexOutOfBoundsException
        double array[] = {7,8,9};
        try {
            preuTotal = venda.calcularTotal(productes);
            venda.afegirPreuTotal(preuTotal);
            System.out.println("Preu total " + preuTotal);
            System.out.println(array[3]);
        } catch (VendaBuidaException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
