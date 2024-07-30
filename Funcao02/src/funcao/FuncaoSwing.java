package funcao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FuncaoSwing {
    private JSpinner txtNum;
    private JButton btnCalc;
    private JLabel lblResultado;
    private JLabel lblFormula;
    private JPanel PanelFuncao;

    public FuncaoSwing() {
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(txtNum.getValue().toString());
                Fator f = new Fator();
                f.setValor(n);
                lblFormula.setText(f.getFormula());
                lblResultado.setText(Integer.toString(f.getFatorial()));


            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FuncaoSwing");
        frame.setContentPane(new FuncaoSwing().PanelFuncao);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(200,110);

    }
}
