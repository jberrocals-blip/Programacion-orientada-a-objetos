
package punto83;

public class Piramide extends FiguraGeometrica {

    private double ladoBase;
    private double altura;
    private double apotema;

    public Piramide(double ladoBase, double altura, double apotema) {
        this.ladoBase = ladoBase;
        this.altura = altura;
        this.apotema = apotema;

        setVolumen(calcularVolumen());
        setSuperficie(calcularAreaSuperficial());
    }

    @Override
    public double calcularVolumen() {
        return Math.pow(ladoBase, 2) * altura / 3.0;
    }

    @Override
    public double calcularAreaSuperficial() {
        return Math.pow(ladoBase, 2) + 2 * ladoBase * apotema;
    }
}
