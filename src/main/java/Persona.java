public class Persona {
    private String nombre;
    private String apellido;

    //CREACION DE CONSTRUCTOR//
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //CREACION DE LOS GETTERS Y LOS SETTERS//
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //UTILIZAMOS EL MOTODO TOSTRING PARA DEVOLVER UNA REPRESENTACION EN FORMATO DE String, EN LA CLASE PERSONA QUE DEFINIMOS ANTERIORMENTE SOBREESCRIBIMOS EL METODO PARA DEVOLVER UN STRING QUE CONTENGA EL NOMBRE Y APELLIDO DE LA PERSONA.//
    @Override
    public String toString(){
        return nombre + "" + apellido;
    }

}
