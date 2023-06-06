package co.edu.uptc.model;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ConnectException;
public class Client {
    private Connection connection;
    private DataInputStream dataInputStream;
    private boolean isRunning = false;
    public Client(String host, int port) {
        init(host, port);
    }
    public void init(String host, int port) {
        connection = new Connection("client", host, port);
        tryConnection();
    }
    public void tryConnection() {
        while (connection.socket == null) {
            try {
                connection.connect();
                dataInputStream = new DataInputStream(connection.getSocket().getInputStream());
                isRunning = true;
            } catch (ConnectException e) {
                isRunning = false;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public DataInputStream getDataInputStream() {
        return dataInputStream;
    }
    public boolean isRunning() {
        return isRunning;
    }
}
