package entronos_ed_t4_ejer1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alfgonru
 */
public class Votacion {

    private String nombre;
    private Integer votos;

    public Votacion() {

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
        this.nombre = nombre;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Votacion [nombre=" + nombre + ", votos=" + votos + "]";
    }
}
