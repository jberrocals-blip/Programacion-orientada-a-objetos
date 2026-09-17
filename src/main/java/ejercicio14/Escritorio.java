package ejercicio14;

import java.util.Scanner;

public class Escritorio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        double numero = scanner.nextDouble();

        double cuadrado = Operaciones.calcularCuadrado(numero);
        double cubo = Operaciones.calcularCubo(numero);

        System.out.println("El cuadrado del número es: " + cuadrado);
        System.out.println("El cubo del número es: " + cubo);

        scanner.close();
    }
}