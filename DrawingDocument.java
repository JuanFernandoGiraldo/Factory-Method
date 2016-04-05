
package concret.product;

//Concret Product

import factory.method.*;
import javax.swing.JOptionPane;

public class DrawingDocument implements Document{
    @Override
    public void open() {
        System.out.println("Abriendo documento de dibujo");
        JOptionPane.showMessageDialog(null, "Abriendo documento de dibujo");
    }        
}
