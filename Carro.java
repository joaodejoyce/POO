public class Carro {
    //Atributos
    private String fabricante;
    private String modelo;
    private int ano;
    private int velocidade;

    //Construtor
    public Carro(String fabricante, String modelo, int ano){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
    }
    //Métodos
    public String getFabricante(){
        return fabricante; 
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;

    }
    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
     
    public void acelerar(){
        if(velocidade < 110)
            velocidade = velocidade + 10;
    }
    public void frear(){
        if(velocidade > 0)
            velocidade = velocidade - 10;
    }

    }
    
