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
public class MetodoSimpson {
    Integracion data;
    public MetodoSimpson(){}

    public MetodoSimpson(Integracion data) {
        this.data = data;
    }
    
     private double fx(double x){
        return Math.pow(x,3)-(2*Math.pow(x,2))+x+2;

    }
    
    private double x(int i){
        return (this.data.getA()+(this.data.getH()*i));
    }
    public double Simpson(){
        double integral =0;
        double sumaPares=0;
        double sumaImpares=0;
        double fa=this.fx(this.data.getA());
        double fb=this.fx(this.data.getB());
        
        for(int i=1; i<this.data.getN(); i++){
            if(i%2==0){
                sumaPares+=this.fx(this.x(i));
            }
            else{
                sumaImpares+=this.fx(this.x(i));
            }
        }
 
        integral=(this.data.getH()/3)*(fa+(4*sumaImpares)+(2*sumaPares)+fb);
        return integral;
    }
    
}
