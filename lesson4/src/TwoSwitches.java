public class TwoSwitches {
    public static void main(String[] args) {
        String switch1 = "ВКЛЮЧЕН";
        String switch2 = "ВЫКЛЮЧЕН";

        if (switch1.equals("ВКЛЮЧЕН") && switch2.equals("ВКЛЮЧЕН")) {
            System.out.println("Горит 2 лампы");
        } else if (switch1.equals("ВЫКЛЮЧЕН") && switch2.equals("ВЫКЛЮЧЕН")) {
            System.out.println("Свет не горит");
        } else {
            System.out.println("Горит 1 лампа");
        }
    }
}
