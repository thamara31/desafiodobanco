package dio.com;

public interface IConta {

    public interface Iconta {

        void sacar(double valor);

        void depositar(double valor);

        void transferir(double valor, Conta contaDestino);

        void imprimirExtrato();
    }
}