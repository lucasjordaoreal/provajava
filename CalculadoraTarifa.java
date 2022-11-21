package Uber;

public class CalculadoraTarifa extends Viagem{
    public static int preco;

    public static int getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        CalculadoraTarifa.preco = preco;
    }


    public void calcularpreco(double preco){
        this.calcularpreco(CalculadoraTarifa.getPreco()*quilometragem);
    }
}

