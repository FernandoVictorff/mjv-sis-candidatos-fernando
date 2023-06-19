package entity;

import java.time.LocalDate;
import java.util.Objects;

public class Candidato {
    private final String nome;
    private final String cpf;
    private final LocalDate dataNascimento;
    private final Sexo sexo;
    private final Endereco endereco;
    private final Contato contato;
    private final DadosProfissionais dadosProfissionais;


    public Candidato(Builder builder) {
        nome = builder.nome;
        cpf = builder.cpf;
        dataNascimento = builder.dataNascimento;
        sexo = builder.sexo;
        endereco = builder.endereco;
        contato = builder.contato;
        dadosProfissionais = builder.dadosProfissionais;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public DadosProfissionais getDadosProfissionais() {
        return dadosProfissionais;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidato candidato = (Candidato) o;
        return Objects.equals(nome, candidato.nome) && Objects.equals(cpf, candidato.cpf) && Objects.equals(dataNascimento, candidato.dataNascimento) && sexo == candidato.sexo && Objects.equals(endereco, candidato.endereco) && Objects.equals(contato, candidato.contato) && Objects.equals(dadosProfissionais, candidato.dadosProfissionais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, dataNascimento, sexo, endereco, contato, dadosProfissionais);
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", sexo=" + sexo +
                ", endereco=" + endereco +
                ", contato=" + contato +
                ", dadosProfissionais=" + dadosProfissionais +
                '}';
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private String nome;
        private String cpf;
        private LocalDate dataNascimento;
        private Sexo sexo;
        private Endereco endereco;
        private Contato contato;
        private DadosProfissionais dadosProfissionais;

        private Builder() {}

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder cpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public Builder dataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
            return this;
        }

        public Builder sexo(Sexo sexo) {
            this.sexo = sexo;
            return this;
        }

        public Builder endereco(Endereco endereco) {
            this.endereco = endereco;
            return this;
        }

        public Builder contato(Contato contato) {
            this.contato = contato;
            return this;
        }

        public Builder dadosProfissionais(DadosProfissionais dadosProfissionais) {
            this.dadosProfissionais = dadosProfissionais;
            return this;
        }

        public Candidato build() {
            return new Candidato(this);
        }
    }
}
