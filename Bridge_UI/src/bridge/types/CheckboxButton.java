package bridge.types;

import bridge.Button;
import bridge.ButtonSize;

public class CheckboxButton extends Button {
    public CheckboxButton(ButtonSize size) {
        super(size);
    }

    public void draw() {
        size.applySize();
        System.out.println("Drawing a checkbox button.\n");
    }
}