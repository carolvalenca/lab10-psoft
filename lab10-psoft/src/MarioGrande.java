public class MarioGrande extends SituacaoMario {
    public MarioGrande(int pontuacao) {
        super(pontuacao, SituacaoMarioEnum.GRANDE);
    }

    @Override
    public SituacaoMarioInterface pegarCogumelo() {
        return new MarioGrande(this.getPontuacao() + 1000);
    }

    @Override
    public SituacaoMarioInterface levarDano() {
        return new MarioPequeno(this.getPontuacao());
    }

    @Override
    public SituacaoMarioInterface pegarFlor() {
        return new MarioFogo(this.getPontuacao());
    }
}
