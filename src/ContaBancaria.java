
//importações

public class ContaBancaria{

    //atributos
    String agencia;
    String numero;
    double saldo;
    String nomeCliente;

    //metodos
    void depositar(double valor){
        saldo = saldo + valor;
    }

    void sacar(double valor){
        saldo = saldo - valor;

    }

    String mostrarSaldo(){
        String texto="";

        texto = "Agência: " + agencia +
                " Número: " + numero +
                " Saldo: " + saldo +
                " Cliente: " + nomeCliente;

        return texto;
    }

}