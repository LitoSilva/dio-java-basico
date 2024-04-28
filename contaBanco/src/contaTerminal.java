/*
 * Este desafio foi para criar um programa em java 
 * @authon joselito da silva
 * @version 0.0.0.1
 * 
 *  listas da valiaveis
 * 
 *      - nomeCliente
 *      - agencia
 *      - numeroConta
 *      - saldo
 *       
 *
 */



import java.util.Scanner;
import java.util.Locale;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("***********************");
        System.out.println("***** Banco World *****");
        System.out.println("***********************\n");

        System.out.println("Bem vindo vamos cria sua conta\n ");

        System.out.println("Digite o numero da sua conta:");
        int NumeroConta = sc.nextInt();
        System.out.println("Digit o numero da Agencia:");
        String agencia = sc.next();
        System.out.println("Digite o nome do Cliente:");
        String nomeCleinte = sc.next();
        System.out.println("Digite o Saldo da conta:");
        double saldo = sc.nextDouble();

        System.out.println("Olá,"+nomeCleinte+", Obrigado por criar uma conta em nosso banco, sua agencia e "+agencia+" conta "+NumeroConta+" e o seu saldo R$"+saldo+" ja esta desponivel para saque.");
        
    }
}
