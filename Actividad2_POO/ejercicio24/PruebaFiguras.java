package ejercicio24;

public class PruebaFiguras {

    public static void main(String args[]) {

        circulo figura1 = new circulo(2);
        rectangulo figura2 = new rectangulo(1, 2);
        cuadrado figura3 = new cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3, 5);
        Rombo figura5 = new Rombo(6, 4, 5);
        Trapecio figura6 = new Trapecio(8, 4, 5, 5, 3);

        System.out.println("El área del círculo es = "
                + figura1.calcularArea());

        System.out.println("El perímetro del círculo es = "
                + figura1.calcularPerímetro());

        System.out.println();

        System.out.println("El área del rectángulo es = "
                + figura2.calcularArea());

        System.out.println("El perímetro del rectángulo es = "
                + figura2.calcularPerímetro());

        System.out.println();

        System.out.println("El área del cuadrado es = "
                + figura3.calcularArea());

        System.out.println("El perímetro del cuadrado es = "
                + figura3.calcularPerímetro());

        System.out.println();

        System.out.println("El área del triángulo es = "
                + figura4.calcularArea());

        System.out.println("El perímetro del triángulo es = "
                + figura4.calcularPerímetro());

        System.out.println("La hipotenusa del triángulo es = "
                + figura4.calcularHipotenusa());

        figura4.determinarTipoTriangulo();

        System.out.println();

        System.out.println("El área del rombo es = "
                + figura5.calcularArea());

        System.out.println("El perímetro del rombo es = "
                + figura5.calcularPerímetro());

        System.out.println();

        System.out.println("El área del trapecio es = "
                + figura6.calcularArea());

        System.out.println("El perímetro del trapecio es = "
                + figura6.calcularPerímetro());
    }
}