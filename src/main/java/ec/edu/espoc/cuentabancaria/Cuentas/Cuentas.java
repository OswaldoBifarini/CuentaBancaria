/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoc.cuentabancaria.Cuentas;

/**
 *
 * @author user
 */
public class Cuentas {
    //Atributos
    protected float saldo;
    protected int nConsignacion=0;
    protected int nRetiros=0;
    protected float tasaAnual;
    protected float comisionacionAnual=0;

    //constructor
    public Cuentas(float saldo, float tasaAnaul) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnaul;
    }
    
    //metodos              *parametro
    public void consignar(float cantidad){
         this.saldo=this.saldo+cantidad;
    }
    
    public void retirarDinero(float cantidad){
     
         
        if(cantidad<=this.saldo){
            this.saldo=this.saldo-cantidad;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    
    public float calcularInteresMensual(){
       
        float interes=((this.tasaAnual/100)*this.saldo)/12;
        
        this.saldo=this.saldo+interes; 
        return interes;
    }

    public void extractoMensual(){
        this.saldo=this.saldo-calcularInteresMensual();
        
    }
    
    public void imprimir(){
        System.out.println("salddo"+saldo);
        System.out.println("tasaAnual"+tasaAnual);
        System.out.println("");
        
    }
    
    
    
    

}
