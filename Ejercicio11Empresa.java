/*a empresa quiere hacer una compra de varias piezas de la misma clase a una fábrica de
refacciones. La empresa, dependiendo del monto total de la compra, decidirá qué hacer para
pagar al fabricante.
• Si el monto total de la compra excede de $500.000 la empresa tendrá la capacidad de invertir
de su propio dinero un 55% del monto de la compra, pedir prestado al banco un 30% y el
resto lo pagará solicitando un crédito al fabricante.
• Si el monto total de la compra no excede de $500.000 la empresa tendrá capacidad de
invertir de su propio dinero un 70% y el restante 30% lo pagará solicitando crédito al
fabricante.
• El fabricante cobra por concepto de intereses un 20% sobre la cantidad que se le pague a
crédito./* */


//Daniel Esteban Quinayas Caicedo - 20242227875

import java.util.Scanner;

public class Ejercicio11Empresa{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el monto total de la compra: ");
        double montcompra= sc.nextDouble();

        double inversionPropia, prestamoBanco = 0, creditoFabricante, intereses, total;

        if (montcompra> 500000) {
            inversionPropia = montcompra* 0.55;
            prestamoBanco = montcompra* 0.30;
            creditoFabricante = montcompra* 0.15;
        } else {
            inversionPropia = montcompra* 0.70;
            creditoFabricante = montcompra* 0.30;
        }

        intereses = creditoFabricante * 0.20;
        total = montcompra+ intereses;

        System.out.println("informe de pago");
        System.out.println("Inversión propia: $" + inversionPropia);
        if (montcompra> 500000) {
            System.out.println("Préstamo bancario: $" + prestamoBanco);
        }
        System.out.println("Crédito con fabricante: $" + creditoFabricante);
        System.out.println("Intereses del fabricante: $" + intereses);
        System.out.println("Total a pagar (incluyendo intereses): $" + total);

       
    }
}
