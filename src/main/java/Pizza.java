public enum Pizza {
    PEPPERONI("P"), MARGARITA("M"), CHEESE("C"), PERSONAL("PER");
    private final String value;

    Pizza(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
