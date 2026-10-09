package ejercicio24;

public class Rombo {

    double diagonalMayor;
    double diagonalMenor;
    double lado;

    Rombo(double diagonalMayor, double diagonalMenor, double lado) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    double calcularPerímetro() {
        return 4 * lado;
    }
}