
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * TODO: Fill in...
 *
 * @author Your Candidate number
 * @version 1.0
 */
class CovidStatsUI {
    //TODO: Add your fields here


    private static final String VERSION = "v1.0-SNAPSHOT";

    String[] menuItems
            = {
                "1. Add a COVID-19 entry",
                "2. List all COVID-19 entries in the register",
                "3. Find COVID-19 entry by date",
                "4. Find all entries after date",
                "5. Show the total deaths for a country"
            };

    // Constants defining the different menu options, to be used in the
    // switch-case.
    private static final int ADD_COVID_ENTRY_TO_REGISTER = 1;
    private static final int LIST_ALL_COVID_ENTRIES = 2;
    private static final int FIND_COVID_ENTRY_BY_DATE = 3;
    private static final int FIND_COVID_ENTRY_AFTER_DATE = 4;
    private static final int CALCULATE_TOTAL_DEATHS = 5;
    private static final int EXIT = 6;

    /**
     * Creates an instance of the CovidStatsUI User interface. An instance of
     * the CovidStatsRegister is created.
     */
    public CovidStatsUI() {
        // TODO: Add your own constructor code here
    }

    /**
     * Starts the application by showing the menu and retrieving input from the
     * user. Continues until the user decides to exit the application.
     */
    void start() {

        boolean quit = false;

        while (!quit) {
            int menuSelection = this.getMenuChoice();
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
                    System.out.println("TEST: You selected the ADD_COVID_ENTRY_TO_REGISTER");
                    break;

                case CALCULATE_TOTAL_DEATHS:
                    //TODO: Replace code below with you own code
                    System.out.println("TEST: You selected the CALCULATE_TOTAL_DEATHS");
                    break;

                case EXIT:
                    System.out.println("\nThank you for using the COVID-19 stats Application "
                            + VERSION + ". Bye!\n");
                    quit = true;
                    break;

                default:
                    System.out.println(
                            "\nERROR: Please provide a number between 1 and " + this.menuItems.length + "..\n");
            }
        }

    }

    /**
     * Displays the menu to the user, and waits for the users input. The user is
     * expected to input an integer between 1 and the max number of menu items..
     * The method returns the input from the user. If the input from the user is
     * invalid, 0 is returned.
     *
     * @return the menu number (between 1 and max menu item number) provided by
     *         the user.
     */
    private int getMenuChoice() {
        int menuSelection = 0;

        System.out.println("\n**** COVID-19 Stats Tool " + VERSION + " ****\n");
        for (String menuItem : menuItems) {
            System.out.println(menuItem);
        }
        int maxMenuItemNumber = menuItems.length + 1;
        System.out.println(maxMenuItemNumber + ". Exit\n");
        System.out.println("Please choose menu item (1-" + maxMenuItemNumber + "): ");

        Scanner reader = new Scanner(System.in);
        if (reader.hasNextInt()) {
            menuSelection = reader.nextInt();
        } else {
            System.out.println("You must enter a number, not text");
        }
        return menuSelection;
    }

    /**
     * The main start method of the application.
     *
     * @param args Commandline arguments as an array of String
     */
    public static void main(String[] args) {
        CovidStatsUI covidStatsUI = new CovidStatsUI();
        covidStatsUI.start();
    }



}
