public class Janela {
    
    private String titulo;
    private String texto;
    
    private CaixaDeTexto caixaDeTextoLogin;
    private CaixaDeTexto caixaDeTextoSenha;
    private Botao botaoOk;
    private Botao botaoCancelar;



    public Janela(String titulo, String texto){
        this.titulo = titulo;
        this.texto = texto;
        this.caixaDeTextoLogin = new CaixaDeTexto("Login");
        this.caixaDeTextoSenha = new CaixaDeTexto("Senha");
        this.botaoOk = new Botao("Ok");
        this.botaoCancelar = new Botao("Cancelar");
    }


    public String getTitulo() {
        return titulo;
    }



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public String getTexto() {
        return texto;
    }



    public void setTexto(String texto) {
        this.texto = texto;
    }



    public CaixaDeTexto getCaixaDeTextoLogin() {
        return caixaDeTextoLogin;
    }



    public void setCaixaDeTextoLogin(CaixaDeTexto caixaDeTextoLogin) {
        this.caixaDeTextoLogin = caixaDeTextoLogin;
    }



    public CaixaDeTexto getCaixaDeTextoSenha() {
        return caixaDeTextoSenha;
    }



    public void setCaixaDeTextoSenha(CaixaDeTexto caixaDeTextoSenha) {
        this.caixaDeTextoSenha = caixaDeTextoSenha;
    }



    public Botao getBotaoOk() {
        return botaoOk;
    }



    public void setBotaoOk(Botao botaoOk) {
        this.botaoOk = botaoOk;
    }



    public Botao getBotaoCancelar() {
        return botaoCancelar;
    }



    public void setBotaoCancelar(Botao botaoCancelar) {
        this.botaoCancelar = botaoCancelar;
    }
    







}