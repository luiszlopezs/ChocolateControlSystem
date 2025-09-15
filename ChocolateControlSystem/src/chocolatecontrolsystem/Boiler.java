/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chocolatecontrolsystem;

public class Boiler {

    private static Boiler instance = null;
    private boolean isResistanceOn = false;
    private boolean isFull = false;

    private Boiler() {
    }

    public static Boiler createBoiler() {
        if (instance == null) {
            instance = new Boiler();
        }
        return instance;

    }

    public void fillBoiler() {
        if (!isResistanceOn && !isFull) {
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

    public void mixBoiler() {
        if (isFull && !isResistanceOn) {
            System.out.println("Mixing mixing");
            isResistanceOn = true;
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

    public void emptyBoiler() {
        if (isFull && isResistanceOn) {
            System.out.println("emptying boiler");
            isResistanceOn = false;
            isFull = false;
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
