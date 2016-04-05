package concrete.creator;

//Concrete Creator

import concret.product.*;
import factory.method.*;

public class DrawingApplication extends Application{

    @Override
    protected Document createDocument() {
        return new DrawingDocument();
    }
}
