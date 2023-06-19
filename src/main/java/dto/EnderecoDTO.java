package dto;

import entity.Endereco;

import static java.lang.Math.min;
import static java.lang.String.format;
import static java.util.Objects.isNull;

public class EnderecoDTO {
    private final String logradouro;
    private final String numero;
    private final String complemento;
    private final String bairro;
    private final String cidade;
    private final String estado;


    public static EnderecoDTO fromEntity(Endereco endereco) {
        return new EnderecoDTO(
            format("%40S", endereco.getLogradouro().substring(0, min(endereco.getLogradouro().length(), 39))),
            isNull(endereco.getNumero()) ? "S/N" : format("%05d", endereco.getNumero()),
            isNull(endereco.getNumero()) ? "S/C" : format("%20S", endereco.getComplemento()),
            format("%30S", endereco.getBairro().substring(0, min(endereco.getBairro().length(), 29))),
            format("%40S", endereco.getCidade().substring(0, min(endereco.getCidade().length(), 39))),
            endereco.getEstado().substring(0,2).toUpperCase()
        );
    }

    private EnderecoDTO(
        String logradouro,
        String numero,
        String complemento,
        String bairro,
        String cidade,
        String estado
    ) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
}
