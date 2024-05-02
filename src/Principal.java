import modelo.Pelicula;
import modelo.Serie;

import java.util.Scanner;

public class Principal {

    int dia;

    Pelicula peliculaUser;

    Serie serieUser;


    public void  muestraMenu() {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        peliculaUser = new Pelicula();

        while (opcion != 9) {

            String menu = """
                    
                    BIENVENIDO
                    1) REGISTRAR NUEVA PELICULA
                    2) REGISTRAR NUEVA SERIE
                    3) CACULADORA DE TIEMPO
                    
                    9) SALIR
                    """;
            System.out.println(menu);

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    /*System.out.println("Ingrese los datos de la pelicula");
                    String nombre =  sc.nextLine();
                    System.out.println("Ingrese la fecha de lanzamiento");
                    int fechaLanzamiento =  sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese las duracion en minutos de la pelicula");
                    int duracionEnMinutos =  sc.nextInt();
                    sc.nextLine();

                    Pelicula peliculaUser = new Pelicula();
                    peliculaUser.setNombre(nombre);
                    peliculaUser.setFechaLanzamiento(fechaLanzamiento);
                    peliculaUser.setDuracion(duracionEnMinutos);

                    peliculaUser.mostrarFichaTecnica();*/


                    System.out.println("Ingrese Los datos de la pelicula");
                    peliculaUser.setNombre(sc.nextLine());
                    System.out.println("Ingrese el año de la pelicula");
                    peliculaUser.setFechaLanzamiento(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Ingrese la duracion en minutos");
                    peliculaUser.setDuracion(sc.nextInt());
                    sc.nextLine();

                    peliculaUser.mostrarFichaTecnica();
                    break;

                case 2 :

                    serieUser = new Serie();

                    System.out.println("Ingrese el titutlo de la serie");
                    serieUser.setNombre(sc.nextLine());
                    System.out.println("Ingrese la fecha de lanzamiento");
                    serieUser.setFechaLanzamiento(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Inrese las temporada");
                    serieUser.setTemporadas(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Episodios por temprada");
                    serieUser.setEpisodiosPorTemporadas(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Ingrese Duracion por Episodio");
                    serieUser.setDuracionPorEpisodio(sc.nextInt());
                    sc.nextLine();

                    peliculaUser.mostrarFichaTecnica();

                    calcularDiasParaVerUnEpisodio(serieUser);


                    break;

                case 3 :
                    System.out.println("Ingrese la duracion en minutos");
                    peliculaUser.setDuracion(sc.nextInt());
                    sc.nextLine();
                    dia = peliculaUser.getDuracion() / 1440;
                    System.out.println("Los días que llevara ver la serie son los siguientes: " + dia);
                    break;

                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }


        }
    }

    public void calcularDiasParaVerUnEpisodio(Serie serie){

        dia = serie.getDuracion() / 1440;
        System.out.println("Los días que llevara ver la serie son los siguientes: " + dia);
    }

}
