package bridge.types;

import bridge.Button;
import bridge.ButtonSize;

public class DropdownButton extends Button {
    public DropdownButton(ButtonSize size) {
        super(size);
    }

    public void draw() {
        size.applySize();
        System.out.println("Drawing a dropdown button.\n");
    }
}