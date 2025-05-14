public class FitaDeVideo {
    
    //Atributos
    private String titulo;
    private double preco;

    //Construtor
    public FitaDeVideo(String titulo, double preco){
        this.titulo = titulo;
    }

    public FitaDeVideo(double preco){
        this.preco = preco;
    }
    //Metodos
    public String Gettitulo(){
        return titulo;
    }

    public double Getpreco(){
        return preco;
    }

    public double GetValorDoAluguel(int NumerosDeDiasAlugada){
        return NumerosDeDiasAlugada;
    }
    public void imprimir(int NumeroDeDiasAlugada){
        System.out.printf("titulo; %s\n", titulo);
        System.out.printf("preco do aluguel por dia, R$ %s.2f\n", preco);
        System.out.printf("valor do aluguel para %d dias: R$ %s.2f\n", NumeroDeDiasAlugada, GetValorDoAluguel(NumeroDeDiasAlugada));

    }
    }



