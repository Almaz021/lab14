public class Cooker extends Person {
    public Gender gender;
    public String name;
    public Cooker(String name, Gender gender) {
        this.gender = gender;
        this.name = name;
    }

    public void cook(Pizza pizza, int time) {
        System.out.println("Cooked " + pizza + " by " + name + " in " + time + " minutes!");

    }
}
