/*Tomando como base los resultados obtenidos en un laboratorio de análisis clínicos, un médico
determina si una persona tiene anemia o no, lo cual depende de su nivel de hemoglobina en la
sangre, de su edad y de su sexo. Si el nivel de hemoglobina que tiene una persona es menor
que el rango que le corresponde, se determina su resultado como positivo y en caso contrario
como negativo. La tabla en la que el medico se basa para obtener el resultado es la siguiente:

EDAD                        NIVEL HEMOGLOBINA
0 - 1 mes                   13 - 26 g%
> 1 y < =6 meses            10 - 18 g%
> 6 y < =12 meses           11 - 15 g%
> 1 y < =5 años             11.5 - 15 g%
> 5 y < =10 años            12.6 - 15.5 g%
> 10 y < =15 años           13 - 15.5 g%
Mujeres >15 años            12 - 16 g%
Hombres >15 años            14 - 18 g%*/          

//Daniel Esteban Quinayas Caicedo - 20242227875

import java.util.Scanner;

public class Ejercicio6Laboratorio {
    

    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Ingrese la edad (en meses): ");
            double edad = sc.nextDouble();
            sc.nextLine(); 
    
            System.out.print("Ingrese su sexo (M/F): ");
            char sexo = sc.nextLine().trim().toUpperCase().charAt(0);
    
            System.out.print("Ingrese el nivel de hemoglobina en su sangre (g%): ");
            double nivelHemo = sc.nextDouble();
    
            boolean siAnemia = (edad <= 1 && nivelHemo < 13) ||
                                  (edad > 1 && edad <= 6 && nivelHemo < 10) ||
                                  (edad > 6 && edad <= 12 && nivelHemo < 11) ||
                                  (edad > 12 && edad <= 60 && nivelHemo < 11.5) ||
                                  (edad > 60 && edad <= 120 && nivelHemo < 12.6) ||
                                  (edad > 120 && edad <= 180 && nivelHemo < 13) ||
                                  (edad > 180 && (sexo == 'M' && nivelHemo < 14) || (sexo == 'F' && nivelHemo < 12));
    
            System.out.println("Diagnóstico: " + (siAnemia ? "Positivo para anemia." : "Negativo para anemia."));
    
            
        }
    }
    
