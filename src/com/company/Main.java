package com.company;

import java.io.IOException;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in); //create a scanner in Main
    static ChampionshipManager Manager = new Formula1ChampionshipManager(); //get formula1Championship data

    public static void main(String[] args) throws ParseException, IOException {

        Formula1ChampionshipManager obj = new Formula1ChampionshipManager();

        obj.loadData();

        Manager.loadData(); //load file save data

        System.out.println("***********************************************************");
        System.out.println("    Welcome to Formula 1 Championship Management System    ");
        System.out.println("***********************************************************");

        System.out.println("");


        mainMenu:
        //loop console menu infinity
        while (true) {
            System.out.println("Press 1 to Add a Driver to Championship");
            System.out.println("Press 2 to Delete a Driver from Championship");
            System.out.println("Press 3 to Print Driver Statistics");
            System.out.println("Press 4 to Display Driver List");
            System.out.println("Press 5 to Display Formula 1 Driver Table");
            System.out.println("Press 6 to Add Race Details");
            System.out.println("Press 7 to Open GUI");
            System.out.println("Press 0 to Quit Application");
            System.out.println("");
            System.out.println("Enter your selection : ");
            int selection = 0;
            boolean flag = Boolean.TRUE;
            while (flag) {
                //check selection choice using try catch
                try {
                    selection = sc.nextInt();
                    //select user choice in consoleUI
                    switch (selection) {
                        case 1:
                            addDriver();
                            break;
                        case 2:
                            deleteDriver();
                            break;
                        case 3:
                            displayStatistics();
                            break;
                        case 4:
                            Manager.printDriverList();
                            break;
                        case 5:
                            Manager.displayFormula1DriverTable();
                            break;
                        case 6:
                            Manager.addRace();
                            break;
                        case 7:
                            Gui gui = new Gui(obj.get_data_to_gui(), obj);
                            gui.initComponents();
                            break;
                        case 0:
                            Manager.saveData(); //save user data in to file
                            System.out.println("Have a Nice Day..!");
                            break mainMenu;
                        default:
                            System.out.println("Wrong input! try again !!!"); //validation to user given wrong input


                    }
                } catch (InputMismatchException e) {
                    System.out.println("Enter your valid selection!!!..."); //validation to user given wrong input
                    System.out.println("Enter again (Y/N)");
                    String next = sc.next();
                    if (next.equalsIgnoreCase("y")) {

                    } else {
                        break; //close application
                    }
                }
                flag = false;
            }
        }

    }


    private static void displayStatistics() {
        System.out.println("Enter Driver Name to Display Statistics : ");
        String name = sc.next();
        Manager.displayStatistics(name);
        System.out.println("");
    }

    private static void addDriver() {
        //Formula 1 driver create object
        Formula1Driver formula1Driver = new Formula1Driver();
        //get user data
        System.out.println("Enter Driver Name : ");
        String name = sc.next();
        //set user data
        formula1Driver.setName(name);
        //get user data
        System.out.println("Enter Driver Team : ");
        String team = sc.next();
        //set user data
        formula1Driver.setTeam(team);
        //get user data
        System.out.println("Enter Driver Location : ");
        String location = sc.next();
        //set user data
        formula1Driver.setLocation(location);

        Manager.addDriver(formula1Driver);
    }

    private static void deleteDriver() {
        //get user data
        System.out.println("Enter Driver Name to Delete : ");
        String name = sc.next();
        //get user data
        System.out.println("Enter Driver Team to Delete : ");
        String team = sc.next();

        Manager.deleteDriver(name, team);
    }
}
