package dio.com;

public class main {

    public static void main(String[] args) {
        Banco bancoInicial = new Banco();

        bancoInicial.setNome("First Bank");

        Cliente Isabela = new Cliente("Isabela", bancoInicial);
        Isabela.setNome("Isabela Carla Augusto");

        Conta ccorrente = new ContaCorrente(Isabela);
        ccorrente.depositar(100); //criado um deposito em conta corrente

        Cliente Leonardo = new Cliente("Leonardo", bancoInicial);  //instancia novo cliente
        Conta cpoupanca = new ContaPoupança(Leonardo);  //instanciada nova conta poupanca

        ccorrente.imprimirExtrato();
        cpoupanca.imprimirExtrato();

        ccorrente.transferir(48, cpoupanca);

        ccorrente.imprimirExtrato();
        cpoupanca.imprimirExtrato();
        bancoInicial.mostrarClientes();

        Cliente Deborah = new Cliente("Deborah", bancoInicial);
        Conta ccorrente2 = new ContaCorrente(Deborah);
        ccorrente2.imprimirExtrato();
        bancoInicial.mostrarClientes();
    }

}
