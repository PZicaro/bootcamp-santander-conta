import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Validacoes v1 = new Validacoes();



        System.out.println("digite o nome do cliente");
        String nome = sc.next();
        System.out.println("digite o número da conta ");
        int numero = sc.nextInt();
        System.out.println("digite a agência do cliente");
        String agencia = sc.next();

        System.out.println("digite o saldo da conta ");
        float saldo = sc.nextFloat();

        if(!v1.validarAgencia(agencia)){
            System.out.println("agencia não compativel");
            return;
        }
        if(!v1.validarNumero(numero)){
            System.out.println("numero não compativel");
            return;
        }
        System.out.println("nome" +nome + "\n número: " + numero + "\n agencia:" + agencia + "\n saldo: "+ saldo );




        
    }

}
