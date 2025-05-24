package bridge;

import bridge.sizes.*;
import bridge.types.*;

public class Main {
    public static void main(String[] args) {
        Button cb = new CheckboxButton(new SmallSize());
        cb.draw();

        Button rb = new RadioButton(new MediumSize());
        rb.draw();

        Button dd = new DropdownButton(new LargeSize());
        dd.draw();

        Button img = new ImageButton(new UserSize("300x150"));
        img.draw();
    }
}
