package com.URDB;

import java.util.Scanner;

public class UsuariosService
{
    private static Scanner sc = new Scanner(System.in);

    public static void crearUsuario()
    {
        //instanciamos la clase scanner para leer datos

        System.out.println("indica tu nombre completo");
        String nombre_completo = sc.nextLine();
        System.out.println("indica tu correo");
        String correo = sc.nextLine();
        System.out.println("indica tu clave");
        String clave = sc.nextLine();

        Usuarios registro = new Usuarios(0, correo, clave, nombre_completo);
        UsuariosDAO.crearUsuarioDB(registro);
    }
}
