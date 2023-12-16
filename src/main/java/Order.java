public class Order {
    public Pizza pizza;
    public Status status;
    public Client client;
    public Cooker cooker;
    public int time;
    public int num;
    public int disc;

    public Order(Pizza pizza, Status status, Client client, Cooker cooker, int time, int num) {
        this.pizza = pizza;
        this.status = status;
        this.client = client;
        this.cooker = cooker;
        this.time = time;
        this.num = num;
        this.disc = client.discount.value();
    }

    public void makeOrder() {
        int price = 10 * time * num * (100 - disc) / 100;
        setStatus(Status.COOKING);
        cooker.cook(pizza, time);
        setStatus(Status.READY);
        System.out.println("Order price for " + client.getName() + " №" + num + " " + price + "$");
        System.out.println();
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
