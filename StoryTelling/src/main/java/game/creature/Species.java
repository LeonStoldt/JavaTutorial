package game.creature;

public enum Species {

    ANGEL("Engel"),
    CASUAL_HUMAN("Mensch"),
    DRAGON("Drache"),
    FAIRY("Fee"),
    GOBLIN("Kobold"),
    INVERTEBRATES_ANIMAL("Wirbellos"),
    KNIGHT("Ritter"),
    VAMPIRE("Vampier"),
    VERTEBRATES_ANIMAL("Wirbeltier"),
    WITCH("Hexe"),
    WIZARD("Zauberer"),
    OTHER("Sonstige");

    private final String value;

    Species(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
