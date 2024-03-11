public class Main {
    public static void main(String[] args) {

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2: case 3:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Value was not 1 or 2");
        }
        String month = "APRIL";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");

    }
    public static String getQuarter (String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            default -> "bad";
        };
    }
}
