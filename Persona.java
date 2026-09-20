import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Persona here.
 * 
 * @author Demian Wing
 * @version 1.0
 */
public class Persona
{
    private String nombre;
    private String codigoLicencia;
    private List<Mascota> misMascotas;
    
    public Persona(String pNombre, String pCodigoLicencia){
        nombre = pNombre;
        codigoLicencia = pCodigoLicencia;
        misMascotas = new ArrayList<>();
    }
    
    public void asignarMascota(Mascota mascota){
        misMascotas.add(mascota);
    }
    
    public String consultarNombreMisMascotas(){
        if (misMascotas.isEmpty()){
            return "No hay mascotas asignadas";
        }
        String texto = "Mascotas asignadas al veterinario:\n\n";
        for (Mascota mascota : misMascotas){
            texto += mascota.getNombre() + "\n";
        }
        return texto;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String toString(){
        String msg = "Nombre del veterinario: " + nombre;
        msg += "\nCodigo licencia: " + codigoLicencia;
        msg += "\n" + consultarNombreMisMascotas();
        return msg;
    }
}