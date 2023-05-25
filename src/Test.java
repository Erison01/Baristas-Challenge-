public class Test {
    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("Jon");
        Order order4 = new Order("Adam");
        Order order5 = new Order("Sam");

        Item item1 = new Item("drip coffe",2.5);
        Item item2 = new Item("latte",3.4);

        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item1);
        order2.addItem(item2);

        order3.addItem(item1);
        order3.addItem(item2);

        order4.addItem(item1);
        order4.addItem(item2);

        order5.addItem(item1);
        order5.addItem(item2);

        System.out.println("-----ORDERS DISPLAY -------");

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();

        System.out.println("-------Testing Message-----");

        order2.setReady(false);
        System.out.println("Hello " + order2.getName() + " " + order2.getStatusMessage());

        order5.setReady(true);
        System.out.println("Hello " + order5.getName() + " " + order5.getStatusMessage());
    }
}
