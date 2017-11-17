/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areasfiguras;
import javax.swing.JOptionPane;
/**
 *
 * @author betty
 */
public class AreasFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realizar un programa que nos permita calcular el area de una figura
        String valor=JOptionPane.showInputDialog("Elija el numero de la figura\n1.-Rectangulo\n2.-Triangulo\n3.-Trapecio");
  int opcion=Integer.parseInt(valor);
  
    switch(opcion){
    case 1:{
    valor=JOptionPane.showInputDialog("Base");
    double base=Double.parseDouble(valor);
    valor=JOptionPane.showInputDialog("Altura");
    double altura=Double.parseDouble(valor);
    double area=base*altura;
    JOptionPane.showMessageDialog(null, "El area es: "+area);
   }
   break;
   
   case 2:{
    valor=JOptionPane.showInputDialog("Base");
    double base=Double.parseDouble(valor);
    valor=JOptionPane.showInputDialog("Altura");
    double altura=Double.parseDouble(valor);
    double area=(base*altura)/2;
    JOptionPane.showMessageDialog(null, "El area es: "+area);
   }
   break;
   
   case 3:{
    valor=JOptionPane.showInputDialog("Base mayor");
    double base1=Double.parseDouble(valor);
    valor=JOptionPane.showInputDialog("Base menor");
    double base2=Double.parseDouble(valor);
    valor=JOptionPane.showInputDialog("Altura");
    double altura=Double.parseDouble(valor);
    double area=(base1+base2)*altura/2;
    JOptionPane.showMessageDialog(null, "El area es: "+area);
   }
   break;
   
   default:
    System.out.println("Opcion no validad");
   }
}
}