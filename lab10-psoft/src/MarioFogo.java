public class MarioFogo extends SituacaoMario {
    public MarioFogo(int pontuacao) {
        super(pontuacao, SituacaoMarioEnum.FOGO);
    }

    @Override
    public SituacaoMarioInterface pegarCogumelo() {
        return new MarioFogo(this.getPontuacao() + 1000);
    }

    @Override
    public SituacaoMarioInterface levarDano() {
        return new MarioGrande(this.getPontuacao());
    }

    @Override
    public SituacaoMarioInterface pegarFlor() {
        return new MarioFogo(this.getPontuacao() + 1000);
    }
}