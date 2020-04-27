package projetointerdiciplinar;

public abstract class Produto {

    private String marca;
    private float valor;

    public Produto() {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}
