package dto;

import entity.Candidato;

import static java.lang.Math.min;
import static java.lang.String.format;
import static java.time.format.DateTimeFormatter.ofPattern;

public class CandidatoDTO {
    private final String nome;
    private final String cpf;
    private final String dataNascimento;
    private final String sexo;
    private final EnderecoDTO enderecoDTO;
    private final ContatoDTO contatoDTO;
    private final DadosProfissionaisDTO dadosProfissionaisDTO;


    public static CandidatoDTO fromEntity(Candidato candidato){
        return new CandidatoDTO(
            format("%-30S",candidato.getNome().substring(0, min(candidato.getNome().length(), 30))),
            candidato.getCpf().replaceAll("\\D",""),
            candidato.getDataNascimento().format(ofPattern("yyyyMMdd")),
            candidato.getSexo().getSigla(),
            EnderecoDTO.fromEntity(candidato.getEndereco()),
            ContatoDTO.fromEntity(candidato.getContato()),
            DadosProfissionaisDTO.fromEntity(candidato.getDadosProfissionais())
        );
    }

    private CandidatoDTO(
        String nome,
        String cpf,
        String dataNascimento,
        String sexo,
        EnderecoDTO enderecoDTO,
        ContatoDTO contatoDTO,
        DadosProfissionaisDTO dadosProfissionaisDTO
    ) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.enderecoDTO = enderecoDTO;
        this.contatoDTO = contatoDTO;
        this.dadosProfissionaisDTO = dadosProfissionaisDTO;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public EnderecoDTO getEnderecoDTO() {
        return enderecoDTO;
    }

    public ContatoDTO getContatoDTO() {
        return contatoDTO;
    }

    public DadosProfissionaisDTO getDadosProfissionaisDTO() {
        return dadosProfissionaisDTO;
    }
}
