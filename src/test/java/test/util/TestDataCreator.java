package test.util;

import entity.*;

import static entity.Sexo.MASCULINO;
import static test.util.TestConstants.*;

public final class TestDataCreator {

    public static Candidato.Builder newCandidatoBuilder(
        Endereco endereco,
        Contato contato,
        DadosProfissionais dadosProfissionais
    ) {
        return Candidato.newBuilder()
            .nome(DEFAULT_CANDIDATO_NOME)
            .cpf(DEFAULT_CANDIDATO_CPF)
            .dataNascimento(DEFAULT_CANDIDATO_DATA_NASCIMENTO)
            .sexo(MASCULINO)
            .endereco(endereco)
            .contato(contato)
            .dadosProfissionais(dadosProfissionais);
    }


    public static DadosProfissionais.Builder newProfissaoBuilder(PretensaoSalarial pretensaoSalarial) {
        return DadosProfissionais.newBuilder()
            .nome(DEFAULT_PROFISSAO_NOME)
            .empresa(DEFAULT_PROFISSAO_EMPRESA)
            .salario(DEFAULT_PROFISSAO_SALARIO)
            .empregoAtual(DEFAULT_PROFISSAO_EMPREGO_ATUAL)
            .habilidades(DEFAULT_PROFISSAO_HABILIDADES)
            .pretensaoSalarial(pretensaoSalarial);
    }

    public static Contato.Builder newContatoBuilder() {
        return Contato.newBuilder()
            .email(DEFAULT_CONTATO_EMAIL)
            .telefone(DEFAULT_CONTATO_TELEFONTE)
            .celular(DEFAULT_CONTATO_CELULAR)
            .celularWhats(DEFAULT_CONTATO_CELULAR_WHATS);
    }

    public static Endereco.Builder newEnderecoBuilder() {
        return Endereco.newBuilder()
            .logradouro(DEFAULT_ENDERECO_LOGRADOURO)
            .numero(DEFAULT_ENDERECO_NUMERO)
            .complemento(DEFAULT_ENDERECO_COMPLEMENTO)
            .bairro(DEFAULT_EDERECO_BAIRRO)
            .cidade(DEFAULT_ENDERECO_CIDADE)
            .estado(DEFAULT_ENDERECO_ESTADO);
    }

    public static PretensaoSalarial.Builder newPretensaoSalarial() {
        return PretensaoSalarial.newBuilder()
            .valorMin(DEFAULT_PRETENSAO_SALARIAL_VALOR_MIN)
            .valorMax(DEFAULT_PRETENSAO_SALARIAL_VALOR_MAX);
    }

    private TestDataCreator() {}
}