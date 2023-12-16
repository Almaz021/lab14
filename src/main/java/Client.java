public class Client extends Person {
    public Discount discount;
    public Gender gender;
    public String name;

    public Client(Discount discount, String name, Gender gender) {
        this.discount = discount;
        this.gender = gender;
        this.name = name;

    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
}
