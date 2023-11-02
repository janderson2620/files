package entities;

public class Product {

    String nome;
    Double valor;
    Integer qtd;

    public Product (){
    }

    public Product(String nome, Double valor, Integer qtd) {
        this.nome = nome;
        this.valor = valor;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Double calcValor(){
        return valor * qtd;
    }


}
