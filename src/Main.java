public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercicio Calculadora");
        Calculadora.soma(5,3);
        Calculadora.subtracao(4.2f,3.8f);
        Calculadora.divisao(3,2);
        Calculadora.multiplicacao(8.2f,2.4f);
        Calculadora.restoDivisao(7,4);

        //Mensagem
        System.out.println("Exercicio mengsagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);
        Mensagem.obterMensagem(100);

        //Emprestimo
        System.out.println("Exercicio emprestimo");

        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 1);



    }
}