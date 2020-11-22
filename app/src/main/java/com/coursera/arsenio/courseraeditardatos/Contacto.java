package com.coursera.arsenio.courseraeditardatos;



public class Contacto  {
    private String nombre ;
    private String nacimiento ;
    private String telefono ;
    private String email ;
    private String descripcion ;

    public Contacto() {

    }

    public Contacto(String nombre, String nacimiento, String telefono, String email, String descripcion) {
        this.nombre = nombre ;
        this.nacimiento = nacimiento ;
        this.telefono = telefono ;
        this.email = email ;
        this.descripcion = descripcion ;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
