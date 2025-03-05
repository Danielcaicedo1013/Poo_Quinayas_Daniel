//Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA,
//de algún aparato, si esta cuesta U$500 o más. Además, independientemente de esto, ofrece un
//5% de descuento si la marca es “NOSY”. Determinar cuánto pagara, con IVA incluido, un cliente
//cualquiera por la compra de su aparato. El IVA es del 19%.

//Daniel Esteban Quinayas Caicedo - 20242227875
import java.util.Scanner;

public class Ejercicio3Musica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double DESCUENTO = 0.10, DESCUENTO_NOSY = 0.05, IVA = 0.19;

        System.out.print("Ingrese el precio del reproductor de música: ");
        double precio = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Ingrese la marca del reproductor de música: ");
        String marca = sc.nextLine().trim();

        
        double precioSinIva = (precio >= 500) ? precio * (1 - DESCUENTO) : precio;

        
        if (marca.equalsIgnoreCase("NOSY")) {
            precioSinIva *= (1 - DESCUENTO_NOSY);
        }

        
        double precioConIva = precioSinIva * (1 + IVA);

        System.out.printf("El precio del reproductor de música con IVA incluido es: U$"  + precioConIva);

       
    }
}
