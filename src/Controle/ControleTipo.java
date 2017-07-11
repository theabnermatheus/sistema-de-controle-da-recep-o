package Controle;

import Modelo.ModeloTipo;
import Visão.TelaAddTipo;
import java.lang.String;

public class ControleTipo {

    public ControleTipo() {
    
    }
    
    public void telaAddTipo(){
        TelaAddTipo t = new TelaAddTipo();
        t.setVisible(true);
    }
    
    public void addTipo(String tipo){
        ModeloTipo modelo = new ModeloTipo();
        modelo.addTipo(tipo);
    }
}