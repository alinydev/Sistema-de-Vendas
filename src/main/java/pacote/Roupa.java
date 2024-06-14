package pacote;

public abstract class Roupa extends ProdutoBase{

    private String tamanho;
    private String cor;

    public Roupa(String nome, double preco, String
            tamanho, String cor, int quantidade) {}

    public Roupa() {}

    public Roupa(String camiseta, int i) {
    }

    public String getTamanho() {
        return null;
    }

    public void setTamanho(String tamanho) {

    }

    public String getCor() {
        return null;
    }

    public abstract void setCor(String cor);

    public String getTipo() {
        return null;
    }

}
