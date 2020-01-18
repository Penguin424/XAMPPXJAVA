package com.MSJDB;

public class Mensajes
{
    private int idMensaje;
    private String mensaje;
    private String autorMensaje;
    private String fecha_mensaje;

    public Mensajes()
    {

    }

    public Mensajes(String mensaje, String autorMensaje, String fecha_mensaje)
    {
        this.mensaje = mensaje;
        this.autorMensaje = autorMensaje;
        this.fecha_mensaje = fecha_mensaje;
    }

    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutorMensaje() {
        return autorMensaje;
    }

    public void setAutorMensaje(String autorMensaje) {
        this.autorMensaje = autorMensaje;
    }

    public String getFecha_mensaje() {
        return fecha_mensaje;
    }

    public void setFecha_mensaje(String fecha_mensaje) {
        this.fecha_mensaje = fecha_mensaje;
    }
}
