package projetointerdiciplinar;

import java.util.ArrayList;

import br.com.interfac.Manipulacao;

public class Pedido implements Manipulacao {

    private Data data;
    private Cliente cliente;
    private float totalPedido;
    private ArrayList<Papel> papel;
    private ArrayList<CaixaLapis> cxLapis;
    private ArrayList<Caderno> caderno;

    public Pedido() {
    }
    //Método para calcular o Valor Total do Pedido
    public void calculaTotalPedido() {
        float valor = 0;
        float valor1 = 0;
        float valor2 = 0;
        for (Papel p : papel) {
            valor += p.getValor();
        }
        for (CaixaLapis l : cxLapis) {
            valor1 += l.getValor();
        }
        for (Caderno c : caderno) {
            valor2 += c.getValor();
        }
        totalPedido = valor + valor1 + valor2;
        totalPedido = (float) (totalPedido + (totalPedido * 0.18));
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(float totalPedido) {
        this.totalPedido = totalPedido;
    }

    public ArrayList<CaixaLapis> getCxLapis() {
        return cxLapis;
    }

    public void setCxLapis(ArrayList<CaixaLapis> cxLapis) {
        this.cxLapis = cxLapis;
    }

    public ArrayList<Papel> getPapel() {
        return papel;
    }

    public void setPapel(ArrayList<Papel> papel) {
        this.papel = papel;
    }

    public ArrayList<Caderno> getCaderno() {
        return caderno;
    }

    public void setCarderno(ArrayList<Caderno> caderno) {
        this.caderno = caderno;
    }

    @Override
    public boolean cadastro() {
        return true;
    }
    //Método para consultar pedido digitado
    @Override
    public String consulta() {
        String listaCx = "";
        String listaPapel = "";
        String listaCaderno = "";
        int i = 1, j = 1, t = 1;
        for (Papel p : papel) {
            listaPapel += "\n\n=== Papel " + (i++) + " ===";
            listaPapel += p.consulta();
        }
        for (CaixaLapis l : cxLapis) {
            listaCx += "\n\n=== Caixa Lápis " + (j++) + " ===";
            listaCx += l.consulta();
        }
        for (Caderno c : caderno) {
            listaCaderno += "\n\n=== Caderno " + (t++) + " ===";
            listaCaderno += c.consulta();
        }

        return "Data: " + this.data.getDia() + "/" + this.data.getMes() + "/" + this.data.getAno()
                + "\nNome: " + this.cliente.getNome() + "\nCPF: " + this.cliente.getCpf()
                + "\nTelefone: " + this.cliente.getTelefone()
                + listaPapel + listaCx
                + listaCaderno + "\n\nTotal Pedido: " + this.totalPedido + "\n";

    }

}
