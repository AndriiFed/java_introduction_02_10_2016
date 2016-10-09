public class TwoSwitchesExample {
    public static void main(String[] args) {

        //В комнате 2 выключателя
        //если хотя бы один включен, то свет горит

        String switch1 = "ВКЛЮЧЕН";
        String switch2 = "ВЫКЛЮЧЕН";

        if (switch1.equals("ВКЛЮЧЕН") || switch2.equals("ВКЛЮЧЕН")) {
            System.out.println("Свет горит");
        } else {
            System.out.println("Свет не горит");
        }
    }
}
