package co.edu.uptc.view;
import co.edu.uptc.pojos.FigureInformation;
import javax.swing.*;
import java.awt.*;
public class Panel1 extends JPanel {
    private Rectangle rectangle;
    private int colorRectangulo;
    public Panel1() {
    }
    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }
    public void info(FigureInformation figureInformation, int colorPanel) {
        colorRectangulo = figureInformation.getColor();
        setBackground(new Color(colorPanel));
        repaint();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d = (Graphics2D) g;
        g2d.setColor(new Color(colorRectangulo));
        try {
            int x = (int) rectangle.getX();
            int y = (int) rectangle.getY();
            int width = (int) rectangle.getWidth();
            int height = (int) rectangle.getHeight();
            g2d.fillRect(x,y,width,height);
        }catch (Exception e){}
    }
}
