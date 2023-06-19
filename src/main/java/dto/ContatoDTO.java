package dto;

import entity.Contato;

import static java.lang.Integer.valueOf;
import static java.lang.Math.min;
import static java.lang.String.format;
import static java.util.Objects.isNull;

public class ContatoDTO {
    private final String email;
    private final String telefone;
    private final String celular;
    private final String celularWhats;
    public static ContatoDTO fromEntity(Contato contato){
        return new ContatoDTO(
            format("%50s", contato.getEmail().substring(min(contato.getEmail().length(), 50))),
            format("%010d", isNull(contato.getTelefone()) ? valueOf(0) : valueOf(contato.getTelefone().replaceAll("\\D", ""))),
            format("%11s", contato.getCelular().replaceAll("\\D", "")),
            isNull(contato.getCelular()) ? "0" : (contato.isCelularWhats()) ? "T" : "F"
        );
    }

    private ContatoDTO(
        String email,
        String telefone,
        String celular,
        String celularWhats
    ) {
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.celularWhats = celularWhats;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }

    public String getCelularWhats() {
        return celularWhats;
    }
}
