
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Circulo;
import ec.edu.intsuperior.modelo.Punto;
import javax.swing.JOptionPane;

public class Aplicacion {
    public static void main(String[] args) {
        Punto p1= new Punto(4,3);
        Punto p2=new Punto (-3,1);
        Circulo c1 = new Circulo(5,p1);
        
        System.out.println("La distancia entre los puntos 1 y 2 es:"+p1.distanciaDosPuntos(p2.getX(),p1.getX(),p2.getY(),p1.getY()));
        System.out.println("La distancia del punto 1 al centro es: "+p1.distanciaAlCentro(p1.getX(),p1.getY()));
        System.out.println("La distancia del punto 2 al centro es: "+p2.distanciaAlCentro(p2.getX(),p2.getY()));
        
        JOptionPane.showMessageDialog(null,"El circulo se encuentra en el punto:"+"P1 ("+c1.getCentro().getX()+";"+c1.getCentro().getY() +")"+"\nEl radio del circulo es: "+c1.getRadio()
        +"\n"+"El Area del circulo es: "+c1.areaCirculo());
        
        
        
        
        
     
    }
 
}
