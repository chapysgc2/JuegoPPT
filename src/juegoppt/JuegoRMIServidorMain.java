/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegoppt;

/**
 *
 * @author hazel
 */
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class JuegoRMIServidorMain {
    public static void main(String[] args) {
        try {
            // Crea una instancia del servidor del juego
            JuegoRMIServidor juegoServidor = new JuegoRMIServidor();

            // Crea y obtiene el registro RMI
            Registry registry = LocateRegistry.createRegistry(1099);

            // Registra el servidor del juego en el registro
            registry.rebind("JuegoRMI", juegoServidor);

            System.out.println("Servidor del juego RMI listo.");
        } catch (Exception e) {
            System.err.println("Error en el servidor del juego RMI: " + e.toString());
            e.printStackTrace();
        }
    }
}

