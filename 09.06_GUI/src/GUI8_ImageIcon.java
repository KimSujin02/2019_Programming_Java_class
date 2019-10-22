import javax.swing.*;
import java.awt.*;

public class GUI8_ImageIcon {
    public static void main(String[] args) {
        JFrame frame = new JFrame("이미지 아이콘");
        JPanel panel = new JPanel();

        ImageIcon iiJpg = new ImageIcon(GUI8_ImageIcon.class.getResource("img/instagramjpg.jpg"));
        ImageIcon iiJpg_edit = new ImageIcon(iiJpg.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JLabel lbii = new JLabel(iiJpg_edit);
        ImageIcon iiPng = new ImageIcon(GUI8_ImageIcon.class.getResource("img/instagrampng.png"));
        ImageIcon iiPng_edit = new ImageIcon(iiPng.getImage().getScaledInstance(iiPng.getIconWidth()/4, iiPng.getIconHeight()/4, Image.SCALE_DEFAULT));
        JButton btii = new JButton(iiPng_edit);

        panel.add(lbii);
        panel.add(btii);

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
