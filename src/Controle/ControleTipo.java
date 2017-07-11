package Controle;

import Modelo.ModeloTipo;
import Visão.TelaAddTipo;
import java.lang.String;
import javax.swing.JOptionPane;

public class ControleTipo {

    public ControleTipo() {

    }

    public void telaAddTipo() {
        TelaAddTipo t = new TelaAddTipo();
        t.setVisible(true);
    }

    public void addTipo(String tipo) {
        if (tipo.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor preencha o campo descrição");
        } else {
            ModeloTipo modelo = new ModeloTipo();
            modelo.addTipo(tipo);
        }
    }
}
