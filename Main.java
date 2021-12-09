package EjercicioSesión2;

/*Enunciado Ejercicio 2*/

/*Para este ejercicio tendréis que crear una función que reciba
un precio y devuelva el precio con el IVA incluido.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner valor= new Scanner(System.in);
        System.out.println("Introduce el importe para calcular el iva");
        float precio=valor.nextFloat();
        System.out.println("El importe iva incluido es: " +calculo(precio));
    }
    private static float calculo(float Base) {

        return (float) (Base*1.21);

    }
}
