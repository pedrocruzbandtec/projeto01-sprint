package br.com.bandtec.EntregavelSprint01;

public class Escola extends Instituicao {



        private String nome;


        public Escola(Double valor, Double reajusteValor, String nome) {
            super(valor, reajusteValor);
            this.nome = nome;
        }

    @Override
    public Double getReajuste() {
        return getValor()*2;
    }


    @Override
    public String toString() {
        return  "\n"+"Escola{" +
                "nome='" + nome + '\'' +
                "} " + super.toString();
    }



        public String getNome() {
            return nome;
        }
    }






