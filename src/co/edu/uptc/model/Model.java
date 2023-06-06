package co.edu.uptc.model;
import co.edu.uptc.pojos.Base;
import co.edu.uptc.presenter.ContractManager;
import com.google.gson.Gson;
import java.awt.*;
import java.io.DataInputStream;

public class Model implements ContractManager.Model {
    private ContractManager.Presenter presenter;
    private DataInputStream dataInputStream;
    private Gson gson;
    private Base base;
    private Rectangle rectangle;
    private Client client;

    public Model(String ip, int port) {
        rectangle = new Rectangle();
        client = new Client(ip, port);
        gson = new Gson();
    }

    @Override
    public void setPresenter(ContractManager.Presenter presenter) {
        this.presenter = presenter;
    }
    private Rectangle numberToRectangle(int num) {
        int x = num >>> 22;
        int y = (num >>> 12) - (x << 10);
        int w = (num >>> 6) - ((num >>> 12) << 6);
        int h = num - ((num >>> 6) << 6);
        rectangle.setLocation(x, y);
        rectangle.setSize(w, h);
        return rectangle;
    }

    @Override
    public void loadData() {
        Thread repaintThread = new Thread(() -> {
            while (client.isRunning()) {
                try {
                    client.tryConnection();
                    dataInputStream = client.getDataInputStream();
                    String info = dataInputStream.readUTF();
                    System.out.println(info);
                    base = gson.fromJson(info, Base.class);
                    rectangle = numberToRectangle(base.getFigureInformation().getRectangle());
                    presenter.setInfo(base);
                    presenter.setRectangle(rectangle);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        repaintThread.start();
    }

}
