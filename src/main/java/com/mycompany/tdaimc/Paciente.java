/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tdaimc;

/**
 *
 * @author jhosw
 */
public class Paciente extends tdaIMC {
    private String idPaciente;

    // Constructor con herencia (super)
    public Paciente(String nombre, int edad, float pesoKg, float estaturaMetros, String idPaciente) {
        super (nombre, edad, pesoKg, estaturaMetros);
        this.idPaciente = idPaciente;
    }

    public String getIdPaciente() { return idPaciente; }
    public void setIdPaciente(String idPaciente) { this.idPaciente = idPaciente; }

    // Método de procesamiento propio de la subclase
    public String obtenerReportePaciente() {
        float imc = calcularIMC();
        return "ID: " + idPaciente + "\n" +
               "Paciente: " + getNombre() + "\n" +
               "IMC: " + String.format("%.2f", imc) + " (" + interpretarIMC() + ")";
    }
}
