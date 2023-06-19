package service;

import dto.CandidatoDTO;
import entity.Candidato;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;

public class CadastroService {
    private static final String DELIMITER = ";";
    private static final String DEFAULT_PATH = "jobby/files/";
    private static final String DEFAULT_EXTENSION = ".csv";

    public static String transformandoCandidatosEmTextoParaArquivoCsv(Candidato ...candidatos) {
        StringBuilder sb = new StringBuilder();
        for (Candidato candidato: candidatos) {
            CandidatoDTO candidatoDTO = CandidatoDTO.fromEntity(candidato);
            sb.append(candidatoDTO.getNome() + DELIMITER)
                .append(candidatoDTO.getCpf() + DELIMITER)
                .append(candidatoDTO.getDataNascimento() + DELIMITER)
                .append(candidatoDTO.getSexo() + DELIMITER)
                .append(candidatoDTO.getEnderecoDTO().getLogradouro() + DELIMITER)
                .append(candidatoDTO.getEnderecoDTO().getNumero() + DELIMITER)
                .append(candidatoDTO.getEnderecoDTO().getComplemento() + DELIMITER)
                .append(candidatoDTO.getEnderecoDTO().getBairro() + DELIMITER)
                .append(candidatoDTO.getEnderecoDTO().getCidade() + DELIMITER)
                .append(candidatoDTO.getEnderecoDTO().getEstado() + DELIMITER)
                .append(candidatoDTO.getContatoDTO().getEmail() + DELIMITER)
                .append(candidatoDTO.getContatoDTO().getTelefone() + DELIMITER)
                .append(candidatoDTO.getContatoDTO().getCelular() + DELIMITER)
                .append(candidatoDTO.getContatoDTO().getCelularWhats() + DELIMITER)
                .append(candidatoDTO.getDadosProfissionaisDTO().getNome() + DELIMITER)
                .append(candidatoDTO.getDadosProfissionaisDTO().getEmpresa() + DELIMITER)
                .append(candidatoDTO.getDadosProfissionaisDTO().getSalario() + DELIMITER)
                .append(candidatoDTO.getDadosProfissionaisDTO().getEmpregoAtual() + DELIMITER)
                .append(candidatoDTO.getDadosProfissionaisDTO().getPretensaoSalarialDTO().getValorMin() + DELIMITER)
                .append(candidatoDTO.getDadosProfissionaisDTO().getPretensaoSalarialDTO().getValorMax() + DELIMITER)
                .append(candidatoDTO.getDadosProfissionaisDTO().getHabilidades() + DELIMITER)
                .append("\n");
        }
        return sb.toString();
    }

    public static void gerandoArquivoCsvDeVariosCandidatos(Candidato ...candidatos) throws IOException {
        String texto = transformandoCandidatosEmTextoParaArquivoCsv(candidatos);
        try(FileWriter out = new FileWriter(DEFAULT_PATH + "cadastro-candidatos" + "-" + LocalDate.now() + DEFAULT_EXTENSION, StandardCharsets.UTF_8)) {
            out.write(texto);
        }
    }

    public static void gerandoArquivoCsvAPartirDoCandidato(Candidato candidato) throws IOException {
        String texto = transformandoCandidatosEmTextoParaArquivoCsv(candidato);
        try(FileWriter out = new FileWriter(DEFAULT_PATH + "cadastro" + "-" + candidato.getCpf() + DEFAULT_EXTENSION, StandardCharsets.UTF_8)) {
            out.write(texto);
        }
    }
}
