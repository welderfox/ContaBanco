import java.util.Scanner;

public class ContaTerminal {
	
    public static void main(String[] args) throws Exception {
    	Scanner ler = new Scanner(System.in);
    	
        Integer NumeroConta;
        String Agencia;
        String NomeCliente;
        Float Saldo ;
    	
    	System.out.println("Bem Vindo ao Itau !!!");
        
        System.out.println("");
        System.out.printf("Digite o numero da agencia:");
        Agencia = ler.next();
        
        System.out.printf("Digite o numero da conta:");
        NumeroConta = ler.nextInt();
        
        System.out.printf("Digite seu nome:");
        NomeCliente = ler.next();

        System.out.println("Obrigado por criar conta no Itau :)"); 
        
        System.out.println("Agencia: "+Agencia+""+" Conta: "+NumeroConta+""+" Cliente: "+NomeCliente);
    }
}
