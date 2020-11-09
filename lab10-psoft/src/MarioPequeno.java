public class MarioPequeno extends SituacaoMario {
    public MarioPequeno(int pontuacao) {
        super(pontuacao, SituacaoMarioEnum.PEQUENO);
    }

    @Override
    public SituacaoMarioInterface pegarCogumelo() {
        return new MarioGrande(this.getPontuacao());
    }

    @Override
    public SituacaoMarioInterface levarDano() {
        throw new RuntimeException("Mario morreu");
    }

    @Override
    public SituacaoMarioInterface pegarFlor() {
        return new MarioFogo(this.getPontuacao());
    }
}
