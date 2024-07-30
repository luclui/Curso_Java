import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaContador {
    private JPanel JTela;
    private JList lstCont;
    private JSlider sliInicio;
    private JSlider sliTermina;
    private JSlider sliPasso;
    private JButton bntCont;
    private JLabel lblInicio;
    private JLabel lblTermino;
    private JLabel lblTxtLista;
    private JLabel lblTxtTermino;
    private JLabel lblTxtPasso;
    private JLabel lblPasso;


    public static void main(String[] args) {
        JFrame frame = new JFrame("TelaContador");
        frame.setContentPane(new TelaContador().JTela);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,250);
    }


    public TelaContador() {
        sliInicio.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
            int i = sliInicio.getValue();
            lblInicio.setText(Integer.toString(i));
            }
        });
        sliTermina.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int t = sliTermina.getValue();
                lblTermino.setText(Integer.toString(t));
            }
        });
        sliPasso.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int p = sliPasso.getValue();
                lblPasso.setText(Integer.toString(p));
            }
        });
        bntCont.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = sliInicio.getValue();
                int t = sliTermina.getValue();
                int p = sliPasso.getValue();


                DefaultListModel list = new DefaultListModel();
                for (int c = i; c <= t; c+=p) {
                    list.addElement(c);
                }
                lstCont.setModel(list);
            }
        });
    }




}

