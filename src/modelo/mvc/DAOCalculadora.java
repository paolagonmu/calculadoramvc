/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.mvc;

/**
 *
 * @author sena
 */
public class DAOCalculadora {
   private double resultado=0;
  public double recuperar(){
      return resultado;

      
  }
  
    public void guardar_mMas(double resultado){
    this.resultado=resultado;
    }
    
    public void guaradar_mMenos(double resultado){
    }
    
   public void Mc (double resultado ){
       this.resultado=resultado;
   } 
    
}


