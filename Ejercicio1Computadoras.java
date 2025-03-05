//En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
//del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
//10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
//a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
//40% de descuento. El precio de cada computadora es de U$500..

//Daniel Esteban Quinayas Caicedo - 20242227875

import java.util.Scanner;

public class Ejercicio1Computadoras {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int comp = 500;

        System.out.println("Por favor Ingresa la cantidad de computadores que deseas comprar: ");
        int canPc=sc.nextInt();

        int noDesc=canPc*comp;

        double desc=0.0;
        if (canPc<5) {
            desc=noDesc*0.10;
        }   else if (canPc >=5 && canPc <10) {
            desc=noDesc*0.20;     
        }   else if (canPc>10) {
            desc=noDesc*0.40;
        }

        double siDes=noDesc-desc;
        
        System.out.println("Total a pagar: "+siDes);


        
    }

}
