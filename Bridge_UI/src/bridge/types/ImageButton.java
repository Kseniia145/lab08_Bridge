package bridge.types;

import bridge.Button;
import bridge.ButtonSize;

public class ImageButton extends Button {
    public ImageButton(ButtonSize size) {
        super(size);
    }

    public void draw() {
        size.applySize();
        System.out.println("Drawing an image button.\n");
    }
}