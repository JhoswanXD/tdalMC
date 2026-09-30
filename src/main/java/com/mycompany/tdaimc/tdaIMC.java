/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tdaimc;

/**
 *
 * @author jhosw
 */
public class tdaIMC {

    // Atributos privados (Encapsulamiento)
    private String nombre;
    private int edad;
    private float pesoKg;
    private float estaturaMetros;

    // 1. Constructor por defecto
    public tdaIMC() {
        this.nombre = "Desconocido";
        this.edad = 0;
        this.pesoKg = 70.0f;
        this.estaturaMetros = 1.70f;
    }

    // 2. Constructor con parámetros
    public tdaIMC(String nombre, int edad, float pesoKg, float estaturaMetros) {
        this.nombre = nombre;
        this.edad = (edad > 0) ? edad : 18;
        this.pesoKg = (pesoKg > 0) ? pesoKg : 70.0f;
        this.estaturaMetros = (estaturaMetros > 0) ? estaturaMetros : 1.70f;
    }

    // 3. Constructor copia
    public tdaIMC(tdaIMC copia) {
        this.nombre = copia.nombre;
        this.edad = copia.edad;
        this.pesoKg = copia.pesoKg;
        this.estaturaMetros = copia.estaturaMetros;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public float getPesoKg() { return pesoKg; }
    public void setPesoKg(float pesoKg) { this.pesoKg = pesoKg; }

    public float getEstaturaMetros() { return estaturaMetros; }
    public void setEstaturaMetros(float estaturaMetros) { this.estaturaMetros = estaturaMetros; }

    // Métodos de procesamiento / lógica
    public float calcularIMC() {
        return this.pesoKg / (this.estaturaMetros * this.estaturaMetros);
    }

    public String interpretarIMC() {
        float imc = calcularIMC();
        if (imc < 18.5f) {
            return "Bajo peso";
        } else if (imc < 25.0f) {
            return "Peso normal";
        } else if (imc < 30.0f) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }
}
