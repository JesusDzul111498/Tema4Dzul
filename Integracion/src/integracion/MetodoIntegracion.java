/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion;

/**
 *
 * @author Familiadc
 */
public class MetodoIntegracion {
    Integracion data;

    public MetodoIntegracion(Integracion data) {
        this.data = data;
    }
    
    private double fx(double x){
       return Math.sqrt(1+Math.pow(x,2));
       
   }
   public double Trapecio(){
       double integral =0;
       double suma=0;
       double fa=this.fx(this.data.getA());
       double fb=this.fx(this.data.getB());
       
       integral=fa+fb;
       
       for(int i=1; i<=this.data.getN()-1; i++){
           suma+= this.fx( this.data.getH() * i + this.data.getA() );
       }
       
       integral= (integral+2*suma)*(this.data.getH()/2);
       
       return integral;
   }
}
