package classe;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TelaFatorial {
    private JPanel PanelTela;
    private JLabel lblNum;
    private JSpinner spnNum;
    private JLabel lblFator;
    private JLabel lblResul;



    public static void main(String[] args) {
        JFrame frame = new JFrame("TelaFatorial");
        frame.setContentPane(new TelaFatorial().PanelTela);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,300);
    }
    public TelaFatorial() {
        spnNum.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int num = (int) spnNum.getValue();
                int fat = 1;
                int c = num;
                int s = 0;

                while (c>=1){
                    fat *= c;
                    c--;
                }
                lblResul.setText(Integer.toString( fat));

            }
        });
    }
}
