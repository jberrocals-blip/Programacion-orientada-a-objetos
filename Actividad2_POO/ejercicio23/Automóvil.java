package ejercicio23;

public class Automóvil {

    String marca;
    int modelo;
    int motor;
    TipoCombustible tipoCom;
    TipoAutomovil tipoA;
    int númeroPuertas;
    int cantidadAsientos;
    int velocidadMáxima;
    TipoColor color;
    int velocidadActual;
    boolean automático;
    int multas;

    Automóvil(String marca, int modelo, int motor,
            TipoCombustible tipoCom, TipoAutomovil tipoA,
            int númeroPuertas, int cantidadAsientos,
            int velocidadMáxima, TipoColor color,
            boolean automático) {

        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCom = tipoCom;
        this.tipoA = tipoA;
        this.númeroPuertas = númeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMáxima = velocidadMáxima;
        this.color = color;
        this.velocidadActual = 0;
        this.automático = automático;
        this.multas = 0;
    }

    String getMarca() {
        return marca;
    }

    void setMarca(String marca) {
        this.marca = marca;
    }

    int getModelo() {
        return modelo;
    }

    void setModelo(int modelo) {
        this.modelo = modelo;
    }

    int getMotor() {
        return motor;
    }

    void setMotor(int motor) {
        this.motor = motor;
    }

    TipoCombustible getTipoCom() {
        return tipoCom;
    }

    void setTipoCom(TipoCombustible tipoCom) {
        this.tipoCom = tipoCom;
    }

    TipoAutomovil getTipoA() {
        return tipoA;
    }

    void setTipoA(TipoAutomovil tipoA) {
        this.tipoA = tipoA;
    }

    int getNúmeroPuertas() {
        return númeroPuertas;
    }

    void setNúmeroPuertas(int númeroPuertas) {
        this.númeroPuertas = númeroPuertas;
    }

    int getCantidadAsientos() {
        return cantidadAsientos;
    }

    void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    int getVelocidadMáxima() {
        return velocidadMáxima;
    }

    void setVelocidadMáxima(int velocidadMáxima) {
        this.velocidadMáxima = velocidadMáxima;
    }

    TipoColor getColor() {
        return color;
    }

    void setColor(TipoColor color) {
        this.color = color;
    }

    int getVelocidadActual() {
        return velocidadActual;
    }

    void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    boolean getAutomático() {
        return automático;
    }

    void setAutomático(boolean automático) {
        this.automático = automático;
    }

    void acelerar(int incrementoVelocidad) {

        int velocidadNueva = velocidadActual + incrementoVelocidad;

        System.out.println("Velocidad intentada = " + velocidadNueva);

        if (velocidadNueva <= velocidadMáxima) {
            velocidadActual = velocidadNueva;
        } else {
            multas++;
            System.out.println("No se puede superar la velocidad máxima.");
            System.out.println("Se ha generado una multa.");
        }
    }

    void desacelerar(int decrementoVelocidad) {

        if (velocidadActual - decrementoVelocidad >= 0) {
            velocidadActual = velocidadActual - decrementoVelocidad;
        } else {
            System.out.println("No se puede tener una velocidad negativa.");
        }
    }

    void frenar() {
        velocidadActual = 0;
    }

    double calcularTiempoLlegada(int distancia) {
        return (double) distancia / velocidadActual;
    }

    boolean tieneMultas() {
        return multas > 0;
    }

    int getValorMulta() {
        return 100000;
    }

    int calcularTotalMultas() {
        return multas * getValorMulta();
    }

    void imprimir() {
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + tipoCom);
        System.out.println("Tipo de automóvil = " + tipoA);
        System.out.println("Número de puertas = " + númeroPuertas);
        System.out.println("Cantidad de asientos = " + cantidadAsientos);
        System.out.println("Velocidad máxima = " + velocidadMáxima);
        System.out.println("Color = " + color);
        System.out.println("Velocidad actual = " + velocidadActual);
        System.out.println("Automático = " + automático);
        System.out.println("Número de multas = " + multas);
        System.out.println();
    }
}