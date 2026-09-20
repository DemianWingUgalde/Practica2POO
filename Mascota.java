import java.time.Year;
/**
 * Mascota que va a ser atendida por un veterinario
 * 
 * @author Demian Wing
 * @version 1.0
 */
public class Mascota
{
    private String nombre;
    private String raza;
    private int anioNacimiento = 0;
    private Persona miVeterinario;
    
    public Mascota(String pNombre, String pRaza){
        nombre = pNombre;
        raza = pRaza;
    }
    
    public Mascota(String pNombre, String pRaza, int pAnio){
        this(pNombre,pRaza);
        anioNacimiento = pAnio;
    }

    public String consultarNombreVeterinario(){
        if (miVeterinario == null){
            return "Sin asignar";
        }
        return miVeterinario.getNombre();
    }
    
    public void asignarVeterinario(Persona vet){
        miVeterinario = vet;
    }
    
    private int calcularEdadCanina(){
        if (anioNacimiento == 0)
        {
            return 0;
        }
        return calcularAnioActual() - anioNacimiento;
    }
    
    private int calcularEdadHumana(){
        return calcularEdadCanina() * 7;
    }
    
    private int calcularAnioActual(){
        int annioActual = Year.now().getValue(); 
        return annioActual;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String toString(){
        String msg = "======================\n";
        msg += "Nombre: " + nombre + "\n";
        msg += "Raza:" + raza + "\n";
        msg += "Veterinario a cargo: " + consultarNombreVeterinario() +  "\n";
        msg += "======================\n";
        return msg;
    }
}