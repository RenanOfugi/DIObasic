package dio.spread.basic.model;

public class Bicicleta extends Veiculo {

    @Override
    public void acelerar() {
        System.out.println("Pedalar mais");

        setMetros(getMetros() + 10);
        setVelocidade(5);

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
