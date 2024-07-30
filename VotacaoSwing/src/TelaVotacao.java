import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaVotacao {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TelaVotacao");
        frame.setContentPane(new TelaVotacao().tela);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(20,200);
    }

    private JLabel lblNum;
    private JSpinner spIdade;
    private JButton btnCalculo;
    private JPanel tela;
    private JLabel lblResul;
    private JTextField txtIdade;

    public TelaVotacao() {
        btnCalculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String idade = txtIdade.getText();
                int nasc = 2024 - Integer.parseInt(idade);;

                if (nasc >= 18 && nasc < 70){
                    lblResul.setText("Obrigatório");
                }
                else if (nasc < 16) {
                    lblResul.setText("Não vota");
                }
                else {
                    lblResul.setText("Opcional");
                }
            }
        });
    }
}
