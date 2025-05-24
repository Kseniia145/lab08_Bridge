package bridge.types;

import bridge.Button;
import bridge.ButtonSize;

public class RadioButton extends Button {
    public RadioButton(ButtonSize size) {
        super(size);
    }

    public void draw() {
        size.applySize();
        System.out.println("Drawing a radio button.\n");
    }
}
