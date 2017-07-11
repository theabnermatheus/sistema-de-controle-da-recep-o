package Entity;

public class Usuario {
    private String Nome;
    private String CPF;
    private String Cargo;
    private int status;

    public Usuario(String Nome, String CPF, String Cargo, int status) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.Cargo = Cargo;
        this.status = status;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }   
}
