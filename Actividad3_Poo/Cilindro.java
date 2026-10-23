
package punto83;

public class Cilindro extends FiguraGeometrica {

    private double radio;
    private double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;

        setVolumen(calcularVolumen());
        setSuperficie(calcularAreaSuperficial());
    }

    @Override
    public double calcularVolumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public double calcularAreaSuperficial() {
        return 2 * Math.PI * radio * (radio + altura);
    }
}
