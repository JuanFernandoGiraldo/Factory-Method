package concrete.creator;

import concret.product.*;
import factory.method.*;

public class PresentationApplication extends Application{

    @Override
    protected Document createDocument() {
        return new PresentationDocument();
    }
    
}
