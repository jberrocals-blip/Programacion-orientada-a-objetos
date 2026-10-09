package ejercicio24;

public class cuadrado {

    int lado;

    cuadrado(int lado) {
        this.lado = lado;
    }

    double calcularArea() {
        return lado * lado;
    }

    double calcularPerímetro() {
        return 4 * lado;
    }
}
