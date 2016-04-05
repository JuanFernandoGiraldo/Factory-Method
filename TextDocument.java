package concret.product;

import factory.method.*;
import javax.swing.*;

public class TextDocument implements Document {

    @Override
    public void open() {
        System.out.println("Abriendo documento de texto");
        JOptionPane.showMessageDialog(null, "Abriendo documento de texto");
    }
    
}
