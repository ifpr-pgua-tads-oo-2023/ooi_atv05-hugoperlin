
//importações

public class ContaBancaria{

    //atributos
    private String agencia;
    private String numero;
    private double saldo=0;
    private String nomeCliente ;


    public ContaBancaria(String agencia, String numero, String nomeCliente){
        this.agencia = agencia;
        this.numero = numero;
        this.nomeCliente = nomeCliente;
    }

    public ContaBancaria(String numero, String nomeCliente){
        this.agencia = "1234";
        this.numero = numero;
        this.nomeCliente = nomeCliente;
    }

    public ContaBancaria(String agencia, String numero, String nomeCliente, double saldo){
        this.agencia = agencia;
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getNumero(){
        return numero;
    }

    /*public void setAgencia(String valor){
        agencia = valor;
    }*/

    public String getAgencia(){
        return agencia;
    }

    /*public void setNomeCliente(String valor){
        nomeCliente = valor;
    }*/

    public String getNomeCliente(){
        return nomeCliente;
    }

    public double getSaldo(){
        return saldo;
    }



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