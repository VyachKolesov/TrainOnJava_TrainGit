import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Main {
    static String correct_password = "123456789";
    public static void main(String[] args) throws Exception{
        JFrame frame = getFrame();
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel();
        JTextField jTextField = new JTextField("password",20);
        JButton jButton = new JButton("submit");
        frame.add(jPanel);
        jPanel.add(jButton);
        jPanel.add(jTextField);
        jPanel.add(jLabel);
        jPanel.revalidate();
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String for_the_check = jTextField.getText();
                jLabel.setText(for_the_check);
                if (Objects.equals(for_the_check, correct_password)){
                    jPanel.setBackground(Color.cyan);
                }
                else{
                    jPanel.setBackground(Color.PINK);
                }
            }
        });
    }
    static JFrame getFrame(){
        JFrame jFrame = new JFrame("TestingCE");
        jFrame.setVisible(true);
        jFrame.setBounds(50,50,250,150);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}
