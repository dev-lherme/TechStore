import javax.swing.*;

public class Main {
    static void main(String[] args) {
        //TECHSTORE - LOJA DE PERIFÉRICOS

        String nomeProduto = "Teclado Mecanico";
        double precoProduto = 150.00;
        int quantidadeEstoque = 10;

        String nomeProduto2 = "Mouse Gamer";
        double precoProduto2 = 89.90;
        int quantidadeEstoque2 = 15;

        //RECEBIMENTO DE NOVOS PRODUTOS
        int quantidadeRecebida = 5;

        //ATUALIZANDO ESTOQUE
        quantidadeEstoque2 += quantidadeRecebida;

        //CALCULANDO O VALOR TOTAL DO ESTOQUE
        double valorTotalEstoque = precoProduto2 * quantidadeEstoque2;

        //VENDA DE 3 MOUSES GAMER
        int vendaProduto2 = 3;
        quantidadeEstoque2 -= vendaProduto2;
        valorTotalEstoque = precoProduto2 * quantidadeEstoque2;

        //EXIBINDO RESULTADOS

        //CADASTRO DE PRODUTOS

        System.out.println("=== PRODUTO CADASTRADO ===");

        System.out.println("Produto: " + nomeProduto);
        System.out.printf("Preço: R$ %.2f%n", precoProduto);
        System.out.println("Estoque: " + quantidadeEstoque);

        System.out.println("=== PRODUTO CADASTRADO ===");

        System.out.println("Produto: " + nomeProduto2);
        System.out.printf("Preço: R$ %.2f%n", precoProduto2);
        System.out.println("Estoque: " + quantidadeEstoque2);

        //CONTROLE DE ESTOQUE

        System.out.println("=== CONTROLE DE ESTOQUE P2 ===");
        System.out.println("Produto: " + nomeProduto2);
        System.out.printf("Preço: R$ %.2f%n", precoProduto2);
        System.out.println("Estoque: " + quantidadeEstoque2);
        System.out.printf("Valor total do estoque: R$ %.2f%n", valorTotalEstoque);

        // ===== CONDICIONAIS =====

        //VENDA DE 5 TECLADOS MECÂNICOS
        int vendaProduto = 5;
        boolean temCupom = false;
        boolean produtoEmPromocao = true;

        if (quantidadeEstoque >= vendaProduto && vendaProduto > 0 && (temCupom || produtoEmPromocao)) {
            quantidadeEstoque -=vendaProduto;
            System.out.println("Venda autorizada!");
            System.out.println("Quantidade Restante: "+quantidadeEstoque);
        } else {
            System.out.println("Venda não autorizada!");
            System.out.println("Estoque atual: "+ quantidadeEstoque);
        }
    }
}