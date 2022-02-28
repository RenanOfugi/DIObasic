package dio.spread.basic;

import dio.spread.basic.model.Bicicleta;
import dio.spread.basic.model.Carro;
import dio.spread.basic.model.Veiculo;

public class MainApplication {
    public static void main(String[] args) {

        Veiculo gol = new Carro();
        Veiculo caloi = new Bicicleta();
        
        gol.acelerar();
        gol.acelerar();

        caloi.acelerar();
        caloi.acelerar();
        caloi.parar();
    }
}
