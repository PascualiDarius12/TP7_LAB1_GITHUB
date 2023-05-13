package tp7_lab1_github;

import java.util.HashSet;

public class Alumno {
    private int legajo;
    private String apellido;
    private String nombreCompleto;
    private String nombre;
     
    public  HashSet<String> materias =new HashSet<>();

    
    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<String> getMaterias() {
        return materias;
    }

    public void setMaterias(HashSet<String> materias) {
        this.materias = materias;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void agregarMateria(String materia){
        materias.add(materia);
    }
    
    public int cantidadMaterias(){
       
        return materias.size();
    }

    @Override
    public String toString() {
        return "Alumno:\n" + "legajo:" + legajo + "\napellido:" + apellido + "\nnombre:" + nombre + "\nmaterias:" + materias.toString() + "\n";
    }
}
