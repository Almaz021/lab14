public class Pizzeria {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.init();
        Client client1 = new Client(Discount.BIRTHDAY, "Алексей", Gender.MALE);
        Client client2 = new Client(Discount.NEW, "Светлана", Gender.FEMALE);
        Client client3 = new Client(Discount.OTHER, "Сергей", Gender.MALE);

        Cooker cooker1 = new Cooker("Дмитрий", Gender.MALE);
        Cooker cooker2 = new Cooker("Александра", Gender.FEMALE);

        Order order1 = new Order(Pizza.CHEESE, Status.ORDERED, client1, cooker1, 10, list.next(list.current));
        Order order2 = new Order(Pizza.PEPPERONI, Status.ORDERED, client2, cooker1, 15, list.next(list.current));
        Order order3 = new Order(Pizza.PERSONAL, Status.ORDERED, client3, cooker2, 20, list.next(list.current));
        Order order4 = new Order(Pizza.CHEESE, Status.ORDERED, client1, cooker1, 10, list.next(list.current));
        Order order5 = new Order(Pizza.PEPPERONI, Status.ORDERED, client2, cooker1, 15, list.next(list.current));
        Order order6 = new Order(Pizza.PERSONAL, Status.ORDERED, client3, cooker2, 20, list.next(list.current));
        Order order7 = new Order(Pizza.CHEESE, Status.ORDERED, client1, cooker1, 10, list.next(list.current));
        Order order8 = new Order(Pizza.PEPPERONI, Status.ORDERED, client2, cooker1, 15, list.next(list.current));
        Order order9 = new Order(Pizza.PERSONAL, Status.ORDERED, client3, cooker2, 20, list.next(list.current));
        Order order10 = new Order(Pizza.CHEESE, Status.ORDERED, client1, cooker1, 10, list.next(list.current));
        Order order11 = new Order(Pizza.PEPPERONI, Status.ORDERED, client2, cooker1, 15, list.next(list.current));
        Order order12 = new Order(Pizza.PERSONAL, Status.ORDERED, client3, cooker2, 20, list.next(list.current));

        order1.makeOrder();
        order2.makeOrder();
        order3.makeOrder();
        order4.makeOrder();
        order5.makeOrder();
        order6.makeOrder();
        order7.makeOrder();
        order8.makeOrder();
        order9.makeOrder();
        order10.makeOrder();
        order11.makeOrder();
        order12.makeOrder();

    }
}
