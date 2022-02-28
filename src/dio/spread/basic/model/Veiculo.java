package dio.spread.basic.model;

public class Veiculo implements VeiculoInterface {

    private int metros;
    private int velocidade;

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }


    public void acelerar(){
        System.out.println("Ir para frente");
    }

    public void parar(){
        System.out.println("Freiar");
    }

    public void virarEsquerda(){
        System.out.println("Virar para a esquerda");
    }

    public void virarDireita(){
        System.out.println("Virar para a direita");
    }
}
