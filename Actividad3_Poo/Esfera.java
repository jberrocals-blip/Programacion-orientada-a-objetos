
package punto83;

public class Esfera extends FiguraGeometrica {

    private double radio;

    public Esfera(double radio) {
        this.radio = radio;

        setVolumen(calcularVolumen());
        setSuperficie(calcularAreaSuperficial());
    }

    @Override
    public double calcularVolumen() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }

    @Override
    public double calcularAreaSuperficial() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }
}
