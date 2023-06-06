package co.edu.uptc.model;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class Connection {
    protected ServerSocket serverSocket;
    protected Socket socket;
    private String type;
    private String host;
    private int port;
    public Connection(String type, String host, int port) {
        this.type = type;
        this.host = host;
        this.port = port;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getHost() {
        return host;
    }
    public void setPort(int port) {
        this.port = port;
    }
    public ServerSocket getServerSocket() {
        return serverSocket;
    }
    public void setServerSocket(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }
    public void connect()throws IOException {
        internalConnect();
    }
    private void internalConnect() throws IOException {
        socket = new Socket(host, port);
    }
    public Socket getSocket() {
        return socket;
    }
    public void setSocket(Socket socket) {
        this.socket = socket;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public int getPort() {
        return port;
    }
}