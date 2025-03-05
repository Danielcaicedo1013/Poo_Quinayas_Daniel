/*Una clínica de maternidad necesita un sistema para determinar cuántos bebés han nacido
recientemente. Dicho sistema solicita al usuario capturar la cantidad de nacimientos (N), el
nombre de cada bebé y su sexo (implemente un ciclo do-while para validar la captura, siendo M

para masculino y F para femenino). Al final, debe imprimir la cantidad de bebés de cada sexo.
Ejercicio estructura repetitiva/* */



//Daniel Esteban Quinayas Caicedo - 20242227875

import java.util.Scanner;

public class Ejercicio15Maternidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de bebés nacidos: ");
        int n = sc.nextInt();
        int m = 0, f = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Sexo del bebé #" + i + " (M/F): ");
            char sexo;
            do {
                sexo = sc.next().toUpperCase().charAt(0);
            } while (sexo != 'M' && sexo != 'F');

            if (sexo == 'M') m++;
            else f++;
        }

        System.out.println("Masculinos: " + m);
        System.out.println("Femeninos: " + f);
        
    }
}
