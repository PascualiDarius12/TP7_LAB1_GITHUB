
package tp7;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author 54266
 */
public class Directorio {
    
   public  HashMap<String, Materia> materiasEscuela = new HashMap();
   public  HashMap<String, Alumno> alumnosEscuela = new HashMap();

    public Directorio() {
    }

    
     
     public boolean agregarMateria(Materia m1, String numero) {

        boolean agregado = false;

        if (!materiasEscuela.containsKey(numero)) { 
            materiasEscuela.put(numero, m1);
            agregado = true;
        }

        return agregado;

    }
     
    public boolean agregarAlumno(Alumno a, String numero) {

        boolean agregado = false;

        if (!alumnosEscuela.containsKey(numero)) { 
            alumnosEscuela.put(numero, a);
            agregado = true;
        }

        return agregado;

    }
    
  
   
}
