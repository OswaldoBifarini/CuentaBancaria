
package ec.edu.espoc.cuentabancaria;


public class CuentaBancaria {

    public class Cuenta {

    private float saldo;
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

}