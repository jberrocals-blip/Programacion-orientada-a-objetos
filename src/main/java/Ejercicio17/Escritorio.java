package ejercicio17;

import java.util.Scanner;

public class Escritorio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del circulo: ");
        double radio = scanner.nextDouble();

        double area = Operaciones.calcularArea(radio);
        double longitud = Operaciones.calcularLongitud(radio);

        System.out.println("El area del circulo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + longitud);

        scanner.close();
    }
}