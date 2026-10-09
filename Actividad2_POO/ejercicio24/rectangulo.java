package ejercicio24;

public class rectangulo {

    int base;
    int altura;

    rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return base * altura;
    }

    double calcularPerímetro() {
        return (2 * base) + (2 * altura);
    }
}
