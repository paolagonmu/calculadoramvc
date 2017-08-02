/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.mvc;

import modelo.mvc.classmodelo;

/**
 *
 * @author sena
 */
public class classcontrol {
    classmodelo daoCalculadora1=new classmodelo();
     private double num1;
      private double num2;
       private double num3;
        private double resultado;
        
   public void ingresar_numeros(double num1, double num2) {
   this.num1=num1;
   this.num2=num2;
   
   }
  public void suma() {
      resultado= num1+num2;
      
      
  
  }
 public double mostrar(){
         return resultado;
     
 }
public void mMas(double num3){
    this.num3=num3;
  resultado= daoCalculadora1.recuperar();
  sumar(resultado,num3);
  daoCalculadora1.guardar_mMas(resultado);
}
   public double sumar(double resultado, double num3){
        this.resultado=resultado;
        this.num3=num3;
        this.resultado=resultado+num3;
        return this.resultado;
}
   public double mr() {
   resultado=daoCalculadora1.recuperar();
   return resultado;
   }
   
   
}

