public class Archivo 
{
    public static boolean encontrado;
    
    public void validarUsuario(String usuarios[], String nombreinterfaz, String contraseñainterfaz)
    {
        for(int i = 0; i < usuarios.length;i++)
        {
            if(usuarios[i].equalsIgnoreCase(nombreinterfaz) && usuarios[i+1].equals(contraseñainterfaz))
            {
                encontrado = true;
            }
            else
            {
                encontrado = false;
            }
        }
    }
}
