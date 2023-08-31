public class Main {
    public static void main(String[] args) {
    System.out.println("Первый объект\n");
    Phone phone_one = new Phone(90345684673L,"Samsung", 240.6f );

    phone_one.numbers = 90345684673L;
    phone_one.model = "Samsung";
    phone_one.weight = 240.6f;

        System.out.println("Номер: " + phone_one.numbers + "\nМодель: " + phone_one.model + "\nВес: " + phone_one.weight +"\n");

    phone_one.receiveCall("Ivan");
    String num = phone_one.getNumbers();
    System.out.println(num + "\n");

    System.out.println("Второй объект\n");
    Phone phone_two = new Phone(82345694536L, "iPhone", 125.8f);

    phone_two.numbers = 82345694536L;
    phone_two.model = "iPhone";
    phone_two.weight = 125.8f;

        System.out.println("Номер: " + phone_two.numbers + "\nМодель: " + phone_two.model + "\nВес: " + phone_two.weight +"\n");

    phone_two.receiveCall("Sveta");
    String num1 = phone_two.getNumbers();
    System.out.println(num1 +"\n");

    System.out.println("Третий объект\n");
    Phone phone_three = new Phone(83243764543L, "Nokia", 93.6f);

    phone_three.numbers = 983243764543L;
    phone_three.model = "Nokia";
    phone_three.weight = 93.6f;

    System.out.println("Номер: " + phone_three.numbers + "\nМодель: " + phone_three.model + "\nВес: " + phone_three.weight +"\n");

    phone_three.receiveCall("Masha");
    String num2 = phone_three.getNumbers();
    System.out.println(num2);

    }
}