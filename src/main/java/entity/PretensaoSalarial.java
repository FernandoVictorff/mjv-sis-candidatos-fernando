package entity;

import java.util.Objects;

public class PretensaoSalarial {
    private final Double valorMin;
    private final Double valorMax;

    private PretensaoSalarial(Builder builder) {
        valorMin = builder.valorMin;
        valorMax = builder.valorMax;
    }

    public Double getValorMin() {
        return valorMin;
    }

    public Double getValorMax() {
        return valorMax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PretensaoSalarial that = (PretensaoSalarial) o;
        return Objects.equals(valorMin, that.valorMin) && Objects.equals(valorMax, that.valorMax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valorMin, valorMax);
    }

    @Override
    public String toString() {
        return "PretensaoSalarial{" +
                "valorMin=" + valorMin +
                ", valorMax=" + valorMax +
                '}';
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private Double valorMin;
        private Double valorMax;

        private Builder() {}

        public Builder valorMin(Double valorMin) {
            this.valorMin = valorMin;
            return this;
        }

        public Builder valorMax(Double valorMax) {
            this.valorMax = valorMax;
            return this;
        }

        public PretensaoSalarial build() {
            return new PretensaoSalarial(this);
        }
    }
}
