package projetointerdiciplinar;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoInterdiciplinar {

    public static void main(String[] args) {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        String as, ta, ja;
        int menu;
        int menu2;
        do {
            exibirMenu();
            menu = entrada.nextInt();

            switch (menu) {

                case 1://Cadastro do Pedido
                    ArrayList<CaixaLapis> cxLapis = new ArrayList<>();
                    ArrayList<Papel> papel = new ArrayList<>();
                    ArrayList<Caderno> caderno = new ArrayList<>();

                    System.out.println("=== Cadastrar Pedido ===");

                    Data data = new Data();
                    System.out.println("Data");
                    System.out.println("Digite o Dia:");
                    data.setDia(entrada.nextInt());
                    System.out.println("Digite o Mês:");
                    data.setMes(entrada.nextInt());
                    System.out.println("Digite o Ano:");
                    data.setAno(entrada.nextInt());

                    System.out.println("\nCliente");
                    Cliente cliente = new Cliente();
                    System.out.println("Digite o Nome:");
                    cliente.setNome(entrada.next());
                    System.out.println("Digite o CPF:");
                    cliente.setCpf(entrada.next());
                    System.out.println("Digite o Telefone:");
                    cliente.setTelefone(entrada.next());

                    do {
                        exibirMenu2();
                        menu2 = entrada.nextInt();

                        switch (menu2) {
                            case 1:
                                do {
                                    CaixaLapis cx = new CaixaLapis();
                                    cx.cadastro();
                                    cxLapis.add(cx);
                                    System.out.println("Deseja cadastar mais caixa de lápis? Digite sim ou não: ");
                                    as = entrada.next();
                                } while (as.equalsIgnoreCase("Sim"));
                                break;

                            case 2:
                                do {
                                    Papel pa = new Papel();
                                    pa.cadastro();
                                    papel.add(pa);
                                    System.out.println("Deseja cadastar mais papel? Digite sim ou não:  ");
                                    ta = entrada.next();
                                } while (ta.equalsIgnoreCase("Sim"));
                                break;

                            case 3:
                                do {
                                    Caderno ca = new Caderno();
                                    ca.cadastro();
                                    caderno.add(ca);
                                    System.out.println("Deseja cadastar mais caderno? Digite sim ou não:  ");
                                    ja = entrada.next();
                                } while (ja.equalsIgnoreCase("Sim"));
                                break;

                            case 4:
                                System.out.println("Finalizando Pedido...\n");
                                break;

                            default:
                                System.out.println("Opção Inválida");
                        }

                    } while (menu2 != 4);
                    //Adicionar pedido cadastrado na lista
                    Pedido a = new Pedido();
                    a.setData(data);
                    a.setCliente(cliente);
                    a.setCxLapis(cxLapis);
                    a.setCarderno(caderno);
                    a.setPapel(papel);
                    a.calculaTotalPedido();
                    pedidos.add(a);
                    break;

                case 2://Consulta do Pedido
                    if (pedidos.isEmpty()) {
                        System.out.println("\nPedido não encontrado!!!");
                    } else {
                        String saidaa = "";
                        for (Pedido l : pedidos) {
                            saidaa = l.consulta();
                        }
                        System.out.println("\n=== Consultar Pedido ===\n" + saidaa);
                    }
                    break;

                case 3://Lista de Todos os Pedidos
                    if (pedidos.isEmpty()) {
                        System.out.println("\nPedido não encontrado!!!");
                    }else{
                    String saida = "";
                    int i = 1;
                    for (Pedido p : pedidos) {
                        saida += "\n=== Pedido Nº " + (i++) + " ===\n";
                        saida += p.consulta();
                    }
                    System.out.println("\n=== Lista de Todos Pedidos ===\n" + saida);
                    }
                    break;

                case 4://Encerrar Programa
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção Inválida");
            }
        } while (menu != 4);
    }
    //Método para exibir Menu Principal
    static void exibirMenu() {
        System.out.println("=== Menu ===");
        System.out.println("1 Cadastrar Novo Pedido");
        System.out.println("2 Consultar");
        System.out.println("3 Listar Todos Pedidos");
        System.out.println("4 Sair");
    }
    //Método para exibir o Menu dos Produtos
    static void exibirMenu2() {
        System.out.println("\n=== Escolha o produto que deseja cadastrar ===");
        System.out.println("1 Caixa Lápis");
        System.out.println("2 Papel");
        System.out.println("3 Caderno");
        System.out.println("4 Finalizar Pedido");
    }

}
