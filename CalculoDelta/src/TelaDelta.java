import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaDelta {

    public static void main(String[] args) {
        JFrame frame = new JFrame("TelaDelta");
        frame.setContentPane(new TelaDelta().tela);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel tela;
    private JLabel lblTitulo;
    private JLabel lblA;
    private JSpinner spA;
    private JSpinner spB;
    private JLabel lblB;
    private JSpinner spC;
    private JLabel lblC;
    private JPanel PanelA;
    private JPanel PanelB;
    private JButton button1;
    private JLabel lblResul;

    public TelaDelta() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int A = (int) spA.getValue();
                int B = (int) spB.getValue();
                int C = (int) spC.getValue();

                double resul;
                resul = Math.pow(B, 2) - 4 * A * C;
                lblResul.setText(String.format("%.1f", resul));
            }
        });
    }
}




