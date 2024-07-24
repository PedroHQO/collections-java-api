package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class PalavraUnica {

    //atributo
    private String palavra;

    public PalavraUnica(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PalavraUnica that = (PalavraUnica) o;
        return Objects.equals(getPalavra(), that.getPalavra());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getPalavra());
    }

    @Override
    public String toString() {
        return "PalavraUnica{" +
                "palavra: '" + palavra + '\'' +
                '}';
    }
}
