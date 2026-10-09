
package ejercicio21;
public class PruebaPersona {
    public static void main(String args[]) {
        Persona p1 = new Persona("Pedro", "Pérez", "1053121010",
                1998, "Colombia", 'H');
        Persona p2 = new Persona("Luis", "León", "1053223344",
                2001, "Colombia", 'H');
        p1.imprimir();
        p2.imprimir();
    }
}
