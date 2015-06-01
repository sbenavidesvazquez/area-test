/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculaarea;

/**
 *
 * @author sbenavidesvazquez
 */
public class CalculaArea {

    Vista v=new Vista();
    Metodo m=new Metodo();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Vista v=new Vista();
    Metodo m=new Metodo();
    
    v.recogerDatos(m);
    
    //calArea(m);
    v.imprimir(m);
    }
    
    public static float calArea(Metodo mo){
    
    switch (mo.getFigura()){
        case "cuadrado":
           mo.setArea(mo.getBase()*mo.getBase());
            break;
        case "rectangulo":
            mo.setArea(mo.getBase()*mo.getAltura());        
            break;
        case "triangulo":
            mo.setArea((float) 0.5*mo.getBase()*mo.getAltura());
            break;
        case "circulo":
            mo.setArea((float) 3.14159265*mo.getRadio());
            break;
    }
    return mo.getArea();
}
    
}
