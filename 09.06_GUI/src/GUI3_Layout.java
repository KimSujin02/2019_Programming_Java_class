import javax.swing.*;
import java.awt.*;

public class GUI3_Layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI화면 임시로 띄어놓음");
        JPanel panel = new JPanel();

        FlowLayout f1 = new FlowLayout(); //JPannel의 기본 레이아웃
        f1.setAlignment(FlowLayout.LEFT); //버튼들이 왼쪽에 정렬되게 한다.
        panel.setLayout(f1);

        for(int i = 0; i < 6; i++) {
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
