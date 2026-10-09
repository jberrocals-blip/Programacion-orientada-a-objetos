package ejercicio22;

public class PruebaPlaneta {

    public static void main(String args[]) {

        Planeta p1 = new Planeta(
                "Tierra",
                1,
                5.972E24,
                1.08321E12,
                12742,
                150000000,
                TipoPlaneta.TERRESTRE,
                true,
                1,
                1
        );

        Planeta p2 = new Planeta(
                "Júpiter",
                95,
                1.898E27,
                1.43128E15,
                139820,
                750000000,
                TipoPlaneta.GASEOSO,
                true,
                11.86,
                0.41
        );

        p1.imprimir();
        p2.imprimir();

        System.out.println("Densidad de la Tierra = "
                + p1.calcularDensidad());

        System.out.println("Densidad de Júpiter = "
                + p2.calcularDensidad());

        System.out.println("¿La Tierra es planeta exterior? "
                + p1.esPlanetaExterior());

        System.out.println("¿Júpiter es planeta exterior? "
                + p2.esPlanetaExterior());
    }
}