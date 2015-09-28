
import java.awt.*;
import javax.swing.*;


public class RotateImage extends JPanel{

    Image image;

    public RotateImage(){
        super();
        image = Toolkit.getDefaultToolkit().getImage("sample.png");
    }

    public void paintComponent(Graphics g){
        Graphics2D g2d=(Graphics2D)g;
        g2d.translate(170, 0);
        g2d.rotate(Math.toRadians(90));
        g2d.drawImage(image, 0, 0, 200, 200, this);
    }

    public static void main(String arg[]){
        JFrame frame = new JFrame("RotateImage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);

        RotateImage panel = new RotateImage();
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}