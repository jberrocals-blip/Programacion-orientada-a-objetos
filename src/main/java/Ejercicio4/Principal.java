package ejercicio4;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad de Juan: ");
        double edadJuan = scanner.nextDouble();

        double edadAlberto =
                Edades.calcularAlberto(edadJuan);

        double edadAna =
                Edades.calcularAna(edadJuan);

        double edadMama =
                Edades.calcularMama(
                        edadJuan, edadAlberto, edadAna);

        System.out.println("La edad de Juan es: "
                + edadJuan);

        System.out.println("La edad de Alberto es: "
                + edadAlberto);

        System.out.println("La edad de Ana es: "
                + edadAna);

        System.out.println("La edad de la mama es: "
                + edadMama);

        scanner.close();
    }
}