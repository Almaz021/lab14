public enum Status {
    ORDERED("O"), COOKING("C"), READY("R");
    private final String value;

    Status(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
