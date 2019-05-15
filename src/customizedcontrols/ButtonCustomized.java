package customizedcontrols;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.control.Button;

public class ButtonCustomized extends Button{

    private IntegerProperty pptNumClics;

    public int getPptNumClics() {
        return pptNumClics.get();
    }

    public IntegerProperty pptNumClicsProperty() {
        return pptNumClics;
    }

    public void setPptNumClics(int pptNumClics) {
        this.pptNumClics.set(pptNumClics);
    }

    public ButtonCustomized(String text) {
        super(text);

        pptNumClics = new SimpleIntegerProperty(0);

        //Rotar el botón 45 grados
        this.setRotate(-45);
    }

    public void contarClic(){
        this.setPptNumClics(this.getPptNumClics() + 1);
    }


}






