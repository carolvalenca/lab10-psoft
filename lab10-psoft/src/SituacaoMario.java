public abstract class SituacaoMario implements SituacaoMarioInterface {
    public SituacaoMarioEnum estadoMario;
    public int pontuacao;

    public SituacaoMario(int pontuacao, SituacaoMarioEnum estadoMario) {
        this.pontuacao = pontuacao;
        this.estadoMario = estadoMario;
    }

    public int getPontuacao() {
        return this.pontuacao;
    }
}