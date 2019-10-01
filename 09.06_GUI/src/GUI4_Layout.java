import javax.swing.*;
import java.awt.*;

public class GUI4_Layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI화면 임시로 띄어놓음");
        JPanel panel = new JPanel();

        GridLayout g1 = new GridLayout(2, 4); //2행 3열로 버튼이 정렬됨(행이 중요하다. 기본이 세로 정렬이기 때문임)
        panel.setLayout(g1);

        for(int i = 0; i < 7; i++) {
            JButton bt = new JButton("Button" + i);
            panel.add(bt);
        }

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
