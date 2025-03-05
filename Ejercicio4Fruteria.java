//Una frutería ofrece las manzanas con descuento según la siguiente tabla:
//NUM. DE KILOS COMPRADOS % DESCUENTO
//0 - 2 0%
//2.01 - 5 10%
//5.01 - 10 15%
//10.01 en adelante 20%
//Determinar cuánto pagara una persona que compre manzanas es esa frutería.

//Daniel Esteban Quinayas Caicedo - 20242227875
import java.util.Scanner;

public class Ejercicio4Fruteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prexKilo;
        double precioTotal, Kilcom, descuento = 0;

        System.out.println("Ingresa el precio por kilo de manzanas: ");
        prexKilo = sc.nextInt();
        System.out.println("Número de kilos comprados: ");
        Kilcom = sc.nextDouble();

        if (Kilcom <= 2) {
            descuento = 0.0;  
        } else if (Kilcom > 2 && Kilcom <= 5) {
            descuento = 0.10;
        } else if (Kilcom > 5 && Kilcom <= 10) {
            descuento = 0.15;
        } else {
            descuento = 0.20;
        }

        precioTotal = prexKilo * Kilcom * (1 - descuento);

        System.out.println("El precio total de la compra es de $" + precioTotal);
    }
}
