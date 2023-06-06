package co.edu.uptc.view;
import co.edu.uptc.pojos.Base;
import co.edu.uptc.presenter.ContractManager;
import javax.swing.*;
import java.awt.*;
public class MyFrame extends JFrame implements ContractManager.View {
    private Panel1 panel1;
    public MyFrame() {
        setTitle("Sockets");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel1 = new Panel1();
        add(panel1);
    }
    @Override
    public void setInfo(Base base) {
        panel1.info(base.getFigureInformation(), base.getPanelInformation().getColor());
        setLocation(base.getFrameInformation().getX(), base.getFrameInformation().getY());
        setSize(base.getFrameInformation().getWidth(), base.getFrameInformation().getHeight());
    }
    @Override
    public void start() {
        setVisible(true);
    }
    @Override
    public void setRectangle(Rectangle rectangle) {
        panel1.setRectangle(rectangle);
    }
}
