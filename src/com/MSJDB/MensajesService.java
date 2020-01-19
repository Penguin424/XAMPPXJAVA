package com.MSJDB;

import java.util.Scanner;

public class MensajesService
{

    private static Scanner sc = new Scanner(System.in);

    public static void crearMensaje()
    {


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
        System.out.println("Indica el mensaje a borrar con su id: ");
        int id = sc.nextInt();
        MensajesDAO.borrarMensajeDB(id);
    }

    public static void editarMensaje()
    {
        System.out.println("Ingre2sa el nuevo mensaje: ");
        String mensaje = sc.nextLine();

        System.out.println("Ingresa el id del mensaje a actualizar");
        int id_mensaje = sc.nextInt();

        Mensajes registro = new Mensajes();

        registro.setMensaje(mensaje);
        registro.setIdMensaje(id_mensaje);

        MensajesDAO.actualizarMensajeDB(registro);
    }
}
