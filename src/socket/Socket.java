/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hermite
 */
public class Socket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
       try {
            try (ServerSocket serverSocket = new ServerSocket(9001)) {
                java.net.Socket commSocket = serverSocket.accept();
                System.out.println("Client connected !");
                commSocket.close();
            }
        }
        catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        
        try {
            Socket socket = new Socket(InetAddress.getLocalHost(), 9001);
            socket.close();
        }
        catch (IOException ex) {
        System.err.println(ex.getMessage());
        }
        
    }

    private Socket(InetAddress localHost, int i) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void close() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
//        try {
//            ServerSocket serverSocket = null;
//        try {
//            serverSocket = new ServerSocket(9001);
//        } catch (IOException ex) {
//            Logger.getLogger(Socket.class.getName()).log(Level.SEVERE, null, ex);
//        }
//            java.net.Socket commSocket = null;
//        try {
//            commSocket = serverSocket.accept();
//        } catch (IOException ex) {
//            Logger.getLogger(Socket.class.getName()).log(Level.SEVERE, null, ex);
//        }
//            System.out.println("Client connected !");
//            PrintWriter output = null;
//        try {
//            output = new PrintWriter(commSocket.getOutputStream());
//        } catch (IOException ex) {
//            Logger.getLogger(Socket.class.getName()).log(Level.SEVERE, null, ex);
//        }
//            output.println("Hello !");
//            output.flush();
//        try {
//            commSocket.close();
//        } catch (IOException ex) {
//            Logger.getLogger(Socket.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            serverSocket.close();
//        } catch (IOException ex) {
//            Logger.getLogger(Socket.class.getName()).log(Level.SEVERE, null, ex);
//        }
//            }
//            catch (IOException ex) {
//            System.err.println(ex.getMessage());
//            }
}
