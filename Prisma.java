
package punto83;

public class Prisma extends FiguraGeometrica {

    private double largo;
    private double ancho;
    private double altura;

    public Prisma(double largo, double ancho, double altura) {
        this.largo = largo;
        this.ancho = ancho;
        this.altura = altura;

        setVolumen(calcularVolumen());
        setSuperficie(calcularAreaSuperficial());
    }

    @Override
    public double calcularVolumen() {
        return largo * ancho * altura;
    }

    @Override
    public double calcularAreaSuperficial() {
        return 2 * (largo * ancho + largo * altura + ancho * altura);
    }
}
