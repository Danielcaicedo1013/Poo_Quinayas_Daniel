//El dueño de una empresa desea planificar las decisiones financieras que tomara en el siguiente
//año. La manera de planificarlas depende de lo siguiente:
//Si actualmente su capital se encuentra con saldo negativo, pedirá un préstamo bancario para
//que su nuevo saldo sea de U$10.000. Si su capital tiene actualmente un saldo positivo pedirá un
//préstamo bancario para tener un nuevo saldo de U$20.000, pero si su capital tiene actualmente
//un saldo superior a los U$20.000 no pedirá ningún préstamo.
//Posteriormente repartirá su presupuesto de la siguiente manera:
//• U$5.000 para equipo de computo
//• U$2.000 para mobiliario
//• El resto la mitad será para la compra de insumos y la otra para otorgar incentivos al personal.
//Desplegar que cantidades se destinaran para la compra de insumos e incentivos al personal y,
//en caso de que fuera necesario, a cuánto ascendería la cantidad que se pediría al banco.

//Daniel Esteban Quinayas Caicedo - 20242227875

import java.util.Scanner;

public class Ejercicio5Empresa {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         System.out.print("Por favor ingresa el saldo actual del capital: ");
         double saldoAct = sc.nextDouble();
         double prestamo = 0;
         double saldoNue = saldoAct;

         if (saldoAct < 0) {
            prestamo = 10000 - saldoAct;
            saldoNue = 10000;
         }else if (saldoAct <=20000) {
            prestamo = 20000 - saldoAct;
            saldoNue = 20000;
        }

        double presupuesto = saldoNue - 5000- 2000;
        double insumos = presupuesto / 2;
        double incentivos = presupuesto / 2;


        if (prestamo > 0) {
            System.out.println("Se necesita un prestamo de: "+prestamo);
        } else {
            System.out.println("No se necesita ningun prestamo.");
        }

        System.out.println("Cantidad destinada para la compra de insumos: " +insumos);
        System.out.println("Cantidad destinada para incentivos al personal: " +incentivos);
    }
}

