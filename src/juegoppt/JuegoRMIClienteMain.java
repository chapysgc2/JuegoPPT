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
import java.util.*;

public class JuegoRMIClienteMain {
    public static void main(String[] args) {
        try {
            // Obtiene el registro RMI
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Obtiene la instancia del juego remoto
            JuegoRMI juegoRemoto = (JuegoRMI) registry.lookup("JuegoRMI");

            // Realiza las llamadas al juego
            //String jugador1 = "T";
            //String jugador2 = "R";
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la opción del jugador 1 (T, R, P):");
            String jugador1 = sc.nextLine();

            System.out.println("Ingrese la opción del jugador 2 (T, R, P):");
            String jugador2 = sc.nextLine();
         
            
            String resultado = juegoRemoto.jugar(jugador1, jugador2);
            System.out.println(resultado);
        } catch (Exception e) {
            System.err.println("Error en el cliente del juego RMI: " + e.toString());
            e.printStackTrace();
        }
    }
}
