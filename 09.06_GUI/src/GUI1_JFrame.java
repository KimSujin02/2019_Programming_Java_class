import javax.swing.*;

public class GUI1_JFrame {
    public static void main(String args[]) {
        JFrame frame = new JFrame("GUI 창이름");
        JLabel label = new JLabel("아싸 어쩌다 금요일"); //ctl + shift + enter 하면 끝에 세미클로이 입력된다.

        frame.add(label);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x버튼 -> 끝
    }
}