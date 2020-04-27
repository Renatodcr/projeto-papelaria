package projetointerdiciplinar;

import br.com.interfac.Manipulacao;
import java.util.Scanner;

public class CaixaLapis extends Produto implements Manipulacao {

    private int quantidade;
    private boolean colorido;

    public CaixaLapis() {

    }

    public CaixaLapis(int quantidade, boolean colorido) {
        this.quantidade = quantidade;
        this.colorido = colorido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isColorido() {
        return colorido;
    }

    public void setColorido(boolean colorido) {
        this.colorido = colorido;
    }
    //Método para cadastrar Objeto Caixa de Lápis
    @Override
    public boolean cadastro() {

        Scanner tec = new Scanner(System.in);
        System.out.println("\nCadastro Caixa de Lápis: ");
        System.out.println("Digite a quantidade de lápis: ");
        setQuantidade(tec.nextInt());

        System.out.println("Os lápis são coloridos? Digite sim ou não: ");
        String colorido = tec.next();
        if (colorido.equalsIgnoreCase("sim")) {
            setColorido(true);
        } else {
            setColorido(false);
        }

        System.out.println("Digite a marca da caixa lápis: ");
        setMarca(tec.next());

        System.out.println("Digite o valor da caixa de lápis: ");
        setValor(tec.nextFloat());

        return true;

    }
    //Método para Consultar Objeto Caixa de Lápis
    @Override
    public String consulta() {
        String cor;
        if (this.colorido == true) {
            cor = "Sim";
        } else {
            cor = "Não";
        }
        return " \nColorido: " + cor + " \nQuantidade: " + this.quantidade
                + "\nMarca: " + getMarca() + "\nValor: " + getValor();
    }

    @Override
    public String toString() {
        return "quantidade: " + quantidade + "colorido: " + colorido;
    }

}
