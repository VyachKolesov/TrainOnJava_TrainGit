import javax.swing.*;
import java.awt.*;

public class Calculate_GUI {
    public static void main(String[] args){
        generate();
    }
    public static void generate(){
        JFrame frame = getFrame();
        GridBagLayout experimentLayout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        frame.setLayout(experimentLayout);
        JLabel label = new JLabel();
        constraints.gridy = 0;
        constraints.gridx = 0;
        constraints.gridwidth = 3;
        frame.add(label);
        constraints.gridy = 1;
        constraints.gridx = 1;
        constraints.gridwidth = 1;
        for (int i = 0; i<10; i++){
            frame.add(getButton(String.valueOf(i),label));
        }
        frame.revalidate();
    }
    static JButton getButton(String a, JLabel x){
        JButton jButton = new JButton(a);
        jButton.addActionListener(e -> x.setText(a));
        return jButton;
    }
    static JFrame getFrame(){
        JFrame jFrame = new JFrame("Calculate");
        jFrame.setVisible(true);
        jFrame.setBounds(50,50,250,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}
