import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("MATRIX");
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre= "Matrix";
        String sinopsis = """
                La mejor pelicula relacionado a la tecnología
                """;

        double mediaEvaluacionUsuario = 0;
        //System.out.println("La fecha de lanzaminto de la peli es " + fechaDeLanzamiento + "su evaluación es de " + evaluacion + " Tiene plan basico " + incluidoEnElPlanBasico);
        System.out.println("Pelicula: " + nombre);
        System.out.println(" sinopsis: " + sinopsis);
        System.out.println(" Fecha Lanzamiento: " + fechaDeLanzamiento);
        System.out.println(" Evalucacion: " + evaluacion);
        System.out.println(" Contiene plan de subscripcion: " +  incluidoEnElPlanBasico);


        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la evalucion es: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2024){
            System.out.println("la pelicula es reciente");
        } else{
            System.out.println("la pelicula no es reciente");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese la nota que le da a la pelicula matrix");
            double nota = teclado.nextDouble();
             mediaEvaluacionUsuario = mediaEvaluacionUsuario + nota;

        }
        System.out.println("La media de la pelicula matrix calculada es: " + mediaEvaluacionUsuario / 3);

    }
}