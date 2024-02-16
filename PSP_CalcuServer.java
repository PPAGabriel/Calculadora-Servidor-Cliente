/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package psp_calcuserver;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.Scanner;

/**
 *
 * @author postgres
 */
public class PSP_CalcuServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            System.out.println("Creando socket servidor");

            ServerSocket serverSocket=new ServerSocket();

            System.out.println("Realizando el bind");

            InetSocketAddress addr=new InetSocketAddress("192.168.0.1",6666);
            serverSocket.bind(addr);

            System.out.println("Aceptando conexiones");
            
            //HILO
            while(true){
                System.out.println("Conexion recibida");
                Socket newSocket= serverSocket.accept();
                ClientThread clientThread=new ClientThread(newSocket);
                clientThread.start();
            }



        }catch (IOException e) {
                System.out.println("ERROR DE CONEXION");
        }
    }
    
}
