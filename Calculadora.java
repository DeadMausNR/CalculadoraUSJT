import java.util.Scanner;

public class Calculadora {

    private static Scanner sn = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao = 0;

        loop: do {

            System.out.println("------------- Calculadora -------------");
            System.out.println("Escolha o método de cálculo:\n1 - Soma\n0 - Sair");

            try {
                switch (Integer.parseInt(sn.nextLine())) {
                    case 1:
                        Soma();
                        break;
                    case 0:
                        break loop;
                    default:
                        System.out.println("A opção não é valida, pressione enter para continuar!");
                        sn.nextLine();
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("O valor inserido não é válido, pressione enter para continuar!");
                sn.nextLine();
                continue;
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
                System.out.println("Pressione enter para reiniciar!");
                sn.nextLine();
                continue;
            }

        } while (opcao == 0);

        sn.close();
    }

    public static void Soma() {
        System.out.print("Digite o primeiro valor inteiro: ");
        int val1 = Integer.parseInt(sn.nextLine());

        System.out.print("Digite o segundo valor inteiro: ");
        int val2 = Integer.parseInt(sn.nextLine());

        System.out.println("A soma dos dois valores é: " + (val1 + val2));
        System.out.println("Pressione enter para voltar para o menu!");
        sn.nextLine();
    }

}