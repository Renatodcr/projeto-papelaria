package projetointerdiciplinar;

import br.com.interfac.Manipulacao;
import java.util.Scanner;

public class Papel extends Produto implements Manipulacao {

    private String cor;
    private String tipo;
    private float largura;
    private float altura;
    private int gramatura;
    private boolean paltado;

    public Papel() {

    }

    public Papel(String cor, String tipo, float largura, float altura, int gramatura, boolean paltado) {
        this.cor = cor;
        this.tipo = tipo;
        this.largura = largura;
        this.altura = altura;
        this.gramatura = gramatura;
        this.paltado = paltado;
    }

    //Metodos de acessos
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getGramatura() {
        return gramatura;
    }

    public void setGramatura(int gramatura) {
        this.gramatura = gramatura;
    }

    public boolean isPaltado() {
        return paltado;
    }

    public void setPaltado(boolean paltado) {
        this.paltado = paltado;
    }
    //Método para cadastrar Objeto Papel
    @Override
    public boolean cadastro() {
        Scanner tec = new Scanner(System.in);
        System.out.println("\nCadastro Papel: ");
        System.out.println("Digite a cor do papel: ");
        setCor(tec.next());
        System.out.println("Digite o tipo do papel: ");
        setTipo(tec.next());
        System.out.println("Digite a largura do papel: ");
        setLargura(tec.nextFloat());
        System.out.println("Digite a altura do papel: ");
        setAltura(tec.nextFloat());
        System.out.println("Digite a gramatura do papel: ");
        setGramatura(tec.nextInt());
        System.out.println("O papel é paltado? Digite sim ou não: ");
        String paltado = tec.next();
        if (paltado.equalsIgnoreCase("sim")) {
            setPaltado(true);
        } else {
            setPaltado(false);
        }
        System.out.println("Digite a marca: ");
        setMarca(tec.next());
        System.out.println("Digite o valor: ");
        setValor(tec.nextFloat());

        return true;
    }
    //Método para consultar Objeto Papel
    @Override
    public String consulta() {
        String palta;
        if (this.paltado == true) {
            palta = "Sim";
        } else {
            palta = "Não";
        }
        return "\nCor: " + this.cor + " \nTipo: " + this.tipo + " \nLargura: " + this.largura
                + " \nAltura: " + this.altura + " \nGramatura: " + this.gramatura + " \nPaltado: "
                + palta + "\nMarca: " + getMarca() + "\nValor: " + getValor();
    }

    @Override
    public String toString() {
        return "Papel{" + "cor=" + cor + ", tipo=" + tipo + ", largura="
                + largura + ", altura=" + altura + ", gramatura=" + gramatura + ", paltado=" + paltado + '}';
    }

}
