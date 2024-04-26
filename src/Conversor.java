import java.util.Scanner;

public class Conversor {

    public int getValorDigitado() {
        return valorDigitado;
    }

    public void setValorDigitado(int valorDigitado) {
        this.valorDigitado = valorDigitado;
    }

    private int valorDigitado ;

    public int menu (Scanner leitura ,int escolha) {

        String menu = """
                *************************************************
                     Bem vindo a casa de câmbio do KennyForms,
                          Escolha a opção de conversão
                *************************************************
                
                          1) Dolar ==> Peso Argentino :
                          2) Peso Argentino ==> Dólar :
                          3) Dólar ==> Real Brasileiro:
                          4) Real Brasileiro ==> Dólar: 
                          5) Dólar ==> Peso Colombiano:
                          6) Peso Colombiano ==> Dólar:
                          7) Sair 
                
                **************************************************                
                """;
        System.out.println(menu);
        System.out.println("Escolha uma opção do menu: ");
        escolha=leitura.nextInt();
        if(escolha<7 && escolha>0) {
            System.out.println("Digite o valor da moeda a ser convertida sem casas decimais");
            setValorDigitado(leitura.nextInt());
        }
        return escolha;
    }

    public void resultConverted(String par, ConexaoConvert conectconvert) {
        try {
            Moeda respostaNew = conectconvert.conectStringtoJson(par,
                    String.valueOf(getValorDigitado()));


            System.out.println("Valor convertido de "+String.valueOf(getValorDigitado())+" "+
                    respostaNew.base_code() + " para " +
                    respostaNew.target_code() + " é:" + respostaNew.conversion_result());
        } catch (Exception e) {
            System.out.println("Sem conexão");
        }
    }
}
