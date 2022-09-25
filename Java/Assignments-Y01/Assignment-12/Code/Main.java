import static javax.swing.JOptionPane.*;
public class Main {

    public static void main(String[] args) {
        CovidStatsUI covidStatsUI = new CovidStatsUI();

        String[] menuItems = {"Add a COVID-19 entry", "List all COVID-19 entries in the register", "Find COVID-19 entry by date", "Find all entries after date", "Show the total deaths for a country", "Exit"};
        final int ADD_COVID_ENTRY_TO_REGISTER = 0;
        final int LIST_ALL_COVID_ENTRIES = 1;
        final int FIND_COVID_ENTRY_BY_DATE = 2;
        final int FIND_COVID_ENTRY_AFTER_DATE = 3;
        final int CALCULATE_TOTAL_DEATHS = 4;
        final int EXIT = 5;

        int menuSelection = showOptionDialog(null, "COID-19 \nSelect", "Exam des 2020", YES_NO_OPTION, INFORMATION_MESSAGE, null, menuItems, menuItems[0]);
        while (menuSelection != EXIT) {
            switch (menuSelection) {
                case ADD_COVID_ENTRY_TO_REGISTER:
                    //TODO: Replace code below with you own code
                    System.out.println("TEST: You selected the ADD_COVID_ENTRY_TO_REGISTER");
                    break;
                case LIST_ALL_COVID_ENTRIES:
                    //TODO: Replace code below with you own code
                    System.out.println("TEST: You selected the LIST_ALL_COVID_ENTRIES");
                    break;
                case FIND_COVID_ENTRY_BY_DATE:
                    //TODO: Replace code below with you own code
                    System.out.println("TEST: You selected the FIND_COVID_ENTRY_BY_DATE");
                    break;
                case FIND_COVID_ENTRY_AFTER_DATE:
                    //TODO: Replace code below with you own code
                    System.out.println("TEST: You selected the FIND_COVID_ENTRY_AFTER_DATE");
                    break;
                case CALCULATE_TOTAL_DEATHS:
                    //TODO: Replace code below with you own code
                    System.out.println("TEST: You selected the CALCULATE_TOTAL_DEATHS");
                    break;
                default:
                    break;
            }
            menuSelection = showOptionDialog(null, "COID-19 \nSelect", "Exam des 2020", YES_NO_OPTION, INFORMATION_MESSAGE, null, menuItems, menuItems[0]);
        }
    }
}
