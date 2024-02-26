package com.company;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Formula1ChampionshipManager implements ChampionshipManager {

    //create get data two array lists
    private final ArrayList<PlayRace> races = new ArrayList<>();
    private final ArrayList<Formula1Driver> championship = new ArrayList<>();

    public Formula1ChampionshipManager(){

    }

    public String[][] get_data_to_gui(){
        String data[][] = new String[championship.size()][8];
        for (int i = 0; i < championship.size(); i++){
            data[i][0] = championship.get(i).getName();
            data[i][1] = championship.get(i).getLocation();
            data[i][2] = championship.get(i).getTeam();
            data[i][3] = championship.get(i).getNumberOfFirstPositions()+"";
            data[i][4] = championship.get(i).getNumberOfSecondPositions()+"";
            data[i][5] = championship.get(i).getNumberOfThirdPositions()+"";
            data[i][6] = championship.get(i).getNumberOfPoints()+"";
            data[i][7] = championship.get(i).getNumberOfRacesParticipated()+"";
        }
        return data;
    }

    @Override
    //formula 1 driver add method
    public void addDriver(Formula1Driver formula1Driver) {
        //check driver already added or not
        if (championship.contains(formula1Driver)){
            System.out.println("Driver already added !!!");
        }else {
            //add driver in to Championship
            championship.add(formula1Driver);
            System.out.println(formula1Driver.getName() + " Driver Added in Championship..!");
        }


    }

    @Override
    //formula 1 driver delete method
    public void deleteDriver(String name, String team) {
        //check club list already empty
        if (championship.isEmpty()){
            System.out.println("Empty driver list !!!");
            return;
        }

        boolean bool = false;
        //check driver championship list and delete
        for (Formula1Driver formula1Driver : championship){
            //driver name and team check before delete
            if (formula1Driver.getName().equalsIgnoreCase(name)){
                if (formula1Driver.getTeam().equalsIgnoreCase(team)){
                        //removing driver in list
                        championship.remove(formula1Driver);
                        System.out.println("Delete successfully "+ name);
                        bool = true;
                        break;
                    }
                }
            }
            //if check name and team match
            if (!bool){
                System.out.println("You entered details are not Match !!!");
            }
        }


    @Override
    //print formula 1 driver list method
    public void printDriverList() {
        //checking list is empty
        if (championship.isEmpty()){
            System.out.println("Empty Drivers in List !!!");
            return;
        }
        //print driver list using loop
        System.out.println("++ Driver List in Championship ++");
        for (Formula1Driver formula1Driver: championship){
            System.out.println(formula1Driver);
        }
        System.out.println("");

    }


    @Override
    public void addRace() {
        //create scanner get user details
        Scanner sc = new Scanner(System.in);
        //check list is empty or not
        if (championship.isEmpty()){
            System.out.println("Empty drivers to Add race details !!!");
            return;
        }
        //get race play date from user
        System.out.println("Enter Race Play Date(yyyy-MM-dd): ");
        String day = sc.next();
        Date date;
        //try catch to check date format
        try {
            //set date format include
            date = new SimpleDateFormat("yyyy-MM-dd").parse(day);

        //catch to check need to user input format date
        }catch (ParseException e){
            System.out.println("Enter date format yyyy-MM-dd");
            return;
        }

        System.out.println("Enter the First driver :");
        String firstDriver = sc.next(); //get user data

        //check user input drivers
        boolean bool = Boolean.FALSE;
        for (Formula1Driver formula1Driver : championship){
            //check if user input driver in championship or not
            if (formula1Driver.getName().equalsIgnoreCase(firstDriver)){
                //add number of played races
                formula1Driver.setNumberOfRacesParticipated(formula1Driver.getNumberOfRacesParticipated()+1);
                bool = true;
            }
        }
        //if driver is not in championship
        if (!bool){
            System.out.println("Your driver not matching "+ firstDriver+ " in the championship!!!...");
            return;
        }

        System.out.println("Enter the Second driver :");
        String secondDriver = sc.next(); //get user data

        //check user input drivers
        boolean bool1 = Boolean.FALSE;
        for (Formula1Driver formula1Driver : championship){
            //check if user input driver in championship or not
            if (formula1Driver.getName().equalsIgnoreCase(secondDriver)){
                //add number of played races
                formula1Driver.setNumberOfRacesParticipated(formula1Driver.getNumberOfRacesParticipated()+1);
                bool1 = true;
            }
        }
        //if driver is not in championship
        if (!bool1){
            System.out.println("Your driver not matching "+ secondDriver+ " in the championship!!!...");
            return;
        }

        System.out.println("Enter the Third driver :");
        String thirdDriver = sc.next(); //get user data

        //check user input drivers
        boolean bool2 = Boolean.FALSE;
        for (Formula1Driver formula1Driver : championship){
            //check if user input driver in championship or not
            if (formula1Driver.getName().equalsIgnoreCase(thirdDriver)){
                //add number of played races
                formula1Driver.setNumberOfRacesParticipated(formula1Driver.getNumberOfRacesParticipated()+1);
                bool2 = true;
            }
        }
        //if driver is not in championship
        if (!bool2){
            System.out.println("Your driver not matching "+ thirdDriver+ " in the championship!!!...");
            return;
        }

        System.out.println("Enter the Forth driver :");
        String forthDriver = sc.next(); //get user data

        //check user input drivers
        boolean bool3 = Boolean.FALSE;
        for (Formula1Driver formula1Driver : championship){
            //check if user input driver in championship or not
            if (formula1Driver.getName().equalsIgnoreCase(forthDriver)){
                //add number of played races
                formula1Driver.setNumberOfRacesParticipated(formula1Driver.getNumberOfRacesParticipated()+1);
                bool3 = true;
            }
        }
        //if driver is not in championship
        if (!bool3){
            System.out.println("Your driver not matching "+ forthDriver+ " in the championship!!!...");
            return;
        }

        System.out.println("Enter the Fifth driver :");
        String fifthDriver = sc.next(); //get user data

        //check user input drivers
        boolean bool4 = Boolean.FALSE;
        for (Formula1Driver formula1Driver : championship){
            //check if user input driver in championship or not
            if (formula1Driver.getName().equalsIgnoreCase(fifthDriver)){
                //add number of played races
                formula1Driver.setNumberOfRacesParticipated(formula1Driver.getNumberOfRacesParticipated()+1);
                bool4 = true;
            }
        }
        //if driver is not in championship
        if (!bool4){
            System.out.println("Your driver not matching "+ fifthDriver+ " in the championship!!!...");
            return;
        }

        System.out.println("Enter the Sixth driver :");
        String sixthDriver = sc.next(); //get user data

        //check user input drivers
        boolean bool5 = Boolean.FALSE;
        for (Formula1Driver formula1Driver : championship){
            //check if user input driver in championship or not
            if (formula1Driver.getName().equalsIgnoreCase(sixthDriver)){
                //add number of played races
                formula1Driver.setNumberOfRacesParticipated(formula1Driver.getNumberOfRacesParticipated()+1);
                bool5 = true;
            }
        }
        //if driver is not in championship
        if (!bool5){
            System.out.println("Your driver not matching "+ sixthDriver+ " in the championship!!!...");
            return;
        }

        System.out.println("Enter the Seventh driver :");
        String seventhDriver = sc.next(); //get user data

        //check user input drivers
        boolean bool6 = Boolean.FALSE;
        for (Formula1Driver formula1Driver : championship){
            //check if user input driver in championship or not
            if (formula1Driver.getName().equalsIgnoreCase(seventhDriver)){
                //add number of played races
                formula1Driver.setNumberOfRacesParticipated(formula1Driver.getNumberOfRacesParticipated()+1);
                bool6 = true;
            }
        }
        //if driver is not in championship
        if (!bool6){
            System.out.println("Your driver not matching "+ seventhDriver+ " in the championship!!!...");
            return;
        }

        System.out.println("Enter the Eighth driver :");
        String eighthDriver = sc.next(); //get user data

        //check user input drivers
        boolean bool7 = Boolean.FALSE;
        for (Formula1Driver formula1Driver : championship){
            //check if user input driver in championship or not
            if (formula1Driver.getName().equalsIgnoreCase(eighthDriver)){
                //add number of played races
                formula1Driver.setNumberOfRacesParticipated(formula1Driver.getNumberOfRacesParticipated()+1);
                bool7 = true;
            }
        }
        //if driver is not in championship
        if (!bool7){
            System.out.println("Your driver not matching "+ eighthDriver+ " in the championship!!!...");
            return;
        }

        System.out.println("Enter the Ninth driver :");
        String ninthDriver = sc.next(); //get user data

        //check user input drivers
        boolean bool8 = Boolean.FALSE;
        for (Formula1Driver formula1Driver : championship){
            //check if user input driver in championship or not
            if (formula1Driver.getName().equalsIgnoreCase(ninthDriver)){
                //add number of played races
                formula1Driver.setNumberOfRacesParticipated(formula1Driver.getNumberOfRacesParticipated()+1);
                bool8 = true;
            }
        }
        //if driver is not in championship
        if (!bool8){
            System.out.println("Your driver not matching "+ ninthDriver+ " in the championship!!!...");
            return;
        }

        System.out.println("Enter the Tenth driver :");
        String tenthDriver = sc.next(); //get user data

        //check user input drivers
        boolean bool9 = Boolean.FALSE;
        for (Formula1Driver formula1Driver : championship){
            //check if user input driver in championship or not
            if (formula1Driver.getName().equalsIgnoreCase(tenthDriver)){
                //add number of played races
                formula1Driver.setNumberOfRacesParticipated(formula1Driver.getNumberOfRacesParticipated()+1);
                bool9 = true;
            }
        }
        //if driver is not in championship
        if (!bool9){
            System.out.println("Your driver not matching "+ tenthDriver+ " in the championship!!!...");
            return;
        }

        int firstDriverPosition = 0; //get user race details
        int secondDriverPosition = 0;
        int thirdDriverPosition = 0;
        int forthDriverPosition = 0;
        int fifthDriverPosition = 0;
        int sixthDriverPosition = 0;
        int seventhDriverPosition = 0;
        int eighthDriverPosition = 0;
        int ninthDriverPosition = 0;
        int tenthDriverPosition = 0;

        //set attribute for race
        PlayRace playRace = new PlayRace(firstDriver, secondDriver, thirdDriver, forthDriver, fifthDriver, sixthDriver, seventhDriver, eighthDriver, ninthDriver, tenthDriver, firstDriverPosition, secondDriverPosition, thirdDriverPosition, forthDriverPosition, fifthDriverPosition, sixthDriverPosition, seventhDriverPosition, eighthDriverPosition, ninthDriverPosition, tenthDriverPosition, date);
        //add race in the championship
        races.add(playRace);

        System.out.println("Enter First driver Position : ");
        try {
            //check user input integer or not
            firstDriverPosition = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Please enter number here !!!");
            return;
        }
            for (Formula1Driver formula1Driver: championship){
                if (formula1Driver.getName().equalsIgnoreCase(playRace.getFirstDriver())){
                    if (firstDriverPosition < 1 || firstDriverPosition > 10){
                        System.out.println("Invalid Position");
                    }else {
                        switch (firstDriverPosition){
                            case 1:
                                formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 25);
                                formula1Driver.setNumberOfFirstPositions(formula1Driver.getNumberOfFirstPositions() + 1);
                                break;
                            case 2:
                                formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 18);
                                formula1Driver.setNumberOfSecondPositions(formula1Driver.getNumberOfSecondPositions() + 1);
                                break;
                            case 3:
                                formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 15);
                                formula1Driver.setNumberOfThirdPositions(formula1Driver.getNumberOfThirdPositions() + 1);
                                break;
                            case 4:
                                formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 12);
                                formula1Driver.setNumberOfForthPositions(formula1Driver.getNumberOfForthPositions() + 1);
                                break;
                            case 5:
                                formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 10);
                                formula1Driver.setNumberOfFifthPositions(formula1Driver.getNumberOfFifthPositions() + 1);
                                break;
                            case 6:
                                formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 8);
                                formula1Driver.setNumberOfSixthPositions(formula1Driver.getNumberOfSixthPositions() + 1);
                                break;
                            case 7:
                                formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 6);
                                formula1Driver.setNumberOfSeventhPositions(formula1Driver.getNumberOfSeventhPositions() + 1);
                                break;
                            case 8:
                                formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 4);
                                formula1Driver.setNumberOfEighthPositions(formula1Driver.getNumberOfEighthPositions() + 1);
                                break;
                            case 9:
                                formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 2);
                                formula1Driver.setNumberOfNinthPositions(formula1Driver.getNumberOfNinthPositions() + 1);
                                break;
                            case 10:
                                formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 1);
                                formula1Driver.setNumberOfTenthPositions(formula1Driver.getNumberOfTenthPositions() + 1);
                                break;
                            default:
                                break;

                        }
                    }
                }
            }

        System.out.println("Enter Second driver Position : "); //get user race details
        //check user input integer or not
        try {
            secondDriverPosition = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Please enter number here !!!");
            return;
        }
        for (Formula1Driver formula1Driver: championship){
            if (formula1Driver.getName().equalsIgnoreCase(playRace.getSecondDriver())){
                if (secondDriverPosition < 1 || secondDriverPosition > 10){
                    System.out.println("Invalid Position");
                }else {
                    switch (secondDriverPosition){
                        case 1:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 25);
                            formula1Driver.setNumberOfFirstPositions(formula1Driver.getNumberOfFirstPositions() + 1);
                            break;
                        case 2:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 18);
                            formula1Driver.setNumberOfSecondPositions(formula1Driver.getNumberOfSecondPositions() + 1);
                            break;
                        case 3:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 15);
                            formula1Driver.setNumberOfThirdPositions(formula1Driver.getNumberOfThirdPositions() + 1);
                            break;
                        case 4:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 12);
                            formula1Driver.setNumberOfForthPositions(formula1Driver.getNumberOfForthPositions() + 1);
                            break;
                        case 5:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 10);
                            formula1Driver.setNumberOfFifthPositions(formula1Driver.getNumberOfFifthPositions() + 1);
                            break;
                        case 6:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 8);
                            formula1Driver.setNumberOfSixthPositions(formula1Driver.getNumberOfSixthPositions() + 1);
                            break;
                        case 7:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 6);
                            formula1Driver.setNumberOfSeventhPositions(formula1Driver.getNumberOfSeventhPositions() + 1);
                            break;
                        case 8:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 4);
                            formula1Driver.setNumberOfEighthPositions(formula1Driver.getNumberOfEighthPositions() + 1);
                            break;
                        case 9:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 2);
                            formula1Driver.setNumberOfNinthPositions(formula1Driver.getNumberOfNinthPositions() + 1);
                            break;
                        case 10:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 1);
                            formula1Driver.setNumberOfTenthPositions(formula1Driver.getNumberOfTenthPositions() + 1);
                            break;
                        default:
                            break;

                    }
                }
            }
        }

        System.out.println("Enter Third driver Position : ");
        try {
            //check user input integer or not
            thirdDriverPosition = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Please enter number here !!!");
            return;
        }
        for (Formula1Driver formula1Driver: championship){
            if (formula1Driver.getName().equalsIgnoreCase(playRace.getThirdDriver())){
                if (thirdDriverPosition < 1 || thirdDriverPosition > 10){
                    System.out.println("Invalid Position");
                }else {
                    switch (thirdDriverPosition){
                        case 1:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 25);
                            formula1Driver.setNumberOfFirstPositions(formula1Driver.getNumberOfFirstPositions() + 1);
                            break;
                        case 2:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 18);
                            formula1Driver.setNumberOfSecondPositions(formula1Driver.getNumberOfSecondPositions() + 1);
                            break;
                        case 3:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 15);
                            formula1Driver.setNumberOfThirdPositions(formula1Driver.getNumberOfThirdPositions() + 1);
                            break;
                        case 4:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 12);
                            formula1Driver.setNumberOfForthPositions(formula1Driver.getNumberOfForthPositions() + 1);
                            break;
                        case 5:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 10);
                            formula1Driver.setNumberOfFifthPositions(formula1Driver.getNumberOfFifthPositions() + 1);
                            break;
                        case 6:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 8);
                            formula1Driver.setNumberOfSixthPositions(formula1Driver.getNumberOfSixthPositions() + 1);
                            break;
                        case 7:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 6);
                            formula1Driver.setNumberOfSeventhPositions(formula1Driver.getNumberOfSeventhPositions() + 1);
                            break;
                        case 8:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 4);
                            formula1Driver.setNumberOfEighthPositions(formula1Driver.getNumberOfEighthPositions() + 1);
                            break;
                        case 9:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 2);
                            formula1Driver.setNumberOfNinthPositions(formula1Driver.getNumberOfNinthPositions() + 1);
                            break;
                        case 10:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 1);
                            formula1Driver.setNumberOfTenthPositions(formula1Driver.getNumberOfTenthPositions() + 1);
                            break;
                        default:
                            break;

                    }
                }
            }
        }
        System.out.println("Enter Forth driver Position : "); //get user race details
        //check user input integer or not
        try {
            forthDriverPosition = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Please enter number here !!!");
            return;
        }
        for (Formula1Driver formula1Driver: championship){
            if (formula1Driver.getName().equalsIgnoreCase(playRace.getForthDriver())){
                if (forthDriverPosition < 1 || forthDriverPosition > 10){
                    System.out.println("Invalid Position");
                }else {
                    switch (forthDriverPosition){
                        case 1:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 25);
                            formula1Driver.setNumberOfFirstPositions(formula1Driver.getNumberOfFirstPositions() + 1);
                            break;
                        case 2:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 18);
                            formula1Driver.setNumberOfSecondPositions(formula1Driver.getNumberOfSecondPositions() + 1);
                            break;
                        case 3:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 15);
                            formula1Driver.setNumberOfThirdPositions(formula1Driver.getNumberOfThirdPositions() + 1);
                            break;
                        case 4:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 12);
                            formula1Driver.setNumberOfForthPositions(formula1Driver.getNumberOfForthPositions() + 1);
                            break;
                        case 5:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 10);
                            formula1Driver.setNumberOfFifthPositions(formula1Driver.getNumberOfFifthPositions() + 1);
                            break;
                        case 6:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 8);
                            formula1Driver.setNumberOfSixthPositions(formula1Driver.getNumberOfSixthPositions() + 1);
                            break;
                        case 7:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 6);
                            formula1Driver.setNumberOfSeventhPositions(formula1Driver.getNumberOfSeventhPositions() + 1);
                            break;
                        case 8:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 4);
                            formula1Driver.setNumberOfEighthPositions(formula1Driver.getNumberOfEighthPositions() + 1);
                            break;
                        case 9:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 2);
                            formula1Driver.setNumberOfNinthPositions(formula1Driver.getNumberOfNinthPositions() + 1);
                            break;
                        case 10:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 1);
                            formula1Driver.setNumberOfTenthPositions(formula1Driver.getNumberOfTenthPositions() + 1);
                            break;
                        default:
                            break;

                    }
                }
            }
        }

        System.out.println("Enter Fifth driver Position : ");
        try {
            //check user input integer or not
            fifthDriverPosition = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Please enter number here !!!");
            return;
        }
        for (Formula1Driver formula1Driver: championship){
            if (formula1Driver.getName().equalsIgnoreCase(playRace.getFifthDriver())){
                if (fifthDriverPosition < 1 || fifthDriverPosition > 10){
                    System.out.println("Invalid Position");
                }else {
                    switch (fifthDriverPosition){
                        case 1:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 25);
                            formula1Driver.setNumberOfFirstPositions(formula1Driver.getNumberOfFirstPositions() + 1);
                            break;
                        case 2:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 18);
                            formula1Driver.setNumberOfSecondPositions(formula1Driver.getNumberOfSecondPositions() + 1);
                            break;
                        case 3:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 15);
                            formula1Driver.setNumberOfThirdPositions(formula1Driver.getNumberOfThirdPositions() + 1);
                            break;
                        case 4:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 12);
                            formula1Driver.setNumberOfForthPositions(formula1Driver.getNumberOfForthPositions() + 1);
                            break;
                        case 5:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 10);
                            formula1Driver.setNumberOfFifthPositions(formula1Driver.getNumberOfFifthPositions() + 1);
                            break;
                        case 6:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 8);
                            formula1Driver.setNumberOfSixthPositions(formula1Driver.getNumberOfSixthPositions() + 1);
                            break;
                        case 7:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 6);
                            formula1Driver.setNumberOfSeventhPositions(formula1Driver.getNumberOfSeventhPositions() + 1);
                            break;
                        case 8:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 4);
                            formula1Driver.setNumberOfEighthPositions(formula1Driver.getNumberOfEighthPositions() + 1);
                            break;
                        case 9:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 2);
                            formula1Driver.setNumberOfNinthPositions(formula1Driver.getNumberOfNinthPositions() + 1);
                            break;
                        case 10:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 1);
                            formula1Driver.setNumberOfTenthPositions(formula1Driver.getNumberOfTenthPositions() + 1);
                            break;
                        default:
                            break;

                    }
                }
            }
        }
        System.out.println("Enter Sixth driver Position : "); //get user race details
        //check user input integer or not
        try {
            sixthDriverPosition = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Please enter number here !!!");
            return;
        }
        for (Formula1Driver formula1Driver: championship){
            if (formula1Driver.getName().equalsIgnoreCase(playRace.getSixthDriver())){
                if (sixthDriverPosition < 1 || sixthDriverPosition > 10){
                    System.out.println("Invalid Position");
                }else {
                    switch (sixthDriverPosition){
                        case 1:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 25);
                            formula1Driver.setNumberOfFirstPositions(formula1Driver.getNumberOfFirstPositions() + 1);
                            break;
                        case 2:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 18);
                            formula1Driver.setNumberOfSecondPositions(formula1Driver.getNumberOfSecondPositions() + 1);
                            break;
                        case 3:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 15);
                            formula1Driver.setNumberOfThirdPositions(formula1Driver.getNumberOfThirdPositions() + 1);
                            break;
                        case 4:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 12);
                            formula1Driver.setNumberOfForthPositions(formula1Driver.getNumberOfForthPositions() + 1);
                            break;
                        case 5:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 10);
                            formula1Driver.setNumberOfFifthPositions(formula1Driver.getNumberOfFifthPositions() + 1);
                            break;
                        case 6:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 8);
                            formula1Driver.setNumberOfSixthPositions(formula1Driver.getNumberOfSixthPositions() + 1);
                            break;
                        case 7:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 6);
                            formula1Driver.setNumberOfSeventhPositions(formula1Driver.getNumberOfSeventhPositions() + 1);
                            break;
                        case 8:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 4);
                            formula1Driver.setNumberOfEighthPositions(formula1Driver.getNumberOfEighthPositions() + 1);
                            break;
                        case 9:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 2);
                            formula1Driver.setNumberOfNinthPositions(formula1Driver.getNumberOfNinthPositions() + 1);
                            break;
                        case 10:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 1);
                            formula1Driver.setNumberOfTenthPositions(formula1Driver.getNumberOfTenthPositions() + 1);
                            break;
                        default:
                            break;

                    }
                }
            }
        }

        System.out.println("Enter Seventh driver Position : ");
        try {
            //check user input integer or not
            seventhDriverPosition = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Please enter number here !!!");
            return;
        }
        for (Formula1Driver formula1Driver: championship){
            if (formula1Driver.getName().equalsIgnoreCase(playRace.getSeventhDriver())){
                if (seventhDriverPosition < 1 || seventhDriverPosition > 10){
                    System.out.println("Invalid Position");
                }else {
                    switch (seventhDriverPosition){
                        case 1:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 25);
                            formula1Driver.setNumberOfFirstPositions(formula1Driver.getNumberOfFirstPositions() + 1);
                            break;
                        case 2:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 18);
                            formula1Driver.setNumberOfSecondPositions(formula1Driver.getNumberOfSecondPositions() + 1);
                            break;
                        case 3:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 15);
                            formula1Driver.setNumberOfThirdPositions(formula1Driver.getNumberOfThirdPositions() + 1);
                            break;
                        case 4:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 12);
                            formula1Driver.setNumberOfForthPositions(formula1Driver.getNumberOfForthPositions() + 1);
                            break;
                        case 5:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 10);
                            formula1Driver.setNumberOfFifthPositions(formula1Driver.getNumberOfFifthPositions() + 1);
                            break;
                        case 6:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 8);
                            formula1Driver.setNumberOfSixthPositions(formula1Driver.getNumberOfSixthPositions() + 1);
                            break;
                        case 7:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 6);
                            formula1Driver.setNumberOfSeventhPositions(formula1Driver.getNumberOfSeventhPositions() + 1);
                            break;
                        case 8:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 4);
                            formula1Driver.setNumberOfEighthPositions(formula1Driver.getNumberOfEighthPositions() + 1);
                            break;
                        case 9:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 2);
                            formula1Driver.setNumberOfNinthPositions(formula1Driver.getNumberOfNinthPositions() + 1);
                            break;
                        case 10:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 1);
                            formula1Driver.setNumberOfTenthPositions(formula1Driver.getNumberOfTenthPositions() + 1);
                            break;
                        default:
                            break;

                    }
                }
            }
        }
        System.out.println("Enter Eighth driver Position : "); //get user race details
        //check user input integer or not
        try {
            eighthDriverPosition = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Please enter number here !!!");
            return;
        }
        for (Formula1Driver formula1Driver: championship){
            if (formula1Driver.getName().equalsIgnoreCase(playRace.getEighthDriver())){
                if (eighthDriverPosition < 1 || eighthDriverPosition > 10){
                    System.out.println("Invalid Position");
                }else {
                    switch (eighthDriverPosition){
                        case 1:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 25);
                            formula1Driver.setNumberOfFirstPositions(formula1Driver.getNumberOfFirstPositions() + 1);
                            break;
                        case 2:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 18);
                            formula1Driver.setNumberOfSecondPositions(formula1Driver.getNumberOfSecondPositions() + 1);
                            break;
                        case 3:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 15);
                            formula1Driver.setNumberOfThirdPositions(formula1Driver.getNumberOfThirdPositions() + 1);
                            break;
                        case 4:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 12);
                            formula1Driver.setNumberOfForthPositions(formula1Driver.getNumberOfForthPositions() + 1);
                            break;
                        case 5:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 10);
                            formula1Driver.setNumberOfFifthPositions(formula1Driver.getNumberOfFifthPositions() + 1);
                            break;
                        case 6:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 8);
                            formula1Driver.setNumberOfSixthPositions(formula1Driver.getNumberOfSixthPositions() + 1);
                            break;
                        case 7:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 6);
                            formula1Driver.setNumberOfSeventhPositions(formula1Driver.getNumberOfSeventhPositions() + 1);
                            break;
                        case 8:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 4);
                            formula1Driver.setNumberOfEighthPositions(formula1Driver.getNumberOfEighthPositions() + 1);
                            break;
                        case 9:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 2);
                            formula1Driver.setNumberOfNinthPositions(formula1Driver.getNumberOfNinthPositions() + 1);
                            break;
                        case 10:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 1);
                            formula1Driver.setNumberOfTenthPositions(formula1Driver.getNumberOfTenthPositions() + 1);
                            break;
                        default:
                            break;

                    }
                }
            }
        }

        System.out.println("Enter Ninth driver Position : ");
        try {
            //check user input integer or not
            ninthDriverPosition = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Please enter number here !!!");
            return;
        }
        for (Formula1Driver formula1Driver: championship){
            if (formula1Driver.getName().equalsIgnoreCase(playRace.getNinthDriver())){
                if (ninthDriverPosition < 1 || ninthDriverPosition > 10){
                    System.out.println("Invalid Position");
                }else {
                    switch (ninthDriverPosition){
                        case 1:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 25);
                            formula1Driver.setNumberOfFirstPositions(formula1Driver.getNumberOfFirstPositions() + 1);
                            break;
                        case 2:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 18);
                            formula1Driver.setNumberOfSecondPositions(formula1Driver.getNumberOfSecondPositions() + 1);
                            break;
                        case 3:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 15);
                            formula1Driver.setNumberOfThirdPositions(formula1Driver.getNumberOfThirdPositions() + 1);
                            break;
                        case 4:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 12);
                            formula1Driver.setNumberOfForthPositions(formula1Driver.getNumberOfForthPositions() + 1);
                            break;
                        case 5:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 10);
                            formula1Driver.setNumberOfFifthPositions(formula1Driver.getNumberOfFifthPositions() + 1);
                            break;
                        case 6:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 8);
                            formula1Driver.setNumberOfSixthPositions(formula1Driver.getNumberOfSixthPositions() + 1);
                            break;
                        case 7:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 6);
                            formula1Driver.setNumberOfSeventhPositions(formula1Driver.getNumberOfSeventhPositions() + 1);
                            break;
                        case 8:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 4);
                            formula1Driver.setNumberOfEighthPositions(formula1Driver.getNumberOfEighthPositions() + 1);
                            break;
                        case 9:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 2);
                            formula1Driver.setNumberOfNinthPositions(formula1Driver.getNumberOfNinthPositions() + 1);
                            break;
                        case 10:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 1);
                            formula1Driver.setNumberOfTenthPositions(formula1Driver.getNumberOfTenthPositions() + 1);
                            break;
                        default:
                            break;

                    }
                }
            }
        }
        System.out.println("Enter Tenth driver Position : "); //get user race details
        //check user input integer or not
        try {
            tenthDriverPosition = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Please enter number here !!!");
            return;
        }
        for (Formula1Driver formula1Driver: championship){
            if (formula1Driver.getName().equalsIgnoreCase(playRace.getTenthDriver())){
                if (tenthDriverPosition < 1 || tenthDriverPosition > 10){
                    System.out.println("Invalid Position");
                }else {
                    switch (tenthDriverPosition){
                        case 1:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 25);
                            formula1Driver.setNumberOfFirstPositions(formula1Driver.getNumberOfFirstPositions() + 1);
                            break;
                        case 2:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 18);
                            formula1Driver.setNumberOfSecondPositions(formula1Driver.getNumberOfSecondPositions() + 1);
                            break;
                        case 3:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 15);
                            formula1Driver.setNumberOfThirdPositions(formula1Driver.getNumberOfThirdPositions() + 1);
                            break;
                        case 4:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 12);
                            formula1Driver.setNumberOfForthPositions(formula1Driver.getNumberOfForthPositions() + 1);
                            break;
                        case 5:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 10);
                            formula1Driver.setNumberOfFifthPositions(formula1Driver.getNumberOfFifthPositions() + 1);
                            break;
                        case 6:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 8);
                            formula1Driver.setNumberOfSixthPositions(formula1Driver.getNumberOfSixthPositions() + 1);
                            break;
                        case 7:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 6);
                            formula1Driver.setNumberOfSeventhPositions(formula1Driver.getNumberOfSeventhPositions() + 1);
                            break;
                        case 8:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 4);
                            formula1Driver.setNumberOfEighthPositions(formula1Driver.getNumberOfEighthPositions() + 1);
                            break;
                        case 9:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 2);
                            formula1Driver.setNumberOfNinthPositions(formula1Driver.getNumberOfNinthPositions() + 1);
                            break;
                        case 10:
                            formula1Driver.setNumberOfPoints(formula1Driver.getNumberOfPoints() + 1);
                            formula1Driver.setNumberOfTenthPositions(formula1Driver.getNumberOfTenthPositions() + 1);
                            break;
                        default:
                            break;

                    }
                }
            }
        }


    }

    @Override
    public void displayStatistics(String name) {
        //check if list empty or not
        if (championship.isEmpty()){
            System.out.println("Empty Drivers to show Statistics !!!");
            return;
        }

        boolean bool = false;
        //check if driver in championship throughout list
        for (Formula1Driver formula1Driver : championship){
            //check if details match or not
            if (formula1Driver.getName().equals(name)){
                //display statistics
                System.out.println("Driver name:                 " + formula1Driver.getName());
                System.out.println("Driver team:                 " + formula1Driver.getTeam());
                System.out.println("Driver location:             " + formula1Driver.getLocation());
                System.out.println("Number of Races Played:      " + formula1Driver.getNumberOfRacesParticipated());
                System.out.println("Current number of Points:    " + formula1Driver.getNumberOfPoints());
                System.out.println("Number of first positions:   " + formula1Driver.getNumberOfFirstPositions());
                System.out.println("Number of second positions:  " + formula1Driver.getNumberOfSecondPositions());
                System.out.println("Number of third positions:   " + formula1Driver.getNumberOfThirdPositions());
                System.out.println("Number of forth positions:   " + formula1Driver.getNumberOfForthPositions());
                System.out.println("Number of fifth positions:   " + formula1Driver.getNumberOfFifthPositions());
                System.out.println("Number of sixth positions:   " + formula1Driver.getNumberOfSixthPositions());
                System.out.println("Number of seventh positions: " + formula1Driver.getNumberOfSeventhPositions());
                System.out.println("Number of eighth positions:  " + formula1Driver.getNumberOfEighthPositions());
                System.out.println("Number of ninth positions:   " + formula1Driver.getNumberOfNinthPositions());
                System.out.println("Number of tenth positions:   " + formula1Driver.getNumberOfTenthPositions());

                bool = true;
                break;
            }
        }
        //if details are not match
        if (!bool){
            System.out.println("No such driver in championship !!!");
        }

    }

    @Override
    //display championship table method
    public void displayFormula1DriverTable() {
        //check if list empty or not
        if (championship.isEmpty()){
            System.out.println("Empty Drivers to show Statistics !!!");
            return;
        }
        //set championship statistics list descending order
        championship.sort(Collections.reverseOrder());
        for (Formula1Driver formula1Driver: championship){
            //display championship table
            System.out.println(formula1Driver.getName() +
                    "|| Team: " + formula1Driver.getTeam()+
                    "|| Location: " + formula1Driver.getLocation()+
                    "|| Races played: " + formula1Driver.getNumberOfRacesParticipated()+
                    "|| First positions: " + formula1Driver.getNumberOfFirstPositions()+
                    "|| Second positions: " + formula1Driver.getNumberOfSecondPositions()+
                    "|| Third positions: " + formula1Driver.getNumberOfThirdPositions()+
                    "|| Points got: " + formula1Driver.getNumberOfPoints());
        }
        System.out.println("");

    }

    @Override
    //save user data method
    public void saveData() {
        try {
            //create fileOutPut stream to user save data in text file
            FileOutputStream fileOutputStream = new FileOutputStream("./DataDriver.txt");
            //create fileOutPut stream to user save data in text file
            FileOutputStream fileOutputStream1 = new FileOutputStream("./DataRace.txt");
            //create object in objectOutputStream
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            //create object in objectOutputStream
            ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(fileOutputStream1);
            //get objects in list
            for (Formula1Driver formula1Driver : championship){
                if (formula1Driver!= null){
                    //add object to files
                    objectOutputStream.writeObject(formula1Driver);
                }
            }
            //get object from list
            for (PlayRace playRace : races){
                if (playRace != null){
                    //adding object to files
                    objectOutputStream1.writeObject(playRace);
                }
            }
            System.out.println("Successfully!! data saved in the System");

            //close objectOutputStreams
            objectOutputStream.close();
            objectOutputStream1.close();
            //close fileOutputStreams
            fileOutputStream.close();
            fileOutputStream1.close();
            //flush objectOutputStream
            objectOutputStream.flush();
            objectOutputStream1.flush();

        }catch (FileNotFoundException e){
            //file is missing or not found
            System.out.println("File not Found");

        }catch (Exception e){
            //if any other mistakes
            System.out.println("Have some error");
        }

    }

    @Override
    //load user data method
    public void loadData() throws IOException {

        try {
            //create fileInputStream for league list
            FileInputStream fileInputStream = new FileInputStream("./DataDriver.txt");
            //creating fileInputStream access text file
            FileInputStream fileInputStream1 = new FileInputStream("./DataRace.txt");
            //creating objectInputStream for championship list
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            //creating objectInputStream for access text list
            ObjectInputStream objectInputStream1 = new ObjectInputStream(fileInputStream1);

            //infinite for loop
            for (;;){
                try {
                    //formula 1 driver object read
                    Formula1Driver formula1Driver = (Formula1Driver) objectInputStream.readObject();
                    //add formula 1 driver in list
                    championship.add(formula1Driver);
                }catch (IOException ioException){
                    break;
                }
            }
            //infinite for loop
            for (;;){
                try {
                    //play race object read
                    PlayRace playRace =(PlayRace) objectInputStream1.readObject();
                    //adding play Race  in list
                    races.add(playRace);
                }catch (IOException ioException){
                    break;
                }
            }
            //closing objectInputStream
            objectInputStream.close();
            objectInputStream1.close();
            System.out.println("Successfully!!! data saved");
        }catch (IOException | ClassNotFoundException e){
            //any other mistakes
            System.out.println("Have some error");
        }

    }

    @Override
    //random race method
    public void generate_random_race(){

        List<Integer> num_list = new ArrayList<>();
        for (int j = 1; j <= championship.size(); j++){
            num_list.add(j);
        }

        Collections.shuffle(num_list);

        for (int i = 0; i < championship.size(); i++){

            int position = num_list.get(i);

            switch (position){
                case 1:
                    championship.get(i).setNumberOfPoints(championship.get(i).getNumberOfPoints() + 25);
                    championship.get(i).setNumberOfFirstPositions(championship.get(i).getNumberOfFirstPositions() + 1);
                    championship.get(i).setNumberOfRacesParticipated(championship.get(i).getNumberOfRacesParticipated() + 1);
                    break;
                case 2:
                    championship.get(i).setNumberOfPoints(championship.get(i).getNumberOfPoints() + 25);
                    championship.get(i).setNumberOfSecondPositions(championship.get(i).getNumberOfSecondPositions() + 1);
                    championship.get(i).setNumberOfRacesParticipated(championship.get(i).getNumberOfRacesParticipated() + 1);
                    break;
                case 3:
                    championship.get(i).setNumberOfPoints(championship.get(i).getNumberOfPoints() + 25);
                    championship.get(i).setNumberOfThirdPositions(championship.get(i).getNumberOfThirdPositions() + 1);
                    championship.get(i).setNumberOfRacesParticipated(championship.get(i).getNumberOfRacesParticipated() + 1);
                    break;
                case 4:
                    championship.get(i).setNumberOfPoints(championship.get(i).getNumberOfPoints() + 25);
                    championship.get(i).setNumberOfForthPositions(championship.get(i).getNumberOfForthPositions() + 1);
                    championship.get(i).setNumberOfRacesParticipated(championship.get(i).getNumberOfRacesParticipated() + 1);
                    break;
                case 5:
                    championship.get(i).setNumberOfPoints(championship.get(i).getNumberOfPoints() + 25);
                    championship.get(i).setNumberOfFifthPositions(championship.get(i).getNumberOfFifthPositions() + 1);
                    championship.get(i).setNumberOfRacesParticipated(championship.get(i).getNumberOfRacesParticipated() + 1);
                    break;
                case 6:
                    championship.get(i).setNumberOfPoints(championship.get(i).getNumberOfPoints() + 25);
                    championship.get(i).setNumberOfSixthPositions(championship.get(i).getNumberOfSixthPositions() + 1);
                    championship.get(i).setNumberOfRacesParticipated(championship.get(i).getNumberOfRacesParticipated() + 1);
                    break;
                case 7:
                    championship.get(i).setNumberOfPoints(championship.get(i).getNumberOfPoints() + 25);
                    championship.get(i).setNumberOfSeventhPositions(championship.get(i).getNumberOfSeventhPositions() + 1);
                    championship.get(i).setNumberOfRacesParticipated(championship.get(i).getNumberOfRacesParticipated() + 1);
                    break;
                case 8:
                    championship.get(i).setNumberOfPoints(championship.get(i).getNumberOfPoints() + 25);
                    championship.get(i).setNumberOfEighthPositions(championship.get(i).getNumberOfEighthPositions() + 1);
                    championship.get(i).setNumberOfRacesParticipated(championship.get(i).getNumberOfRacesParticipated() + 1);
                    break;
                case 9:
                    championship.get(i).setNumberOfPoints(championship.get(i).getNumberOfPoints() + 25);
                    championship.get(i).setNumberOfNinthPositions(championship.get(i).getNumberOfNinthPositions() + 1);
                    championship.get(i).setNumberOfRacesParticipated(championship.get(i).getNumberOfRacesParticipated() + 1);
                    break;
                case 10:
                    championship.get(i).setNumberOfPoints(championship.get(i).getNumberOfPoints() + 25);
                    championship.get(i).setNumberOfTenthPositions(championship.get(i).getNumberOfTenthPositions() + 1);
                    championship.get(i).setNumberOfRacesParticipated(championship.get(i).getNumberOfRacesParticipated() + 1);
                    break;
                default:
                    break;
            }
        }
    }

    public void sort_list_ascending(){
        Collections.sort(championship, new Comparator<Formula1Driver>() {
            @Override
            public int compare(Formula1Driver o1, Formula1Driver o2) {
                return o1.getNumberOfPoints() - o2.getNumberOfPoints();
            }
        });
        Collections.sort(championship, Collections.reverseOrder());
    }

    public void sort_list_ascending_by_position(){
        Collections.sort(championship, new Comparator<Formula1Driver>() {
            @Override
            public int compare(Formula1Driver o1, Formula1Driver o2) {
                return o1.getNumberOfFirstPositions() - o2.getNumberOfFirstPositions();
            }
        });
    }

    public void sort_list_ascending_by_date(){
        Collections.sort(championship, new Comparator<Formula1Driver>() {
            @Override
            public int compare(Formula1Driver o1, Formula1Driver o2) {
                return 0;
            }
        });
    }

    public String[][] display_driver_by_name(String input){
        int temp_obj = -1;
        String temp[][] =  new String[1][8];
        for (int i = 0; i < championship.size(); i++){
            if (championship.get(i).getName().equals(input)){
                temp_obj = i;
                temp[0][0] = championship.get(i).getName();
                temp[0][1] = championship.get(i).getLocation();
                temp[0][2] = championship.get(i).getTeam();
                temp[0][3] = championship.get(i).getNumberOfFirstPositions()+"";
                temp[0][4] = championship.get(i).getNumberOfSecondPositions()+"";
                temp[0][5] = championship.get(i).getNumberOfThirdPositions()+"";
                temp[0][6] = championship.get(i).getNumberOfPoints()+"";
                temp[0][7] = championship.get(i).getNumberOfRacesParticipated()+"";
            }
        }

        if (temp_obj == -1){
            System.out.println("\nUser Not Found");
        }else {
            System.out.println("\n"+championship.get(temp_obj).toString());
        }

        return temp;
    }

}
