package clases;

public class Estudiante {
    private String nombre, apellido, carnet;
    
    
    public Estudiante(String nombre, String apellido, String carnet){
        this.nombre=nombre;
        this.apellido=apellido;
        this.carnet=carnet;
        
    } 
    
    public String getCarnet(){
        return this.carnet;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    
    
    
}
