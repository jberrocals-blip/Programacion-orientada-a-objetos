package ejercicio25;

public class CuentaBancaria {
    String nombresTitular;
    String apellidosTitular;
    int númeroCuenta;
    TipoCuenta tipoCuenta;
    float saldo;
    float porcentajeInteresMensual;
    CuentaBancaria(String nombresTitular, String apellidosTitular,
            int númeroCuenta, TipoCuenta tipoCuenta,
            float porcentajeInteresMensual) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.númeroCuenta = númeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0;
        this.porcentajeInteresMensual = porcentajeInteresMensual;
    }
    void imprimir() {
        System.out.println("Nombres del titular = " + nombresTitular);
        System.out.println("Apellidos del titular = " + apellidosTitular);
        System.out.println("Número de cuenta = " + númeroCuenta);
        System.out.println("Tipo de cuenta = " + tipoCuenta);
        System.out.println("Saldo = " + saldo);
        System.out.println("Porcentaje de interés mensual = "
                + porcentajeInteresMensual + "%");
        System.out.println();
    }
    float consultarSaldo() {
        return saldo;
    }
    boolean consignar(int valor) {

        if (valor > 0) {
            saldo = saldo + valor;
            return true;
        } else {
            System.out.println("El valor a consignar debe ser mayor que cero.");
            return false;
        }
    }
    boolean retirar(int valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            return true;
        } else {
            System.out.println("No se puede realizar el retiro.");
            return false;
        }
    }
    float calcularNuevoSaldo() {
        return saldo + (saldo * porcentajeInteresMensual / 100);
    }
}