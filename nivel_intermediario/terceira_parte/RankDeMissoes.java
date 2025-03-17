package nivel_intermediario.terceira_parte;

public enum RankDeMissoes {
    E("Nível baixíssimo", 1),
    D("Nível muito baixo", 2),
    C("Nível baixo", 3),
    B("Nível moderado", 5),
    A("Nível alto", 6),
    S("Nível muito alto", 8),
    SS("Nível hokage", 10);

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}
