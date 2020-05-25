package com.example.sistemaacceso;

public class Modelos {
    private String Modelo,Nacionalidad;
    private  int FotoModelo;

    public Modelos() {
    }

    public Modelos(String modelo, String nacionalidad, int fotoModelo) {
        Modelo = modelo;
        Nacionalidad = nacionalidad;
        FotoModelo = fotoModelo;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }

    public int getFotoModelo() {
        return FotoModelo;
    }

    public void setFotoModelo(int fotoModelo) {
        FotoModelo = fotoModelo;
    }
}
