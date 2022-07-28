package model;

public class Produto_Lista1 {
    private int id;
    private String nome;
    private double valor;
    private int estoque;

    //Métodos construtores
    public Produto_Lista1() {

    }

    public Produto_Lista1(int id, String nome, double valor, int estoque) {
        super();
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }

    //Métodos acessores

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        int novoEstoque = this.estoque + estoque;
        if(novoEstoque > 0){
            this.estoque = estoque;
        }
    }

    @Override
    public String toString() {
        return "\nProduto_Lista1{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                ", estoque=" + estoque +
                '}';
    }
}
