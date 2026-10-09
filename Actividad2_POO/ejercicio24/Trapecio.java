package ejercicio24;

public class Trapecio {

    double baseMayor;
    double baseMenor;
    double lado1;
    double lado2;
    double altura;

    Trapecio(double baseMayor, double baseMenor,
            double lado1, double lado2, double altura) {

        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    double calcularPerímetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }
}