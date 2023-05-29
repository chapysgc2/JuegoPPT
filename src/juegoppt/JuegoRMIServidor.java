/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegoppt;

/**
 *
 * @author hazel
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class JuegoRMIServidor extends UnicastRemoteObject implements JuegoRMI {
    protected JuegoRMIServidor() throws RemoteException {
        super();
    }

    @Override
    public String jugar(String jugador1, String jugador2) throws RemoteException {
        String resultado = "";

        if (jugador1.equals(jugador2)) {
            resultado = "Empate";
        } else if ((jugador1.equals("R") && jugador2.equals("T")) ||
                   (jugador1.equals("T") && jugador2.equals("P")) ||
                   (jugador1.equals("P") && jugador2.equals("R"))) {
            resultado = "Jugador 1 gana";
        } else {
            resultado = "Jugador 2 gana";
        }

        return jugador1 + "-" + jugador2 + " " + resultado;
    }
}
