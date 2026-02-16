public class Condicionais {
    public static void main(String[] args) {

        int anoDeLancamento = 2020;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        // ==========================
        // 1) CONDICIONAL SIMPLES (IF/ELSE)
        // ==========================
        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir");
        }

        // ==========================
        // 2) CONDICIONAL COM BOOLEAN + STRING
        // ==========================
        // Em Java, NÃO precisa fazer: incluidoNoPlano == true
        // Basta usar: incluidoNoPlano
        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Deve pagar a assinatura.");
        }

        // ==========================
        // 3) CONDICIONAL EXTRA COM NOTA (exemplo real)
        // ==========================
        if (notaDoFilme >= 8.0) {
            System.out.println("Filme bem avaliado!");
        } else if (notaDoFilme >= 6.0) {
            System.out.println("Filme ok, dá pra assistir.");
        } else {
            System.out.println("Filme fraco...");
        }

        // ==========================
        // 4) CONDICIONAL COM && (plano + ano)
        // ==========================
        if (tipoPlano.equals("plus") && anoDeLancamento >= 2022) {
            System.out.println("Plano PLUS com lançamento recente: acesso premium!");
        } else {
            System.out.println("Acesso padrão.");
        }
    }
}
