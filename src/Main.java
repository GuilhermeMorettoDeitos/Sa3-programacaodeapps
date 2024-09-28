import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Para facilitar os trocos são simplesmente exibidos na tela.
        //Utilize contadores para contar quantas notas de cada valor foram utilizadas na conta, e posteriormente um ciclo de repetição para exibir tudo.

        //Recebendo as notas de possíveis trocas (estão em variaveis para facilitar a contagem de cada nota recebida, contudo o programa não faz isso nessa versão).

        // MOEDAS (O "C" no final de cada nome de variavel significa "centavos")
        double dif;
        double cincoc = 0.05;
        double dezc = 0.10;
        double vintecincoc = 0.25;
        double cinquentac = 0.50;
        double um = 1.00;

        //Cédulas
        double dois = 2.00;
        double cinco = 5.00;
        double dez = 10.00;
        double vinte = 20.00;
        double cinquenta = 50.00;
        double cem = 100.00;
        double duzentos = 200.00; //Cédulas de R$200 utilizadas

        Scanner ler = new Scanner(System.in);
        System.out.println("   --- CALCULADORA DE TROCO ---\n");
        System.out.println("Digite o valor total da compra: ");
        double total = ler.nextDouble();

        System.out.println("Digite o valor recebido no pagamento: ");
        double recebido = ler.nextDouble();

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("   --- CALCULADORA DE TROCO ---\n");

        if(total == recebido){
            System.out.println("O valor recebido é igual ao valor total da compra!\nNão há troco!");
        }
        else if(recebido > total){
            dif = recebido - total;
            System.out.println("------------------------------------------");
            System.out.println("Valor da compra: R$"+total+".");
            System.out.println("Valor recebido: R$"+recebido+".");
            System.out.println("Troco a ser pago: R$"+dif+".");
            System.out.println("------------------------------------------\n");


            //Fazendo a conta
            // É utilizado um ciclo de repetição com 10 repetições, contudo, caso o valor de troco seja muito alto (milhares) é necessário aumentar esse valor.
            for(int i=0; i<=10;i++){
                if(dif >=200){
                    dif = dif - duzentos;
                    System.out.println("1 nota de R$200,00.");
                } else if(dif >= 100 && dif <=199.97){
                    dif = dif - cem;
                    System.out.println("1 nota de R$100,00.");
                } else if(dif >=50 && dif <100.00){
                    dif = dif - cinquenta;
                    System.out.println("1 nota de R$50,00.");
                } else if(dif >=20 && dif <50.00){
                    dif = dif - vinte;
                    System.out.println("1 nota de R$20,00.");
                } else if(dif >= 10 && dif <20.00){
                    dif = dif - dez;
                    System.out.println("1 nota de R$10,00.");
                } else if (dif >=5 && dif <10) {
                    dif = dif - cinco;
                    System.out.println("1 nota de R$5,00.");
                } else if(dif >=2 && dif <5.00){
                    dif = dif - dois;
                    System.out.println("1 nota de R$2,00.");
                } else if(dif >=1 && dif<2){
                    dif = dif - um;
                    System.out.println("1 moeda de R$1,00.");
                } else if(dif >=0.50 && dif <=0.99){
                    dif = dif -cinquentac;
                    System.out.println("1 moeda de R$0,50.");
                } else if(dif >=0.25 && dif <0.50){
                    dif = dif -vintecincoc;
                    System.out.println("1 moeda de R$0,25.");
                } else if (dif >= 0.10 && dif <0.25) {
                    dif = dif -dezc;
                    System.out.println("1 moeda de R$0,10.");
                } else if (dif>=0.048 && dif<0.10) {
                    dif = dif -cincoc;
                    System.out.println("1 moeda de R$0,05.");
                } else if (dif>0 && dif<0.47) {
                    dif = 0.00; // utilizado para igualar o troco para R$ 0,00, porque os calculos dão numeros quebrados, e é possvel que o programa use mais recursos do que o necessário.
                } else if(dif ==0.00){
                    break; //Encerrar o ciclo de repetição quando o valor de troco for igual a R$0,00.
                }
            }
        }
        // Caso o valor recebido for menor que o valor total da compra, ou o valor for negativo.
        else {
            System.out.println("Digite um valor válido!");
            Thread.sleep(2500);
        }
    }
}