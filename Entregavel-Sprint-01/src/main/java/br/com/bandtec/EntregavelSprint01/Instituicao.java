package br.com.bandtec.EntregavelSprint01;

public abstract class Instituicao {



        private Double valor;
        private Double reajusteValor;

    public Instituicao(Double valor, Double reajusteValor) {
        this.valor = valor;
        this.reajusteValor = reajusteValor;
    }

    public abstract Double getReajuste();




    public Double getValor() {
        return valor;
    }

    public Double getReajusteValor() {
        return reajusteValor;
    }

    @Override
    public String toString() {
        return "Instituicao{" +
                "valor=" + valor +
                ", reajusteValor=" + reajusteValor +
                '}';
    }
}





