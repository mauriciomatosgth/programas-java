package entities;

import java.util.Objects;

public class RegistroDaEleicao {

    private String nomeDoCandidato;
    private Integer numeroDeVotos;

    public RegistroDaEleicao(String nomeDoCandidato, Integer numeroDeVotos) {
        this.nomeDoCandidato = nomeDoCandidato;
        this.numeroDeVotos = numeroDeVotos;
    }

    public String getNomeDoCandidato() {
        return nomeDoCandidato;
    }

    public void setNomeDoCandidato(String nomeDoCandidato) {
        this.nomeDoCandidato = nomeDoCandidato;
    }

    public Integer getNumeroDeVotos() {
        return numeroDeVotos;
    }

    public void setNumeroDeVotos(Integer numeroDeVotos) {
        this.numeroDeVotos = numeroDeVotos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegistroDaEleicao)) return false;
        RegistroDaEleicao that = (RegistroDaEleicao) o;
        return Objects.equals(nomeDoCandidato, that.nomeDoCandidato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeDoCandidato);
    }
}
