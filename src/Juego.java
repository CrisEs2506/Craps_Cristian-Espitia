public class Juego 
{
    //Atributos
    private int primerlanzamiento;
    private int lanzamiento;
    public static String ganar;
    
    //Constructor
    public Juego(int primerlanzamiento, int lanzamiento, String ganar)
    {
        this.primerlanzamiento = primerlanzamiento;
        this.lanzamiento = lanzamiento;
        this.ganar = ganar;
    }
    
    //Setters and Getters
    public int getPrimerlanzamiento()
    {
        return primerlanzamiento;
    }
    
    public void setPrimerlanzamiento(int primerlanzamiento)
    {
        this.primerlanzamiento = primerlanzamiento;
    }

    public int getLanzamiento() 
    {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) 
    {
        this.lanzamiento = lanzamiento;
    }
    
    GUI2 texto = new GUI2();
    
    //Métodos
    //Comprobación Primer Lanzamiento
    public void comprobar1()
    {
        if((primerlanzamiento == 7)||(primerlanzamiento == 11))
        {
            ganar = "Felicidades Ganaste!!!";
        }
        else if((primerlanzamiento == 2)||(primerlanzamiento == 3)||(primerlanzamiento == 12))
        {
            ganar = "Ups! Perdiste";
        }
        else
        {
            ganar = "Vuelves a Lanzar los Dados";
        }
    }
    
    //Comprobación Segundo Lanzamiento en Adelante
    public void comprobar2()
    {
        if((lanzamiento == 7) || (primerlanzamiento == lanzamiento))
        {
            ganar = "Felicidades Ganaste!!!";
        }
        else if((lanzamiento == 2)||(lanzamiento == 3)||(lanzamiento == 12))
        {
            ganar = "Ups! Perdiste";
        }
        else
        {
           ganar = "Vuelves a Lanzar los Dados";
        }
    }
}
