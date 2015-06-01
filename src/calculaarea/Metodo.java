
package calculaarea;

/**
 *
 * @author sbenavidesvazquez
 */
public class Metodo {
    String figura;
    float base, altura,radio,area;

    public Metodo() {
    }

    public Metodo(String figura, float base, float altura, float radio) {
        this.figura = figura;
        this.base = base;
        this.altura = altura;
        this.radio = radio;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
    
    
}
