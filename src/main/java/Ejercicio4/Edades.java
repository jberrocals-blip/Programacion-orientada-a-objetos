package ejercicio4;

public class Edades {

    public static double calcularAlberto(double edadJuan) {
        return edadJuan * 2 / 3;
    }

    public static double calcularAna(double edadJuan) {
        return edadJuan * 4 / 3;
    }

    public static double calcularMama(
            double edadJuan,
            double edadAlberto,
            double edadAna) {

        return edadJuan + edadAlberto + edadAna;
    }
}