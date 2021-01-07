package energetico;

import java.util.Scanner;

public class NotaFiscal {

    Vendas venda = new Vendas();

    double totalGeral;
    double totalImpostos;
    double totalMercadoria;

    public void calcular(){

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o nome da rede de Supermercado: ");
        venda.setNomeEmpresa(input.next());

        System.out.println("Insira a quantidade de produtos por carga: ");
        venda.setQuantidade(input.nextInt());

        totalMercadoria = venda.getPrecoUnitario() * venda.getQuantidade();

        venda.setIcms(totalMercadoria * (18.0/100.0));
        venda.setIpi(totalMercadoria * (4.0/100.0));
        venda.setPis(totalMercadoria * (1.86/100.0));
        venda.setCofins(totalMercadoria * (8.54/100.0));

        totalGeral = totalMercadoria + (venda.getIcms() + venda.getIpi() + venda.getPis() + venda.getCofins());
        totalImpostos = venda.getIcms() + venda.getIpi() + venda.getPis() + venda.getCofins();

        bonificar();
    }

    public void bonificar(){
        /*A bonificação será de 9,5% sobre o total de produtos vendidos*/

        venda.setBonificacao(totalMercadoria * (9.5/100.0));

        imprimirNota();
    }

    public void imprimirNota(){
        System.out.println("##################################################################");
        System.out.println("Cliente: " + venda.getNomeEmpresa());

        System.out.println("---------------IMPOSTOS-----------------");
        System.out.printf("ICSM: R$ %.2f %n", venda.getIcms());
        System.out.printf("IPI: R$ %.2f %n", venda.getIpi());
        System.out.printf("PIS: R$ %.2f %n", venda.getPis());
        System.out.printf("COFINS: R$ %.2f %n", venda.getCofins());

        System.out.println("----------------TOTAL-------------------");
        System.out.printf("Total Impostos: %.2f %n", totalImpostos);
        System.out.printf("Total Mercadorias: %.2f %n", totalMercadoria);
        System.out.printf("Desconto: %.2f %n", venda.getBonificacao());
        System.out.printf("Total Geral (total com desconto): %.2f %n", totalGeral - venda.getBonificacao());
        System.out.println("##################################################################");
    }
}
