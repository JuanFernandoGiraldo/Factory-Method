package concrete.creator;

import factory.method.*;
import concret.product.*;

public class TextEditorApplication extends Application {

    @Override
    protected Document createDocument() {
        return new TextDocument();
    }
    
}
