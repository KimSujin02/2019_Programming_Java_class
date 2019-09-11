import javax.swing.*;
import java.awt.*;

public class GUI1_JFrame {
    public static void main(String args[]) {
        JFrame frame = new JFrame("GUI 창이름");
        Dimension screanSize = Toolkit.getDefaultToolkit().getScreenSize();
        int 화w = screanSize.width;
        int 화h = screanSize.height;
        int 창w = 400;
        int 창h = 200;
        frame.setPreferredSize(new Dimension(창w, 창h));  //윈도우 크기를 지정하는 메소드. Dimension의 데이터를 받아.. 크기를 지정함
        frame.setLocation((화w-창w)/2, (화h-창h)/2); //윈도우의 위치를 지정함. 가로 세로

        JPanel panel = new JPanel(); //여러개 넣을 수 있는 주머니 같은 개념임. 버튼과 레이블을 패널에 넣고 프레임에 넣으면 이쁘게 나옴..
        JLabel label = new JLabel("아싸 어쩌다 금요일"); //ctl + shift + enter 하면 끝에 세미클로이 입력된다.
        JButton button = new JButton("오예");

        panel.add(label);
        panel.add(button);
        frame.add(panel);

        frame.pack(); //레이블 보이게 하는 건가 봄...
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x버튼 -> 끝

    }
}