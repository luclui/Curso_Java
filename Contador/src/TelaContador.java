import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaContador {

    public static void main(String[] args) {
        JFrame frame = new JFrame("TelaContador");
        frame.setContentPane(new TelaContador().Tela);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(250,150);
    }

    private JPanel panelResul;
    private JLabel lblResul;
    private JButton btnResul;
    private JPanel Tela;

    public TelaContador() {
        btnResul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int i = 0;
                String contagem ="";
                while (i<=10){
                    contagem += i + " ";
                    i++;
                }
                lblResul.setText(contagem);
            }
        });
    }
}
