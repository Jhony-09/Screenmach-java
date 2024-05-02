package modelo;

public class Titulo {
    private String nombre;
    private int fechaLanzamiento;
    private double evaluacion;
    private boolean incluidoEnElPlanBasico;
    private String sinopsis;
    private int duracion;


    public void mostrarFichaTecnica(){
        System.out.println("++++++ FICHA TECNICA +++++");
        System.out.println("Titulo: " + nombre);
        System.out.println("Fecha Lanzamiento: " + fechaLanzamiento);
        System.out.println("Sinopsis: " + sinopsis);
        System.out.println("Duracion: " + getDuracion());

    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public double getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(double evaluacion) {
        this.evaluacion = evaluacion;
    }

    public boolean isIncluidoEnElPlanBasico() {
        return incluidoEnElPlanBasico;
    }

    public void setIncluidoEnElPlanBasico(boolean incluidoEnElPlanBasico) {
        this.incluidoEnElPlanBasico = incluidoEnElPlanBasico;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
