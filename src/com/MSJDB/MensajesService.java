package com.MSJDB;

import java.util.Scanner;

public class MensajesService
{
    public static void crearMensaje()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cual es el mensaje que quieres escribir?");
        String mensaje = sc.nextLine();

        System.out.println("Quien es el autor de este mensaje?");
        String autor = sc.nextLine();

        Mensajes registro = new Mensajes();

        registro.setMensaje(mensaje);
        registro.setAutorMensaje(autor);

        MensajesDAO.crearMensajeDB(registro);
    }

    public static void listarMnensajes()
    {
        MensajesDAO.leerMensajes();
    }

    public static void borrarMensaje()
    {

    }

    public static void editarMensaje()
    {

    }
}
