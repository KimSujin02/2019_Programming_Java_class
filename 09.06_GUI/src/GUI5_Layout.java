import javax.swing.*;
import java.awt.*;

public class GUI5_Layout {
    public GUI5_Layout() {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI화면 임시로 띄어놓음");
        JPanel panel = new JPanel();

        BorderLayout bl = new BorderLayout(); //2행 3열로 버튼이 정렬됨(행이 중요하다. 기본이 세로 정렬이기 때문임)
        panel.setLayout(bl);

        JButton bt0 = new JButton("Button" + 0);
        JButton bt1 = new JButton("Button" + 1);
        JButton bt2 = new JButton("Button" + 2);
        JButton bt3 = new JButton("Button" + 3);
        JButton bt4 = new JButton("Button" + 4);
        JButton bt5 = new JButton("Button" + 5);
        panel.add(bt0, BorderLayout.NORTH);
        panel.add(bt1, BorderLayout.WEST);
        panel.add(bt2, BorderLayout.CENTER);
        panel.add(bt3, BorderLayout.EAST);
        panel.add(bt4, BorderLayout.SOUTH);
        panel.add(bt5, BorderLayout.NORTH);


        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
