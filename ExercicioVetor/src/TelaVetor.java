import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class TelaVetor {
    private JPanel panelVetor;
    private JSpinner spnNum;
    private JButton bntAdd;
    private JButton bntRem;
    private JButton bntOrd;
    private JLabel lblVetor;
    private JLabel lblSelecionado;
    private JList lstVetor;

        int[] vetor = new int[5];
        DefaultListModel lista = new DefaultListModel();
        int selecionado = 0;


    public static void main(String[] args) {
        JFrame frame = new JFrame("TelaVetor");
        frame.setContentPane(new TelaVetor().panelVetor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400, 300);
        for (int c = 0; c < vetor.length; c++) {
            lista.addElement(vetor[c]);
        }
    }



    private void createUIComponents() {
        // TODO: place custom component creation code here
        lstVetor.setModel(lista);
    }

    public TelaVetor() {
        bntAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vetor[selecionado] = (int) spnNum.getValue();
                lista.removeAllElements();
                for (int c = 0; c < vetor.length; c++) {
                    lista.addElement(vetor[c]);
                }
            }
        });

        lstVetor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                selecionado = lstVetor.getSelectedIndex();
                lblSelecionado.setText("["+ selecionado +  "]");
            }
        });

        bntRem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vetor[selecionado]=0;
                lista.removeAllElements();
                for (int c = 0; c < vetor.length; c++) {
                    lista.addElement(vetor[c]);
                }
            }
        });
        bntOrd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Arrays.sort(vetor);
                lista.removeAllElements();
                for (int c = 0; c < vetor.length; c++) {
                    lista.addElement(vetor[c]);
                }
            }
        });
    }



}