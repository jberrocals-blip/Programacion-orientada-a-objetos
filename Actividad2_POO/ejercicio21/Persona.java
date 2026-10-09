package ejercicio21;

public class Persona {

    String nombre;
    String apellido;
    String númeroDocumentoIdentidad;
    int añoNacimiento;
    String paisNacimiento;
    char genero;

    Persona(String nombre, String apellido, String númeroDocumentoIdentidad,
            int añoNacimiento, String paisNacimiento, char genero) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.númeroDocumentoIdentidad = númeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellido = " + apellido);
        System.out.println("Número de documento de identidad = " + númeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + añoNacimiento);
        System.out.println("País de nacimiento = " + paisNacimiento);
        System.out.println("Género = " + genero);
        System.out.println();
    }

    
}