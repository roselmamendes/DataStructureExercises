package twu.exercises;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by roselmamendes on 8/28/14.
 */
public class EntradaISBN implements ActionListener{

    private JLabel jlResultado;
    private JTextField tfIsbn;
    private JButton btCheck;
    private JPanel formPrincipal;

    public EntradaISBN() {
        btCheck.addActionListener(this);
    }

    public JLabel getJlResultado() {
        return jlResultado;
    }

    public JTextField getTfIsbn() {
        return tfIsbn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(!getTfIsbn().getText().isEmpty()){

            getJlResultado().setText(
                    "Resultado: "+
                            (TrataIsbn.checkIsbn(getTfIsbn().getText().trim())?"Válido.":"Inválido."));

        }
        else{

            JOptionPane.showMessageDialog(null,"Informe um ISBN!","Attention",JOptionPane.WARNING_MESSAGE);

        }


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("EntradaISBN");
        frame.setContentPane(new EntradaISBN().formPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
