public enum Discount {
    NEW(30), BIRTHDAY(20), SPONSOR(50), CREATOR(100), OTHER(10);
    private final int value;

    Discount(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
