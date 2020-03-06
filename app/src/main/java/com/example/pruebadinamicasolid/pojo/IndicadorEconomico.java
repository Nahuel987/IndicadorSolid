package com.example.pruebadinamicasolid.pojo;

import java.util.ArrayList;

public class IndicadorEconomico {

    private String nombre;
    private String unidad_medida;
    private ArrayList<SerieIndicadorEconomico> serie;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUnidad_medida() {
        return unidad_medida;
    }
    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }
    public ArrayList<SerieIndicadorEconomico> getSerie() {
        return serie;
    }
    public void setSerie(ArrayList<SerieIndicadorEconomico> serie) {
        this.serie = serie;
    }



}//class
