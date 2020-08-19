public class Jugador 
{
    //Atributos
    private String nombre;
    private String contraseña;
    private int saldo;

    //Constructor
    public Jugador(String nombre, String contraseña, int saldo)
    {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.saldo = saldo;
    }
    
    //Getters and Setters
    public String getNombre() 
    {
        return nombre;
    }

    public String getContraseña() 
    {
        return contraseña;
    }
    
    public int getSaldo() 
    {
        return saldo;
    }
    
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public void setContraseña(String contraseña) 
    {
        this.contraseña = contraseña;
    }
    
    public void setSaldo(int saldo) 
    {
        this.saldo = saldo;
    }
}
