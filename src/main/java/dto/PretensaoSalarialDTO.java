package dto;

import entity.PretensaoSalarial;

import static java.lang.String.format;

public class PretensaoSalarialDTO {
    private final String valorMax;
    private final String valorMin;

    public static PretensaoSalarialDTO fromEntity(PretensaoSalarial pretensaoSalarial) {
        return new PretensaoSalarialDTO(
            format("%011.2f", pretensaoSalarial.getValorMax()).replaceAll("\\D", ""),
            format("%011.2f", pretensaoSalarial.getValorMin()).replaceAll("\\D", "")
        );
    }

    private PretensaoSalarialDTO(String valorMax, String valorMin) {
        this.valorMax = valorMax;
        this.valorMin = valorMin;
    }

    public String getValorMax() {
        return valorMax;
    }

    public String getValorMin() {
        return valorMin;
    }
}
