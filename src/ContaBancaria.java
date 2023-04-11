
//importações

public class ContaBancaria{

    //atributos
    String agencia;
    String numero;
    double saldo;
    String nomeCliente ;


    //metodos
    String depositar(double valor){

        if(valor < 0){
            return "Valor inválido!";
        }
        saldo = saldo + valor;
        return "ok";
    }

    String sacar(double valor){
        if(valor < 0){
            return "Valor inválido!";
            //return false;
        }
        if(valor > saldo){
            return "Saldo insuficiente!";
            //System.out.println("Impossível sacar!!");
            //return false;
        }

        saldo = saldo - valor;
        return "ok";

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