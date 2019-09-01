package game.creature;

public enum Characteristic {

    STUBBORN("stur"),
    LAZY("faul"),
    SMART("schlau"),
    CUNNINGLY("listig");

    private final String value;

    Characteristic(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
