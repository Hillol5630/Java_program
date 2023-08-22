
    import java.util.Scanner;

    public class monthday {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the name of the month: ");
            String monthName = scanner.nextLine().toLowerCase();

            int days = -1;

            if (monthName.equals("january") || monthName.equals("march") || monthName.equals("may") ||
                    monthName.equals("july") || monthName.equals("august") || monthName.equals("october") ||
                    monthName.equals("december")) {
                days = 31;
            } else if (monthName.equals("april") || monthName.equals("june") || monthName.equals("september") ||
                    monthName.equals("november")) {
                days = 30;
            } else if (monthName.equals("february")) {
                days = 28;
            }

            if (days != -1) {
                System.out.println("Total days in " + monthName + ": " + days);
            } else {
                System.out.println("Invalid month name.");
            }

            scanner.close();
        }
    }

