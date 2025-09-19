/*
 * Clase Main que prueba el funcionamiento del patrón Singleton
 * usando la clase Boiler del paquete chocolatecontrolsystem.
 */
package chocolatecontrolsystem;

/**
 * Clase principal que ejecuta la aplicación.
 * Demuestra que varias referencias (boiler y boiler2) apuntan
 * a la misma instancia de Boiler.
 */
public class Main {

    public static void main(String[] args) {
        // Se solicita la instancia única de Boiler mediante createBoiler().
        Boiler boiler = Boiler.createBoiler();
        // Se solicita nuevamente, pero devolverá la MISMA instancia.
        Boiler boiler2 = Boiler.createBoiler();

        // ====== PRUEBAS DEL FUNCIONAMIENTO ======

        // Llenar la caldera usando la primera referencia.
        boiler.fillBoiler();

        // Mezclar la caldera usando la segunda referencia.
        // Como es el mismo objeto, opera sobre el mismo estado.
        boiler2.mixBoiler();

        // Vaciar la caldera usando la primera referencia.
        boiler.emptyBoiler();

        // Intentar mezclar cuando ya está vacía.
        boiler2.mixBoiler();

        // Intentar llenar nuevamente la caldera.
        boiler2.fillBoiler();

        // Vaciar la caldera usando la segunda referencia.
        boiler2.emptyBoiler();
    }
}
