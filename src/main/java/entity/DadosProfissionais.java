package entity;

import java.util.List;
import java.util.Objects;

public class DadosProfissionais {
    private final String nome;
    private final String empresa;
    private final Double salario;
    private final boolean empregoAtual;
    private final List habilidades;
    private final PretensaoSalarial pretensaoSalarial;


    private DadosProfissionais(Builder builder) {
        nome = builder.nome;
        empresa = builder.empresa;
        salario = builder.salario;
        empregoAtual = builder.empregoAtual;
        habilidades = builder.habilidades;
        pretensaoSalarial = builder.pretensaoSalarial;
    }

    public String getNome() {
        return nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public Double getSalario() {
        return salario;
    }

    public boolean isEmpregoAtual() {
        return empregoAtual;
    }

    public List getHabilidades() {
        return habilidades;
    }

    public PretensaoSalarial getPretensaoSalarial() {
        return pretensaoSalarial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DadosProfissionais that = (DadosProfissionais) o;
        return empregoAtual == that.empregoAtual && Objects.equals(nome, that.nome) && Objects.equals(empresa, that.empresa) && Objects.equals(salario, that.salario) && Objects.equals(habilidades, that.habilidades) && Objects.equals(pretensaoSalarial, that.pretensaoSalarial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, empresa, salario, empregoAtual, habilidades, pretensaoSalarial);
    }

    @Override
    public String toString() {
        return "DadosProfissionais{" +
                "nome='" + nome + '\'' +
                ", empresa='" + empresa + '\'' +
                ", salario=" + salario +
                ", empregoAtual=" + empregoAtual +
                ", habilidades=" + habilidades +
                ", pretensaoSalarial=" + pretensaoSalarial +
                '}';
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private String nome;
        private String empresa;
        private Double salario;
        private boolean empregoAtual;
        private List habilidades;
        private PretensaoSalarial pretensaoSalarial;

        private Builder() {}

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder empresa(String empresa) {
            this.empresa = empresa;
            return this;
        }

        public Builder salario(Double salario) {
            this.salario = salario;
            return this;
        }

        public Builder empregoAtual(boolean empregoAtual) {
            this.empregoAtual = empregoAtual;
            return this;
        }

        public Builder habilidades(List habilidades) {
            this.habilidades = habilidades;
            return this;
        }

        public Builder pretensaoSalarial(PretensaoSalarial pretensaoSalarial) {
            this.pretensaoSalarial = pretensaoSalarial;
            return this;
        }

        public DadosProfissionais build() {
            return new DadosProfissionais(this);
        }
    }
}
