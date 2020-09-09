package br.com.bandtec.EntregavelSprint01;

public class Main {
    public static void main(String[] args) {

        Faculdade f = new Faculdade(1200.0,0.10,"bandtec");
        Faculdade f1 = new Faculdade(1300.0,0.5,"maquenzie");
        Escola e = new Escola(700.0,0.25,"carlos gomes");
        Adicionar a = new Adicionar();

       a.criarFaculdade(f);
       a.criarEscola(e);
       a.criarFaculdade(f1);

       a.deleteInstituicao(3);
        System.out.println(a);




    }

}
