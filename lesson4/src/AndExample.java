public class AndExample {
    public static void main(String[] args) {
        String switch1 = "ЗАКРЫТ";
        String switch2 = "ОТКРЫТ";

        //OFF - кран открыт
        //ON - кран закрыт

        if (switch1.equals("ОТКРЫТ") && switch2.equals("ОТКРЫТ")) {
            System.out.println("Вода течет");
        } else {
            System.out.println("Вода не течет");
        }
    }
}
