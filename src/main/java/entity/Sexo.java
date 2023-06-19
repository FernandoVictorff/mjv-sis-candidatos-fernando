package entity;

public enum Sexo {
    MASCULINO("M"),
    FEMININO("F");

    private final String sigla;

    Sexo(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }
}
