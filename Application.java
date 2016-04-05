package factory.method;

import java.util.ArrayList;

//Creator
public abstract class Application{ 
    
    private ArrayList<Document> documentList;
    
    public Application(){
        documentList = new ArrayList<Document>();
    }
    
    protected abstract Document createDocument(); //Factory Method
    
    public void newDocument(){
        Document newDocument = createDocument();
            documentList.add(newDocument);
            newDocument.open();
    }
    
    public void openDocument(){
        
    }
}
