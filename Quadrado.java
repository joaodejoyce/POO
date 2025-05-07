public class Quadrado {
    //ATRIBUTOS
    private int lado;
    //CONSTRUTOR
    public Quadrado(int lado){
        this.lado = lado;
    }

    //METODOS

    public int CalcularArea(){
        return lado*lado;
    }

    public int CalcularPerimetro(){
        return 4*lado;
    }

    public void Imprimir(){
        System.out.printf("Lado: %d, Área: %d, Perimetro: %d\n", lado, CalcularArea(), CalcularPerimetro());
    }
}
