package entity;

import java.util.Objects;

public class Contato {
    private final String email;
    private final String telefone;
    private final String celular;
    private final boolean celularWhats;

    private Contato(Builder builder) {
        email = builder.email;
        telefone = builder.telefone;
        celular = builder.celular;
        celularWhats = builder.celularWhats;
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

    public boolean isCelularWhats() {
        return celularWhats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return celularWhats == contato.celularWhats && Objects.equals(email, contato.email) && Objects.equals(telefone, contato.telefone) && Objects.equals(celular, contato.celular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, telefone, celular, celularWhats);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", celular='" + celular + '\'' +
                ", celularWhats=" + celularWhats +
                '}';
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private String email;
        private String telefone;
        private String celular;
        private boolean celularWhats;

        private Builder() {}

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder telefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public Builder celular(String celular) {
            this.celular = celular;
            return this;
        }

        public Builder celularWhats(boolean celularWhats) {
            this.celularWhats = celularWhats;
            return this;
        }

        public Contato build() {
            return new Contato(this);
        }
    }
}
