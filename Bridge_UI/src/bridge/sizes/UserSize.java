package bridge.sizes;

import bridge.ButtonSize;

public class UserSize implements ButtonSize {
    private final String dimensions;

    public UserSize(String dimensions) {
        this.dimensions = dimensions;
    }

    public void applySize() {
        System.out.printf("Setting custom user size to %s...%n", dimensions);
    }
}