package ejercicio22;

public class Planeta {

    String nombre;
    int cantidadSatélites;
    double masa;
    double volumen;
    int diámetro;
    int distanciaSol;
    TipoPlaneta tipo;
    boolean esObservable;
    double periodoOrbital;
    double periodoRotacion;

    Planeta(String nombre, int cantidadSatélites, double masa, double volumen,
            int diámetro, int distanciaSol, TipoPlaneta tipo,
            boolean esObservable, double periodoOrbital, double periodoRotacion) {

        this.nombre = nombre;
        this.cantidadSatélites = cantidadSatélites;
        this.masa = masa;
        this.volumen = volumen;
        this.diámetro = diámetro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Cantidad de satélites = " + cantidadSatélites);
        System.out.println("Masa = " + masa);
        System.out.println("Volumen = " + volumen);
        System.out.println("Diámetro = " + diámetro);
        System.out.println("Distancia al Sol = " + distanciaSol);
        System.out.println("Tipo = " + tipo);
        System.out.println("Es observable = " + esObservable);
        System.out.println("Período orbital = " + periodoOrbital);
        System.out.println("Período de rotación = " + periodoRotacion);
        System.out.println();
    }

    double calcularDensidad() {
        return masa / volumen;
    }

    boolean esPlanetaExterior() {
        return distanciaSol > 3.4;
    }
}