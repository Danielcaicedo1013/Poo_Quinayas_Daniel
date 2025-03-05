// En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste
// en lo siguiente:
// • Si se compran menos de cinco llantas, el precio es de U$100 cada una, de U$75 si se
//   compran de cinco a 10 y de U$50 si se compran más de 10.
// • Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas
//   que compra y la que tiene que pagar por el total de la compra.

//Daniel Esteban Quinayas Caicedo - 20242227875
import java.util.Scanner;
public class Ejercicio2Serviteca {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas llantas deseas comprar?: ");
        int cant = sc.nextInt();
        double precio = 0;

        if (cant < 5) {
            precio = 100;
        } else if (cant <= 10) { 
            precio = 75;
        } else {
            precio = 50;
        }

        double total = cant * precio;

        System.out.println("El precio de cada llanta es: U$ "  + precio);

        System.out.println("El precio total de la compra es: U$ "  + total);

        
    }
}


