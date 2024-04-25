import java.time.LocalDate;

public class Carro {
    String modeloDoCarro;
    int anoDoCarro;
    String corDoCarro;

    int idadeCarro(){
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - anoDoCarro;
    }

    void exibirFichaTecnica(){
        System.out.println("Modelo: " + modeloDoCarro);
        System.out.println("Ano: " + anoDoCarro);
        System.out.println("Cor: " + corDoCarro);
        System.out.println("Idade do Carro: " + idadeCarro());
    }
}