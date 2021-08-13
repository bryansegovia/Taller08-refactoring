package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante {

    protected Estudiante est;
    public ArrayList<Paralelo> paralelos;

    public Ayudante(String matricula, String nombre, String apellido) {
        super(matricula, nombre, apellido);
    }

    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos() {
        for (Paralelo par : paralelos) {
            //Muestra la info general de cada paralelo
        }
    }
}
