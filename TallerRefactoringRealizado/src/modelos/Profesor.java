package modelos;

import java.util.ArrayList;

public class Profesor {

    private int añosdeTrabajo;
    private double BonoFijo;
    private String codigo;
    private String nombre;
    private String apellido;
    private ArrayList<Paralelo> paralelos;

    public Profesor(int añosdeTrabajo, String codigo, String nombre, String apellido) {
        this.añosdeTrabajo = añosdeTrabajo;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.paralelos = new ArrayList<>();
    }

    public double calcularSueldo() {
        double sueldo = this.getAñosdeTrabajo() * 600 + this.getBonoFijo();
        return sueldo;
    }

    // Getters and Setters----------------------------------------------------
    public void anadirParalelos(Paralelo p) {
        paralelos.add(p);
    }

    public int getAñosdeTrabajo() {
        return añosdeTrabajo;
    }

    public void setAñosdeTrabajo(int añosdeTrabajo) {
        this.añosdeTrabajo = añosdeTrabajo;
    }

    public double getBonoFijo() {
        return BonoFijo;
    }

    public void setBonoFijo(double BonoFijo) {
        this.BonoFijo = BonoFijo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Paralelo> getParalelos() {
        return paralelos;
    }

    public void setParalelos(ArrayList<Paralelo> paralelos) {
        this.paralelos = paralelos;
    }
}
