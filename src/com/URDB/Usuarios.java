package com.URDB;

/**Prueba de rama remota*/

public class Usuarios
{
    int id_usuario;
    String correo;
    String clave;
    String nombre_completo;

    //constructores
    public Usuarios(){
    }

    //constructor para borrar usuario
    public Usuarios(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    //constructor para iniciar sesión
    public Usuarios(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }

    //constructor para traer datos de inicio de sesión
    public Usuarios(int id_usuario, String correo, String nombre_completo) {
        this.id_usuario = id_usuario;
        this.correo = correo;
        this.nombre_completo = nombre_completo;
    }

    //constructor para crear, editar usuario
    public Usuarios(int id_usuario, String correo, String clave, String nombre_completo) {
        this.id_usuario = id_usuario;
        this.correo = correo;
        this.clave = clave;
        this.nombre_completo = nombre_completo;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }
}
