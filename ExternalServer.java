package guardar;

import factory.method.*;
import java.util.ArrayList;

public class ExternalServer implements IGuardar{
    ArrayList <Document> bd;
    
    protected ExternalServer (){
     bd = new ArrayList<>();
    }
    
    private static ExternalServer server = null;
    
    public static ExternalServer getServer(){
        if(server == null){
            server = new ExternalServer();
        }
        return server;
    }

    @Override
    public void save(Document datos) {
        bd.add(datos);
    }
}
