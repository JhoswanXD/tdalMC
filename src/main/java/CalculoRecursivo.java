/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jhosw
 */
public class CalculoRecursivo {
    // Método RECURSIVO para estimar el peso proyectado a N meses perdiendo X kilos al mes
    public static float proyectarPesoRecursivo(float pesoActual, float kgPerdidosPorMes, int meses) {
        // Caso Base
        if (meses <= 0) {
            return pesoActual;
        }
        
        // Avance recursivo
        float nuevoPeso = pesoActual - kgPerdidosPorMes;
        return proyectarPesoRecursivo(nuevoPeso, kgPerdidosPorMes, meses - 1);
    }
}
