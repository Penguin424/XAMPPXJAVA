import java.util.Scanner;
import com.MSJDB.MensajesService;
import com.URDB.UsuariosService;

public class Inicio
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        do {

            System.out.println("--------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println(" 1.- Crear mensaje");
            System.out.println(" 2.- listar Mensajes" );
            System.out.println(" 3.- Editar mensaje");
            System.out.println(" 4.- Eliminar mensaje");
            System.out.println(" 5.- Crear usuario");
            System.out.println(" 6.- Salir");

            //Leer opcion del UI
            System.out.println("\n Ingresa tu opcion: ");
            opcion = sc.nextInt();

            switch (opcion)
            {
                case 1:
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listarMnensajes();
                    break;
                case 3:
                    MensajesService.editarMensaje();
                    break;
                case 4:
                    MensajesService.borrarMensaje();
                    break;
                case 5:
                    UsuariosService.crearUsuario();
                    break;
                default:
                    break;
            }

        }
        while (opcion != 6);

    }
}
