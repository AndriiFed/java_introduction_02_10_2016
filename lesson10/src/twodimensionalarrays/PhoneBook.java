package twodimensionalarrays;

public class PhoneBook {
    public static void main(String[] args) {

        final int size = 3;

        String[][] phones = {
                {"John", "Sam", "Dean"},
                {"097-342-31-34", "068-234-23-12", "095-345-12-56"},
                {"Odessa", "Kyiv", "Lviv"}
        };

        String phone = getPhoneByName(phones, "Dean", size);

        System.out.println(phone);
    }

    private static String getPhoneByName(String[][] phones, String name, int size) {
        for (int i = 0; i < size; i++) {
            if (phones[0][i].equals(name)) {
                return phones[1][i] + " - " + phones[2][i];
            }
        }

        return "Такого человека нет";
    }
}
