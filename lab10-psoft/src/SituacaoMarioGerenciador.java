public class SituacaoMarioGerenciador {
    private SituacaoMarioInterface estado;

    public SituacaoMarioGerenciador() {
        this.estado = new MarioPequeno(0);
    }

    public void pegarCogumelo() {
        this.estado = this.estado.pegarCogumelo();
    }

    public void levarDano() {
        this.estado = this.estado.levarDano();
    }

    public void pegarFlor() {
        this.estado = this.estado.pegarFlor();
    }
}
