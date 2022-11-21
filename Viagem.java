package Uber;


public class Viagem {
    public static double quilometragem;
    public String destino;
    public double tempo;
    public String pontoEmbarque;
    
    public String getPontoEmbarque() {
        return pontoEmbarque;
    }
    public void setPontoEmbarque(String pontoEmbarque) {
        this.pontoEmbarque = pontoEmbarque;
    }
    public double getQuilometragem() {
        return quilometragem;
    }
    public void setQuilometragem(double quilometragem) {
        Viagem.quilometragem = quilometragem;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public double getTempo() {
        return tempo;
    }
    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

}
