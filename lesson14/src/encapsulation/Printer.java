package encapsulation;

public class Printer {

    private String model;
    private PrinterColor color;
    private boolean powerOn; //включен ли принтер

    public void setModel(String newModel) {
        model = newModel;
    }

    public void switchOn() {
        powerOn = true;
    }

    public void setColor(PrinterColor newColor) {
        color = newColor;
    }

    private boolean isPowerOn() {
        return powerOn;
    }

    public void info() {
        System.out.println(model + " " + color);
    }

    public String getType() {
        if (color == PrinterColor.BLACK) {
            return "Принтер черный";
        }

        if (color == PrinterColor.COLORFUL) {
            return "Принтер цветной";
        }

        if (color == PrinterColor.NONE) {
            return "Закончилась краска";
        }

        return "Неизвестный тип";
    }

    public String getTypeWithSwitch() {
        String type;
        switch (color) {
            case BLACK:
                type = "Принтер черный";
                break;
            case COLORFUL:
                type = "Принтер цветной";
                break;
            case NONE:
                type = "Закончилась краска";
                break;
            default:
                type = "Неизвестный тип";
        }

        return type;
    }

    public void printText(String someText) {
        if (powerOn) {
            System.out.println(someText);
        } else {
            System.out.println("Принтер выключен");
        }
    }

}
