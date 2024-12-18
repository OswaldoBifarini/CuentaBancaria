/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoc.cuentabancaria.clases;

/**
 *
 * @author anthony
 */
public class CuentaAhorros {
    public class CuentaAhorro extends Cuenta {
    private boolean estaActiva;

   
    @Override
    public void Consignar(float cantidad) {
        // Lógica para consignar dinero en la cuenta de ahorro
        if (estaActiva) {
            super.Consignar(cantidad);
        } else {
            System.out.println("La cuenta de ahorro está inactiva.");
        }
    }

 
    @Override
    public void Retirar(float cantidad) {
        // Lógica para retirar dinero de la cuenta de ahorro
        if (estaActiva) {
            super.Retirar(cantidad);
        } else {
            System.out.println("La cuenta de ahorro está inactiva.");
        }
    }

   
    @Override
    public void ExtraerMensual() {
        // Lógica para extraer la comisión mensual de la cuenta de ahorro
        if (estaActiva) {
            super.ExtraerMensual();
        } else {
            System.out.println("La cuenta de ahorro está inactiva.");
        }
    }
}
    
}
