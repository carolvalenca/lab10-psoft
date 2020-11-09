public class Mario {
    private SituacaoMarioGerenciador estado;

    public Mario() {
        this.estado = new SituacaoMarioGerenciador();
    }

    public void pegarCogumelo() {
        this.estado.pegarCogumelo();
    }

    public void levarDano() {
        this.estado.levarDano();
    }

    public void pegarFlor() {
        this.estado.pegarFlor();
    }
}