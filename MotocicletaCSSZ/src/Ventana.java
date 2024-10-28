import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel principal;
    private JTabbedPane tabbedPane1;
    private JTextField textField1;
    private JButton costoButton;
    private JLabel calculo;
    private Cola cola;
    private MotocicletaaCSSZ moto;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Ventana() {
        cola= new Cola();
        moto= new MotocicletaaCSSZ();

        costoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             float a=  moto.calcular(cola.regresoplaca(textField1.getText()));
               calculo.setText("Precio"+a);
            }
        });
    }
}
