
package punto82;

public class Notas {

    private double[] notas;

    public Notas(double[] notas) {
        this.notas = notas;
    }

    public double calcularPromedio() {
        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }

        return suma / notas.length;
    }

    public double calcularDesviacionEstandar() {
        double promedio = calcularPromedio();
        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            suma += Math.pow(notas[i] - promedio, 2);
        }

        return Math.sqrt(suma / notas.length);
    }

    public double calcularMayor() {
        double mayor = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
        }

        return mayor;
    }

    public double calcularMenor() {
        double menor = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        return menor;
    }
}
