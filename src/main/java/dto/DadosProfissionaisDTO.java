package dto;

import entity.DadosProfissionais;

import java.util.Arrays;

import static java.lang.Math.min;
import static java.lang.String.format;

public class DadosProfissionaisDTO {
    private final String nome;
    private final String empresa;
    private final String salario;
    private final String empregoAtual;
    private final PretensaoSalarialDTO pretensaoSalarialDTO;
    private final String habilidades;


    public static DadosProfissionaisDTO fromEntity(DadosProfissionais dadosProfissionais) {
        return new DadosProfissionaisDTO(
            format("%30S", (dadosProfissionais.getNome().isEmpty()) ? "" : dadosProfissionais.getNome().substring(0, min(dadosProfissionais.getNome().length(), 30))),
            format("%30S", dadosProfissionais.getEmpresa().substring(0, min(dadosProfissionais.getEmpresa().length(), 30))),
            format("%011.2f", dadosProfissionais.getSalario()).replaceAll("\\D", ""),
            (dadosProfissionais.isEmpregoAtual()) ? "T" : "F",
            PretensaoSalarialDTO.fromEntity(dadosProfissionais.getPretensaoSalarial()),
            Arrays.toString(dadosProfissionais.getHabilidades().toArray()).replaceAll("([^\\w\\s])", "").replace(" ", "-").toUpperCase()
        );
    }


    private DadosProfissionaisDTO(
        String nome,
        String empresa,
        String salario,
        String empregoAtual,
        PretensaoSalarialDTO pretensaoSalarialDTO,
        String habilidades
    ) {
        this.nome = nome;
        this.empresa = empresa;
        this.salario = salario;
        this.empregoAtual = empregoAtual;
        this.pretensaoSalarialDTO = pretensaoSalarialDTO;
        this.habilidades = habilidades;
    }

    public String getNome() {
        return nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getSalario() {
        return salario;
    }

    public String getEmpregoAtual() {
        return empregoAtual;
    }

    public PretensaoSalarialDTO getPretensaoSalarialDTO() {
        return pretensaoSalarialDTO;
    }

    public String getHabilidades() {
        return habilidades;
    }
}
