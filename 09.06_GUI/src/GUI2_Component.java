import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI2_Component {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Conponents");
        JPanel panel = new JPanel();
        JLabel lb0 = new JLabel("JLabel");
        JButton bt0 = new JButton("JButton");
        JCheckBox cb0 = new JCheckBox("JCheckBox0");
        JCheckBox cb1 = new JCheckBox("JCheckBox1");

        JRadioButton rb0 = new JRadioButton("미성년자");
        JRadioButton rb1 = new JRadioButton("성인");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb0);
        bg.add(rb1);

        JTextField tf0 = new JTextField("JTextField0");
        JTextArea ta0 = new JTextArea(2, 10); //문구를 넣을 수 있는 영역, 크기를 조정 할 수 있음

        String[] EXO = {"한명을 선택해주세요", "도경수", "박찬열", "김민석", "김준면", "오세훈", "김종대", "장이씽", "김종인", "변백현"};
        JComboBox<String> cbox0 = new JComboBox<>(EXO);
        cbox0.addItem("김수진"); //이렇게 나중에 추가하는 방법도 있다.

        JLabel lbResult = new JLabel("Result");


        bt0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                bt0.setText("Clicked"); //버튼 누르면 Clicked라고 나옴
            }
        });

        panel.add(lb0);
        panel.add(bt0);
        panel.add(cb0);
        panel.add(cb1);
        panel.add(rb0);
        panel.add(rb1);
        panel.add(tf0);
        panel.add(ta0);
        panel.add(cbox0);
        panel.add(lbResult);

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}