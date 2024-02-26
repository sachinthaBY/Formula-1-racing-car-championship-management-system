package com.company;

import java.io.Serializable;
import java.util.Objects;

public class Formula1Driver extends Driver implements Serializable, Comparable<Formula1Driver> {

    //Initialize variables
    private int numberOfFirstPositions;
    private int numberOfSecondPositions;
    private int numberOfThirdPositions;
    private int numberOfForthPositions;
    private int numberOfFifthPositions;
    private int numberOfSixthPositions;
    private int numberOfSeventhPositions;
    private int numberOfEighthPositions;
    private int numberOfNinthPositions;
    private int numberOfTenthPositions;
    private int numberOfPoints;
    private int numberOfRacesParticipated;

    //create constructor

    public Formula1Driver(int numberOfFirstPositions, int numberOfSecondPositions, int numberOfThirdPositions, int numberOfForthPositions, int numberOfFifthPositions, int numberOfSixthPositions, int numberOfSeventhPositions, int numberOfEighthPositions, int numberOfNinthPositions, int numberOfTenthPositions, int numberOfPoints, int numberOfRacesParticipated){
        super(); //call superclass
        this.numberOfFirstPositions = numberOfFirstPositions;
        this.numberOfSecondPositions = numberOfSecondPositions;
        this.numberOfThirdPositions = numberOfThirdPositions;
        this.numberOfForthPositions = numberOfForthPositions;
        this.numberOfFifthPositions = numberOfFifthPositions;
        this.numberOfSixthPositions = numberOfSixthPositions;
        this.numberOfSeventhPositions = numberOfSeventhPositions;
        this.numberOfEighthPositions = numberOfEighthPositions;
        this.numberOfNinthPositions = numberOfNinthPositions;
        this.numberOfTenthPositions = numberOfTenthPositions;
        this.numberOfPoints = numberOfPoints;
        this.numberOfRacesParticipated = numberOfRacesParticipated;
    }

    //create constructor
    public Formula1Driver(){

    }

    //create getters and setters

    public int getNumberOfFirstPositions() {
        return numberOfFirstPositions;
    }

    public void setNumberOfFirstPositions(int numberOfFirstPositions) {
        this.numberOfFirstPositions = numberOfFirstPositions;
    }

    public int getNumberOfSecondPositions() {
        return numberOfSecondPositions;
    }

    public void setNumberOfSecondPositions(int numberOfSecondPositions) {
        this.numberOfSecondPositions = numberOfSecondPositions;
    }

    public int getNumberOfThirdPositions() {
        return numberOfThirdPositions;
    }

    public void setNumberOfThirdPositions(int numberOfThirdPositions) {
        this.numberOfThirdPositions = numberOfThirdPositions;
    }

    public int getNumberOfForthPositions() {
        return numberOfForthPositions;
    }

    public void setNumberOfForthPositions(int numberOfForthPositions) {
        this.numberOfForthPositions = numberOfForthPositions;
    }

    public int getNumberOfFifthPositions() {
        return numberOfFifthPositions;
    }

    public void setNumberOfFifthPositions(int numberOfFifthPositions) {
        this.numberOfFifthPositions = numberOfFifthPositions;
    }

    public int getNumberOfSixthPositions() {
        return numberOfSixthPositions;
    }

    public void setNumberOfSixthPositions(int numberOfSixthPositions) {
        this.numberOfSixthPositions = numberOfSixthPositions;
    }

    public int getNumberOfSeventhPositions() {
        return numberOfSeventhPositions;
    }

    public void setNumberOfSeventhPositions(int numberOfSeventhPositions) {
        this.numberOfSeventhPositions = numberOfSeventhPositions;
    }

    public int getNumberOfEighthPositions() {
        return numberOfEighthPositions;
    }

    public void setNumberOfEighthPositions(int numberOfEighthPositions) {
        this.numberOfEighthPositions = numberOfEighthPositions;
    }

    public int getNumberOfNinthPositions() {
        return numberOfNinthPositions;
    }

    public void setNumberOfNinthPositions(int numberOfNinthPositions) {
        this.numberOfNinthPositions = numberOfNinthPositions;
    }

    public int getNumberOfTenthPositions() {
        return numberOfTenthPositions;
    }

    public void setNumberOfTenthPositions(int numberOfTenthPositions) {
        this.numberOfTenthPositions = numberOfTenthPositions;
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    public int getNumberOfRacesParticipated() {
        return numberOfRacesParticipated;
    }

    public void setNumberOfRacesParticipated(int numberOfRacesParticipated) {
        this.numberOfRacesParticipated = numberOfRacesParticipated;
    }

    //create toString method

    @Override
    public String toString() {
        return "Formula1Driver { " + super.toString()+
                "Number Of First Positions=" + numberOfFirstPositions +
                ", Number Of Second Positions=" + numberOfSecondPositions +
                ", Number Of Third Positions=" + numberOfThirdPositions +
                ", Number Of Forth Positions=" + numberOfForthPositions +
                ", Number Of Fifth Positions=" + numberOfFifthPositions +
                ", Number Of Sixth Positions=" + numberOfSixthPositions +
                ", Number Of Seventh Positions=" + numberOfSeventhPositions +
                ", Number Of Eighth Positions=" + numberOfEighthPositions +
                ", Number Of Ninth Positions=" + numberOfNinthPositions +
                ", Number Of Tenth Positions=" + numberOfTenthPositions +
                ", Number Of Points=" + numberOfPoints +
                ", Number Of Races Participated=" + numberOfRacesParticipated +
                " } ";
    }


    //create hashcode method

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfPoints);
    }

    @Override
    public int compareTo(Formula1Driver o){

        //comparing with points
        if (o.numberOfPoints > this.getNumberOfPoints()){  //check points
           return -1;
        }else if (o.numberOfPoints < this.getNumberOfPoints()){
            return 1;
        }else {
            //compare in number of first positions
            if (o.numberOfFirstPositions > this.getNumberOfFirstPositions()){
                return -1;
            }else if (o.numberOfFirstPositions < this.getNumberOfFirstPositions()){
                return 1;
            }else {
                return 0;
            }
        }
    }
}


