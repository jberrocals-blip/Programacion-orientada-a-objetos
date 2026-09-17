package ejercicio5;

import java.util.Scanner;

public class Escritorio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double suma;
        double x;
        double y;

        System.out.print("Ingrese el valor de x: ");
        x = scanner.nextDouble();

        System.out.print("Ingrese el valor inicial de suma: ");
        suma = scanner.nextDouble();

        suma = Operaciones.operacion1(suma, x);

        System.out.print("Ingrese el valor de y: ");
        y = scanner.nextDouble();

        x = Operaciones.operacion2(x, y);

        suma = Operaciones.operacion3(suma, x, y);

        System.out.println("El Valor de la suma es: " + suma);

        scanner.close();
    }
}