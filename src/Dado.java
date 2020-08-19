public class Dado 
{
    //Atributos
    private int valor;
    
    //Constructor
    public Dado(int valor)
    {
        this.valor = valor;
    }
    
    //Setters and Getters
    public int getValor()
    {
        return valor;
    }
    
    public void setValor(int valor)
    {
        this.valor = valor;
    }
    
    //Métodos
    //Generar Número Aleatorio entre 1 y 6;
    public void azar()
    {
        valor = (int) (Math.random()*6+1);
    }
}
