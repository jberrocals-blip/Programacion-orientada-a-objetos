
package punto83;

public class Cubo extends FiguraGeometrica {

    private double lado;

    public Cubo(double lado) {
        this.lado = lado;

        setVolumen(calcularVolumen());
        setSuperficie(calcularAreaSuperficial());
    }

    @Override
    public double calcularVolumen() {
        return Math.pow(lado, 3);
    }

    @Override
    public double calcularAreaSuperficial() {
        return 6 * Math.pow(lado, 2);
    }
}
