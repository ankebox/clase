public class Alumno {
    
    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;
    
    
    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto;
        numeroMatricula = numeroMatriculaAlumno;
        edad = edadAlumno;
        
        if (nombre.length() < 3){
            System.out.println("error, nombre introducido tiene menos de 3 caracteres");
        }
        if (numeroMatricula.length() < 4){
            System.out.println("error, matricula introducida menor de 4 caracteres");
        
        }
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " años");
    }
    
    public String inprimeDetalles(){
    return (nombre + " (" + numeroMatricula + ") - " + edad + " años");
    }
    
    
    //nombre.substring(0, 3) + numeroMatricula.substring(0, 4);
    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        String usuarioGithub = "";
        
        if (nombre.length() >= 3) {
            if (numeroMatricula.length() >= 4){
               usuarioGithub =  nombre.substring(0, 3) + numeroMatricula.substring(0, 4);
            }
            else{
                usuarioGithub = nombre.substring(0, 3) + numeroMatricula;
            }
        }
        else{
            if(numeroMatricula.length() >= 4){
                usuarioGithub = nombre + numeroMatricula.substring(0, 4);   
            }
            else{
                usuarioGithub = nombre + numeroMatricula;
            }
        }
        return usuarioGithub;
    }
       
}

    
    

