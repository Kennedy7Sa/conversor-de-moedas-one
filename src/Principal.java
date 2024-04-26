import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Conversor conversor = new Conversor();
        ConexaoConvert conectconvert = new ConexaoConvert();

        try {
            int opcao = 0;
            while (opcao != 7) {
                opcao = conversor.menu(leitura,opcao);

                if (opcao == 1) {
                    String par = "pair/USD/ARS";
                    System.out.println("Opção Escolhida.: USD para ARS ");
                    conversor.resultConverted(par,conectconvert);

                } else if (opcao == 2) {
                    String par = "pair/ARS/USD";
                    System.out.println("Opção Escolhida.: ARS para USD ");
                    conversor.resultConverted(par,conectconvert);

                } else if (opcao == 3) {
                    String par = "pair/USD/BRL";
                    System.out.println("Opção Escolhida.: USD para BRL");
                    conversor.resultConverted(par,conectconvert);

                } else if (opcao == 4) {
                    String par = "pair/BRL/USD";
                    System.out.println("Opção Escolhida.: BRL para USD");
                    conversor.resultConverted(par,conectconvert);

                } else if (opcao == 5) {
                    String par = "pair/USD/COP";
                    System.out.println("Opção Escolhida.: USD para COP");
                    conversor.resultConverted(par,conectconvert);
                } else if (opcao == 6) {
                    String par = "pair/COP/USD";
                    System.out.println("Opção Escolhida.: COP para USD");
                    conversor.resultConverted(par,conectconvert);
                } else if (opcao != 7) {
                    opcao = 0;
                }
            }

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
