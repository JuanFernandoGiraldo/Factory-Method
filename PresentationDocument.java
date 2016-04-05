package concret.product;

import factory.method.*;
import javax.swing.JOptionPane;

public class PresentationDocument implements Document{

    @Override
    public void open() {
        System.out.println("Abriendo documento de presentación");
        JOptionPane.showMessageDialog(null, "Abriendo documento de presentación");
    }
    
}
