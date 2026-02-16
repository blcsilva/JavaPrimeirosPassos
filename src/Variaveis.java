/*
TIPOS DE VARIÁVEIS EM JAVA (COM EXEMPLOS)

Use:
- int, long -> números inteiros (idade, quantidade, contador)
- double, float -> números decimais (preço, altura, salário)
- boolean -> verdadeiro/falso (ligado, ativo, válido)
- char -> 1 caractere (letra, símbolo)
- String -> texto (nome, email, mensagem, CPF)
*/

public class Variaveis {
    public static void main(String[] args) {

        // Inteiros
        byte idadeByte = 25;
        short anoShort = 2026;
        int quantidade = 100;
        long populacao = 214000000L;

        // Decimais
        float alturaFloat = 1.75F;
        double preco = 19.90;

        // Verdadeiro/Falso
        boolean ativo = true;

        // Caractere
        char letra = 'A';

        // Texto
        String nome = "Bruno";
        String email = "bruno@email.com";
        String cpf = "123.456.789-00";

        // Exibindo valores
        System.out.println("idadeByte: " + idadeByte);
        System.out.println("anoShort: " + anoShort);
        System.out.println("quantidade: " + quantidade);
        System.out.println("populacao: " + populacao);
        System.out.println("alturaFloat: " + alturaFloat);
        System.out.println("preco: " + preco);
        System.out.println("ativo: " + ativo);
        System.out.println("letra: " + letra);
        System.out.println("nome: " + nome);
        System.out.println("email: " + email);
        System.out.println("cpf: " + cpf);
    }
}
