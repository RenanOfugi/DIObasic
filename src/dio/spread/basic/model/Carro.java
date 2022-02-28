package dio.spread.basic.model;

public class Carro extends Veiculo {

    @Override
    public void acelerar() {
        System.out.println("Apertar acelerador");
        setMetros(getMetros() + 60);
        setVelocidade(80);

        System.out.println("Km/h: " + getVelocidade());
        System.out.println("distancia: " + getMetros() + " mts");
    }

    @Override
    public void parar() {
        System.out.println("apertar embreagem");
        System.out.println("apertar freio");

        setVelocidade(0);

        System.out.println("Km/h: " + getVelocidade());
        System.out.println("distancia: " + getMetros() + " mts");
    }

    @Override
    public void virarDireita() {
        System.out.println("Virar volante para a direita");
    }

    @Override
    public void virarEsquerda() {
        System.out.println("Virar volante para a esquerda");
    }
}
