package guardar;

import javax.swing.JOptionPane;

public class ConnectionMannager {
    IGuardar guardar;
    int guard;
    boolean c;
    public  boolean conectar(int connect){        
        if (connect == 0) {
            guard = JOptionPane.showConfirmDialog(null, "¿Desea guardar los documentos en el servidor?", "Guardar", JOptionPane.YES_NO_OPTION);
            if (guard != 0) {
                JOptionPane.showMessageDialog(null, "Los documentos serán guardados en el disco duro", "confirmación", JOptionPane.INFORMATION_MESSAGE);
                c = false;                
            } else {
                c = true;                
            }
        } else {
           JOptionPane.showMessageDialog(null, "Los documentos serán guardados en el disco duro", "confirmación", JOptionPane.OK_CANCEL_OPTION);
           c = false;
        }
        return c;
    }
}
