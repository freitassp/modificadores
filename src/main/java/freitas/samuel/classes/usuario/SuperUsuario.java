package freitas.samuel.classes.usuario;

public class SuperUsuario {

    private String login;
    private String senha;
    String nome = "Samuel";

    public SuperUsuario(final String login, final String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }


    protected String getSenha() {
        return senha;
    }

}
