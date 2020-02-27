import java.util.Scanner;

public class Calculadora {

    private static Scanner sn = new Scanner(System.in);

    public static void main(String[] args) {
        loop: do {

            System.out.println("------------- Calculadora -------------");
            System.out.println("Escolha o metodo de calculo:\n1 - Soma\n2 - Subtracao\n3 - Multiplicacao\n4 - Divisao\n0 - Sair");

            try {
                switch (Integer.parseInt(sn.nextLine())) {
                    case 1:
                        Soma();
                        break;
                    case 2:
                        Subtracao();
                        break;
                    case 3:
                        Multiplicacao();
                        break;
                    case 4:
                        Divisao();
                        break;
                    case 0:
                        break loop;
                    default:
                        System.out.println("A opcao nao e valida, pressione enter para continuar!");
                        sn.nextLine();
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("O valor inserido nao e válido, pressione enter para continuar!");
                sn.nextLine();
                continue;
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
                System.out.println("Pressione enter para reiniciar!");
                sn.nextLine();
                continue;
            }

        } while (true);

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

    public static void Subtracao() {
        System.out.print("Digite o primeiro valor inteiro: ");
        int val1 = Integer.parseInt(sn.nextLine());

        System.out.print("Digite o segundo valor inteiro: ");
        int val2 = Integer.parseInt(sn.nextLine());

        System.out.println("A subtracao dos dois valores é: " + (val1 - val2));
        System.out.println("Pressione enter para voltar para o menu!");
        sn.nextLine();
    }

    public static void Multiplicacao(){
        System.out.print("Digite o primeiro valor inteiro: ");
        int val1 = Integer.parseInt(sn.nextLine());

        System.out.print("Digite o segundo valor inteiro: ");
        int val2 = Integer.parseInt(sn.nextLine());

        System.out.println("A multiplicacao dos dois valores é: " + (val1 * val2));
        System.out.println("Pressione enter para voltar para o menu!");
        sn.nextLine();
    }

    public static void Divisao(){
        System.out.print("Digite o primeiro valor inteiro: ");
        int val1 = Integer.parseInt(sn.nextLine());

        System.out.print("Digite o segundo valor inteiro (Maior que zero): ");
        int val2 = Integer.parseInt(sn.nextLine());

        System.out.println("A divisao dos dois valores é: " + (val1 / val2));
        System.out.println("Pressione enter para voltar para o menu!");
        sn.nextLine();
    }

}