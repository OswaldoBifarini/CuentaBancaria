/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoc.cuentabancaria;

/**
 *
 * @author DELL
 */
public class CuentaBancaria {

    public static void main(String[] args) {
        
    public float saldo;
    private int numeroConsignaciones;
    private int numeroRetiros;
    private float tasaAnual;
    private float comisionMensual;

    public void Consignar(float cantidad) {
     
        saldo += cantidad;
        numeroConsignaciones++;
    }

    public void Retirar(float cantidad) {
        
        saldo -= cantidad;
        numeroRetiros++;
    }

    public void ExtraerMensual() {
       
        saldo -= comisionMensual;
    }

    public void Imprimir() {
      
        System.out.println("Saldo: " + saldo);
        System.out.println("Número de consignaciones: " + numeroConsignaciones);
        System.out.println("Número de retiros: " + numeroRetiros);
        System.out.println("Tasa anual: " + tasaAnual);
        System.out.println("Comisión mensual: " + comisionMensual);
    }
}
  
