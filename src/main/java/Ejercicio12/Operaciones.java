package ejercicio12;

public class Operaciones {

    public static double calcularSalarioBruto(double horas, double valorHora) {
        return horas * valorHora;
    }

    public static double calcularRetencion(double salarioBruto) {
        return salarioBruto * 0.125;
    }

    public static double calcularSalarioNeto(double salarioBruto, double retencion) {
        return salarioBruto - retencion;
    }
}