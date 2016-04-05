package guardar;

import factory.method.*;
import java.util.ArrayList;

public class  HardDisk implements IGuardar{
    ArrayList <Document> temp;
    protected void HardDisk(){
        temp = new ArrayList<>();
    }
    
    private static HardDisk disco = null;
    public static HardDisk getDisk(){
        if (disco==null){
            disco = new HardDisk();
        }
        return disco;
    }
    @Override
    public void save(Document datos) {
        temp.add(datos);
    }
    
}
