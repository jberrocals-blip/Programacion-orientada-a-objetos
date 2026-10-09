package ejercicio25;

public class PruebaCuentaBancaria {

    public static void main(String args[]) {

        CuentaBancaria cuenta = new CuentaBancaria(
                "Pedro",
                "Pérez",
                1067866723,
                TipoCuenta.AHORROS,
                2.5f
        );

        cuenta.imprimir();

        cuenta.consignar(200000);
        cuenta.consignar(300000);

        System.out.println("Saldo después de consignaciones = "
                + cuenta.consultarSaldo());

        cuenta.retirar(400000);

        System.out.println("Saldo después del retiro = "
                + cuenta.consultarSaldo());

        System.out.println("Nuevo saldo con interés = "
                + cuenta.calcularNuevoSaldo());
    }
}