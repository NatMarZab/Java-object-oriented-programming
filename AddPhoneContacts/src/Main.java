public class Main {
    public static void main(String[] args) {
        Contact contactOne = new Contact("Natalia", new Phone("424224242424242"));
        Contact contactTwo = new Contact("María", new Phone("123456789123453"));
        Contact contactThree = new Contact("Claudia", new Phone("1234567891"), "claudia@gmail.com");
        Contact contactFour = new Contact("Celia", "celia@gmail.com");

        System.out.println(contactOne);
        System.out.println(contactTwo);
        System.out.println(contactThree);
        System.out.println(contactFour);
    }
}
