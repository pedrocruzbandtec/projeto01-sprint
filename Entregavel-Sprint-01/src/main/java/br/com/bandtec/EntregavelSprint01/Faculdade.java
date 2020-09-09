package br.com.bandtec.EntregavelSprint01;

public class Faculdade extends Instituicao {


    private String nome;


    public Faculdade(Double valor, Double reajusteValor, String nome) {
        super(valor, reajusteValor);
        this.nome = nome;
    }

    @Override
    public Double getReajuste() {
        return getValor()*getReajusteValor();
    }

    @Override
    public String toString() {
        return "\n"+"Faculdade{" +
                "nome='" + nome +   ", valor total="+ getReajuste()+
                "} " + super.toString();
    }





    public String getNome() {
        return nome;
    }


}





