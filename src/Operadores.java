/*
OPERADORES EM JAVA (COM EXEMPLOS COMPLETOS)

Use:
- Aritméticos -> contas ( +  -  *  /  % )
- Atribuição -> atribuir valores ( =  +=  -=  *=  /=  %= )
- Relacionais -> comparar ( ==  !=  >  <  >=  <= )
- Lógicos -> condições ( &&  ||  ! )
- Incremento/Decremento -> contador ( ++  -- )
- Ternário -> if simplificado ( ? : )
- Bitwise -> operações em bits ( &  |  ^  ~  <<  >>  >>> )
- Comparação String -> SEMPRE usar equals (equals, equalsIgnoreCase)
*/

public class Operadores {
    public static void main(String[] args) {

        // ==========================
        // 1) OPERADORES ARITMÉTICOS
        // ==========================
        int a = 10;
        int b = 3;

        System.out.println("Aritméticos:");
        System.out.println("a + b = " + (a + b)); // 13
        System.out.println("a - b = " + (a - b)); // 7
        System.out.println("a * b = " + (a * b)); // 30
        System.out.println("a / b = " + (a / b)); // 3 (divisão inteira)
        System.out.println("a % b = " + (a % b)); // 1 (resto)

        // ==========================
        // 2) OPERADORES DE ATRIBUIÇÃO
        // ==========================
        int x = 5;

        x += 2; // x = x + 2  -> 7
        x -= 1; // x = x - 1  -> 6
        x *= 3; // x = x * 3  -> 18
        x /= 2; // x = x / 2  -> 9
        x %= 4; // x = x % 4  -> 1

        System.out.println("\nAtribuição:");
        System.out.println("x final = " + x);

        // ==========================
        // 3) OPERADORES RELACIONAIS
        // ==========================
        int idade = 18;

        System.out.println("\nRelacionais:");
        System.out.println("idade == 18: " + (idade == 18));
        System.out.println("idade != 18: " + (idade != 18));
        System.out.println("idade > 18: " + (idade > 18));
        System.out.println("idade < 18: " + (idade < 18));
        System.out.println("idade >= 18: " + (idade >= 18));
        System.out.println("idade <= 18: " + (idade <= 18));

        // ==========================
        // 4) OPERADORES LÓGICOS
        // ==========================
        boolean temLogin = true;
        boolean temPermissao = false;

        System.out.println("\nLógicos:");
        System.out.println("temLogin && temPermissao: " + (temLogin && temPermissao));
        System.out.println("temLogin || temPermissao: " + (temLogin || temPermissao));
        System.out.println("!temLogin: " + (!temLogin));

        // ==========================
        // 5) INCREMENTO E DECREMENTO
        // ==========================
        int contador = 0;

        contador++; // soma 1 -> 1
        contador++; // soma 1 -> 2
        contador--; // subtrai 1 -> 1

        System.out.println("\nIncremento/Decremento:");
        System.out.println("contador = " + contador);

        // ==========================
        // 6) OPERADOR TERNÁRIO
        // ==========================
        int nota = 7;

        String resultado = (nota >= 6) ? "Aprovado" : "Reprovado";

        System.out.println("\nTernário:");
        System.out.println("resultado = " + resultado);

        // ==========================
        // 7) OPERADORES BITWISE (BITS)
        // ==========================
        // Trabalham bit a bit.
        // Muito usado em flags, permissões, redes, performance e baixo nível.

        int p = 6; // binário: 0110
        int q = 3; // binário: 0011

        System.out.println("\nBitwise:");
        System.out.println("p = " + p + " (0110)");
        System.out.println("q = " + q + " (0011)");

        System.out.println("p & q = " + (p & q)); // AND  -> 0010 -> 2
        System.out.println("p | q = " + (p | q)); // OR   -> 0111 -> 7
        System.out.println("p ^ q = " + (p ^ q)); // XOR  -> 0101 -> 5
        System.out.println("~p = " + (~p));        // NOT  -> inverte bits (resultado negativo)

        // SHIFT
        int n = 4; // 0100

        System.out.println("\nShift:");
        System.out.println("n = " + n); // 4
        System.out.println("n << 1 = " + (n << 1)); // 8  (multiplica por 2)
        System.out.println("n >> 1 = " + (n >> 1)); // 2  (divide por 2)
        System.out.println("n >>> 1 = " + (n >>> 1)); // shift sem sinal

        // ==========================
        // 8) COMPARAÇÃO DE STRING (CORRETA)
        // ==========================
        // NUNCA compare String com == para conteúdo.
        // == compara referência (memória), não texto.

        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = "JAVA";

        System.out.println("\nComparação String:");
        System.out.println("s1 == s2: " + (s1 == s2)); // pode dar true (pool)
        System.out.println("s1 == s3: " + (s1 == s3)); // false (objetos diferentes)

        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true
        System.out.println("s1.equals(s4): " + s1.equals(s4)); // false
        System.out.println("s1.equalsIgnoreCase(s4): " + s1.equalsIgnoreCase(s4)); // true

        // ==========================
        // 9) EXEMPLO REAL COM IF
        // Altere o valor das tentativas para atender a condicional.
        // ==========================
        int tentativas = 0;
        boolean senhaCorreta = false;

        if (tentativas > 0 && !senhaCorreta) {
            System.out.println("\nExemplo real:");
            System.out.println("Você ainda pode tentar login.");
        } else {
            System.out.println("\nExemplo real:");
            System.out.println("Acesso bloqueado.");
        }
    }
}
