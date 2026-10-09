package ejercicio23;

public class PruebaAutomovil {

    public static void main(String args[]) {

        Automóvil auto1 = new Automóvil(
                "Toyota",
                2025,
                2000,
                TipoCombustible.GASOLINA,
                TipoAutomovil.SUV,
                5,
                5,
                250,
                TipoColor.ROJO,
                true
        );

        auto1.imprimir();

        auto1.frenar();
        System.out.println("Velocidad actual = "
                + auto1.getVelocidadActual());

        auto1.acelerar(100);
        System.out.println("Velocidad actual = "
                + auto1.getVelocidadActual());

        auto1.acelerar(50);
        System.out.println("Velocidad actual = "
                + auto1.getVelocidadActual());

        auto1.acelerar(110);
        System.out.println("Velocidad actual = "
                + auto1.getVelocidadActual());

        if (auto1.tieneMultas()) {
            System.out.println("¿Tiene multas? Sí");
        } else {
            System.out.println("¿Tiene multas? No");
        }

        System.out.println("Número de multas = "
                + auto1.multas);

        
        System.out.println("Valor total de multas = $"
                + auto1.calcularTotalMultas());
    }
}