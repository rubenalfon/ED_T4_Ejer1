package entronos_ed_t4_ejer1;

public class Votacion {

    private String nombre;
    private Integer votos;

    public Votacion() {

    }
    public String resumen() {
        return "Nombre:" + nombre + "\nvotos:" + votos;
    }

    public Votacion(String nombre, Integer votos) {
        super();
        this.nombre = nombre;
        this.votos = votos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }
}
