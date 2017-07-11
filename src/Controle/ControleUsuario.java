package Controle;

import Entity.Usuario;
import Modelo.ModeloUsuario;
import Visão.TelaDeLogin;

public class ControleUsuario {
    
    ModeloUsuario modelo = new ModeloUsuario();
    
    public ControleUsuario() {
        
    }
    
    public void login() {
        TelaDeLogin t = new TelaDeLogin();
        t.setVisible(true);
    }
    
    public void verificarLogin(String login, String Senha){
        Usuario User = modelo.verificarLogin(login, Senha);
        
    }
}
