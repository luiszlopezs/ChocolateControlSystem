/*
 * Clase Boiler que implementa el patrón Singleton para controlar
 * una única instancia de caldera en el sistema.
 */
package chocolatecontrolsystem;

public class Boiler {

    // Variable estática privada que guarda la única instancia de Boiler.
    private static Boiler instance = null;

    // Estado interno: indica si la resistencia está encendida.
    private boolean isResistanceOn = false;
    // Estado interno: indica si la caldera está llena.
    private boolean isFull = false;

    // Constructor privado para evitar que se creen instancias desde fuera.
    private Boiler() {
    }

    /**
     * Método estático para obtener o crear la única instancia de Boiler.
     * Si no existe, la crea. Si ya existe, devuelve la misma.
     * Esto garantiza que solo haya un Boiler en todo el sistema.
     */
    public static Boiler createBoiler() {
        if (instance == null) {           // Si aún no hay instancia...
            instance = new Boiler();      // ...crear una nueva.
        }
        return instance;                  // Devolver la instancia única.
    }

    /**
     * Llena la caldera si está vacía y la resistencia apagada.
     * Cambia el estado a lleno. Si no se cumplen las condiciones,
     * muestra mensajes indicando por qué no se puede llenar.
     */
    public void fillBoiler() {
        if (!isResistanceOn && !isFull) {       // Solo se llena si está vacía y apagada.
            System.out.println("filling boiler");
            isFull = true;
            System.out.println("boiler full");
        } else {
            if (isResistanceOn) {
                System.out.println("the resistance is on");
            }
            if (isFull) {
                System.out.println("the boiler is full");
            }
            System.out.println("filling process denied");
        }
    }

    /**
     * Mezcla el contenido de la caldera si está llena y la resistencia apagada.
     * Activa la resistencia para simular el mezclado. Si no se cumplen las
     * condiciones, muestra mensajes explicativos.
     */
    public void mixBoiler() {
        if (isFull && !isResistanceOn) {         // Solo mezcla si está llena y apagada.
            System.out.println("Mixing mixing");
            isResistanceOn = true;               // Enciende la resistencia.
            System.out.println("Boiler mixed");
        } else {
            if (isResistanceOn) {
                System.out.println("the resistance is on");
            }
            if (!isFull) {
                System.out.println("the boiler is empty");
            }
            System.out.println("Mixing process denied");
        }
    }

    /**
     * Vacía la caldera si está llena y la resistencia encendida.
     * Cambia el estado a vacía y apaga la resistencia.
     * Si no se cumplen las condiciones, informa los motivos.
     */
    public void emptyBoiler() {
        if (isFull && isResistanceOn) {         // Solo vacía si está llena y encendida.
            System.out.println("emptying boiler");
            isResistanceOn = false;             // Apaga la resistencia.
            isFull = false;                     // Marca como vacía.
            System.out.println("boiler empty");
        } else {
            if (!isResistanceOn) {
                System.out.println("the resistance is off");
            }
            if (!isFull) {
                System.out.println("the boiler is empty");
            }
            System.out.println("emptying process denied");
        }
    }

}
