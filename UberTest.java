package Uber;



//cria uma classe UberTest e herda CalculadoraTarifa utilizando herança
public class UberTest extends CalculadoraTarifa{
    public static void main(String[] args) {

        //cria objeto Motorista
        Motorista m = new Motorista();
        m.setNome("Eduardo");
        m.setAvaliacao(4);
        m.setIdade(41);
        System.out.println("O Nome do motorista é: "+m.getNome());
        System.out.println("O motorista tem "+m.getIdade()+"anos");
        System.out.println("A avaliação do motorista é de "+m.getAvaliacao()+"estrelas");
        //cria objeto Viagem
        Viagem v = new Viagem();
        v.setDestino("Praça da Sé");
        v.setPontoEmbarque("Comércio Frutas Sanchez");
        v.setQuilometragem(1.2);
        v.setTempo(10);
        System.out.println("O destino é: "+v.destino);
        System.out.println("O tempo de chegada é de "+v.getTempo()+"minutos");
        System.out.println("A quilometragem é de "+v.getQuilometragem()+"km");
    
        //cria objeto Calculatarifa
        CalculadoraTarifa ct = new CalculadoraTarifa();
        ct.setPreco(2);
        ct.calcularpreco(quilometragem);
       
        System.out.println("O valor da corrida é de: "+CalculadoraTarifa.getPreco()*quilometragem);
    
    }
}
