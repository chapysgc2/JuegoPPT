/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegoppt;

/**
 *
 * @author hazel
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface JuegoRMI extends Remote {
    String jugar(String jugador1, String jugador2) throws RemoteException;
}

