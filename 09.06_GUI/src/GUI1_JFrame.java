import javax.swing.*;

public class GUI1_JFrame {
    public static void main(String args[]) {
        JFrame frame = new JFrame("GUI 창이름");
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