/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chocolatecontrolsystem;

/**
 *
 * @author Estudiantes
 */
public class Main {

    public static void main(String[] args) {
        Boiler boiler = Boiler.createBoiler();
        Boiler boiler2 = Boiler.createBoiler();

        boiler.fillBoiler();
        
        boiler2.mixBoiler();

        boiler.emptyBoiler();

        boiler2.fillBoiler();
        boiler2.mixBoiler();
        boiler2.emptyBoiler();

    }
}
