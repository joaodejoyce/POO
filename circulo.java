

public class circulo {
    //Atributos
    private int raio;

    //Contrutor 
    public circulo(int raio){
        this.raio = raio;
    }

    //Metodos
    public float CalcularArea(){
        return  3.141516f * raio * raio;
    }

    public float CalcularPerimetro(){
        return 2 * 3.141516f * raio;
    }
    public void imprimir(){
        System.out.printf("raio: %d, Area: %.2f, Perimetro: %.2f\n", raio, CalcularArea(), CalcularPerimetro());
    }
}
