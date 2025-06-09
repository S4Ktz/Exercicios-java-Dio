package Exercicios.Pratica.Mercadinho;

public sealed class Conta permits Gerente,Vendedor {
  protected String Usuario;
  protected String email;
  protected int senha;
  protected boolean Administrador;

    public Conta() {
        System.out.println("Nome do usuario: "+this.getUsuario()+
                            "\n" + "Email: "+this.getEmail() + "\n" +
                            "Senha do usuario: "+this.getSenha()+
                            "\n"+"Conta Adm: "+ (isAdministrador() ? "Conta Administrativa" : "Conta Normal"));

    }


    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean isAdministrador() {
        return Administrador;
    }

    public void setAdministrador(boolean administrador) {
        Administrador = administrador;
    }
}
