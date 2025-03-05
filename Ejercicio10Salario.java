/* obrero necesita calcular su salario semanal, el cual se obtiene de la sig. manera:
• Si trabaja 40 horas o menos se le paga $5000 por hora
• Si trabaja más de 40 horas se le paga $5000 por cada una de las primeras 40 horas y un
aumento del 20% por cada hora extra. /* */

//Daniel Esteban Quinayas Caicedo - 20242227875

import java.util.Scanner;

public class Ejercicio10Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PAGHOR = 5000;
        final double AUMEXT = 1.2; 

        System.out.print("Ingrese el número de horas trabajadas en la semana: ");
        double horasTrabajadas = sc.nextDouble();

        double salarioSemanal;

        if (horasTrabajadas <= 40) {
            salarioSemanal = horasTrabajadas *PAGHOR;
        } else {
            double horasExtras = horasTrabajadas - 40;
            salarioSemanal = (40 *PAGHOR) + (horasExtras *PAGHOR * AUMEXT);
        }

        System.out.println("El salario semanal es: $" + salarioSemanal);

        
    }
}
