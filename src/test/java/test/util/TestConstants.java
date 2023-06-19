package test.util;

import java.time.LocalDate;
import java.util.List;

public final class TestConstants {
    public static final String DEFAULT_PROFISSAO_NOME = "Analista de Sistemas";
    public static final String DEFAULT_PROFISSAO_EMPRESA = "MJV";
    public static final Double DEFAULT_PROFISSAO_SALARIO = 1000.00;
    public static final boolean DEFAULT_PROFISSAO_EMPREGO_ATUAL = true;
    public static final List DEFAULT_PROFISSAO_HABILIDADES = List.of("proativo", "focado", "javeiro");


    public static final String DEFAULT_CANDIDATO_NOME = "Raimundo Nonato Loureiro Castelo Branco";
    public static final String DEFAULT_CANDIDATO_CPF = "13521779118";
    public static final LocalDate DEFAULT_CANDIDATO_DATA_NASCIMENTO = LocalDate.of(2001,9,12);


    public static final String DEFAULT_CONTATO_EMAIL = "raimundin@gmail.com";
    public static final String DEFAULT_CONTATO_TELEFONTE = "3269-8544";
    public static final String DEFAULT_CONTATO_CELULAR = "85988455663";
    public static final boolean DEFAULT_CONTATO_CELULAR_WHATS = true;

    public static final String DEFAULT_ENDERECO_LOGRADOURO = "Rua Teodoro de castro";
    public static final Integer DEFAULT_ENDERECO_NUMERO = 101;
    public static final String DEFAULT_ENDERECO_COMPLEMENTO = "perto do Pet Shop";
    public static final String DEFAULT_EDERECO_BAIRRO = "Granja Portugal";
    public static final String DEFAULT_ENDERECO_CIDADE = "Fortaleza";
    public static final String DEFAULT_ENDERECO_ESTADO = "Ceara";


    public static final Double DEFAULT_PRETENSAO_SALARIAL_VALOR_MIN = 1000.00;
    public static final Double DEFAULT_PRETENSAO_SALARIAL_VALOR_MAX = 10000.00;

    private TestConstants() {}
}
