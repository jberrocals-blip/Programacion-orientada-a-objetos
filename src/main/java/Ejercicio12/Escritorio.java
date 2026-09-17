package ejercicio12;

import java.util.Scanner;

public class Escritorio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese las horas trabajadas: ");
        double horas = scanner.nextDouble();

        System.out.print("Ingrese el valor de la hora: ");
        double valorHora = scanner.nextDouble();

        double salarioBruto =
                Operaciones.calcularSalarioBruto(horas, valorHora);

        double retencion =
                Operaciones.calcularRetencion(salarioBruto);

        double salarioNeto =
                Operaciones.calcularSalarioNeto(salarioBruto, retencion);

        System.out.println("Salario bruto: $" + salarioBruto);
        System.out.println("Retencion en la fuente: $" + retencion);
        System.out.println("Salario neto: $" + salarioNeto);

        scanner.close();
    }
}