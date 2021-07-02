
package ec.edu.intsuperior.modelo;

public class Celular {
    private String marca;
    private double pesio;
    private String color;

    public Celular() {
    }

    public Celular(String marca, double pesio, String color) {
        this.marca = marca;
        this.pesio = pesio;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPesio() {
        return pesio;
    }

    public void setPesio(double pesio) {
        this.pesio = pesio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
