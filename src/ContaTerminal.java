// Passo 1: Importar a classe Scanner para leitura de dados do terminal
import java.util.Scanner;

// Passo 2: Definir a classe ContaTerminal
public class ContaTerminal {

    // Passo 3: Método main, ponto de entrada do programa
    public static void main(String[] args) {
        // Passo 4: Criar uma instância do Scanner para leitura dos dados de entrada
        Scanner scanner = new Scanner(System.in);

        // Passo 5: Declarar as variáveis para armazenar os dados da conta
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Passo 6: Solicitar e ler os dados do usuário
        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        numero = scanner.nextInt(); // Lê o número da conta
        scanner.nextLine(); // Consome a quebra de linha deixada pelo nextInt()

        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial da Conta:");
        saldo = scanner.nextDouble();

        // Passo 7: Exibir a mensagem com os dados inseridos pelo usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Passo 8: Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}