import java.util.Scanner;

public class App {

    public static void main(String[] args) {




        // declaração
        ContaBancaria conta;

        // instanciar
        conta = new ContaBancaria();

        // inicialização dos atributos do objeto
        conta.agencia = "01234";
        conta.numero = "67890";
        conta.saldo = 1000;
        conta.nomeCliente = "Zé";
        System.out.println(conta);
        System.out.println(conta.mostrarSaldo());

        //deposito
        conta.depositar(100);

        System.out.println(conta.mostrarSaldo());

        conta.sacar(600);
        System.out.println(conta.mostrarSaldo());


        ContaBancaria conta2 = new ContaBancaria();

        conta2.agencia = "01234";
        conta2.numero = "98765";
        conta2.saldo = 500;
        conta2.nomeCliente = "Chico";

        conta2.depositar(50);

        System.out.println(conta2);
        System.out.println(conta2.mostrarSaldo());

    }
}
