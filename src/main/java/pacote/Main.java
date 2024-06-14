package pacote;

public class Main {

    public static void main(String[] args) {
        // Criar duas instâncias de CarrinhoDeCompras
        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();
        CarrinhoDeCompras carrinho2 = new CarrinhoDeCompras();

        // Adicionar itens ao primeiro carrinho
        carrinho1.adicionarItem(new Eletronico("Smartphone Samsung A54", 1600));
        carrinho1.adicionarItem(new Roupa("Vestido", 150) {

            public void setCor(String cor) {}

        });

        // Adicionar mais itens ao segundo carrinho
        carrinho2.adicionarItem(new Eletronico("Fone de ouvido", 80));
        carrinho2.adicionarItem(new Roupa("Calça jeans", 40) {

            public void setCor(String cor) {}
        });
        carrinho2.adicionarItem(new Alimento("Café 1 kg", (int) 8.50));

        // Listar os produtos e o total de ambos os CarrinhoDeCompras
        System.out.println("Produtos no Carrinho 1:");
        carrinho1.listarProdutos();
        System.out.println("Total: " + carrinho1.calcularTotal());

        System.out.println("Produtos no Carrinho 2:");
        carrinho2.listarProdutos();
        System.out.println("Total: " + carrinho2.calcularTotal());

        // Gravar os arquivos referentes a cada carrinho de compras
        carrinho1.gravarCarrinho("carrinho1.txt");
        carrinho2.gravarCarrinho("carrinho2.txt");
    }
}
