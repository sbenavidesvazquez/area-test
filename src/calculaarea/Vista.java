
package calculaarea;

import javax.swing.JOptionPane;

/**
 *
 * @author sbenavidesvazquez
 */
public  class Vista {
    Metodo ob=new Metodo();
    
    public void recogerDatos(Metodo m){        
        m.setBase(Float.parseFloat(JOptionPane.showInputDialog("La base de la figura")));
        m.setAltura(Float.parseFloat(JOptionPane.showInputDialog("La altura de la figura")));
        m.setRadio(Float.parseFloat(JOptionPane.showInputDialog("El radio de la figura")));
        m.setFigura(JOptionPane.showInputDialog("¿Que area quiere calcular?\ncuadrado\nrectangulo\ntriangulo\ncirculo"));
    }
    
    public void imprimir(Metodo mo){
        JOptionPane.showMessageDialog(null, "El area del "+mo.getFigura()+" es igual a "+mo.getArea());
    }
}
