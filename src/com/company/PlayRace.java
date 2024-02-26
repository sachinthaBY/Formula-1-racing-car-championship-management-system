package com.company;

import java.io.Serializable;
import java.util.Date;

public class PlayRace implements Serializable, Comparable<PlayRace> {

    //Initialize variables
    private String firstDriver;
    private String secondDriver;
    private String thirdDriver;
    private String forthDriver;
    private String fifthDriver;
    private String sixthDriver;
    private String seventhDriver;
    private String eighthDriver;
    private String ninthDriver;
    private String tenthDriver;
    private int firstDriverPosition;
    private int secondDriverPosition;
    private int thirdDriverPosition;
    private int forthDriverPosition;
    private int fifthDriverPosition;
    private int sixthDriverPosition;
    private int seventhDriverPosition;
    private int eighthDriverPosition;
    private int ninthDriverPosition;
    private int tenthDriverPosition;
    private Date date;

    //create race constructor

    public PlayRace(String firstDriver, String secondDriver, String thirdDriver, String forthDriver, String fifthDriver, String sixthDriver, String seventhDriver, String eighthDriver, String ninthDriver, String tenthDriver, int firstDriverPosition, int secondDriverPosition, int thirdDriverPosition, int forthDriverPosition, int fifthDriverPosition, int sixthDriverPosition, int seventhDriverPosition, int eighthDriverPosition, int ninthDriverPosition, int tenthDriverPosition, Date date) {
        this.firstDriver = firstDriver;
        this.secondDriver = secondDriver;
        this.thirdDriver = thirdDriver;
        this.forthDriver = forthDriver;
        this.fifthDriver = fifthDriver;
        this.sixthDriver = sixthDriver;
        this.seventhDriver = seventhDriver;
        this.eighthDriver = eighthDriver;
        this.ninthDriver = ninthDriver;
        this.tenthDriver = tenthDriver;
        this.firstDriverPosition = firstDriverPosition;
        this.secondDriverPosition = secondDriverPosition;
        this.thirdDriverPosition = thirdDriverPosition;
        this.forthDriverPosition = forthDriverPosition;
        this.fifthDriverPosition = fifthDriverPosition;
        this.sixthDriverPosition = sixthDriverPosition;
        this.seventhDriverPosition = seventhDriverPosition;
        this.eighthDriverPosition = eighthDriverPosition;
        this.ninthDriverPosition = ninthDriverPosition;
        this.tenthDriverPosition = tenthDriverPosition;
        this.date = date;
    }

    //create constructor

    public PlayRace() {

    }

    //create getters and setters

    public String getFirstDriver() {
        return firstDriver;
    }

    public void setFirstDriver(String firstDriver) {
        this.firstDriver = firstDriver;
    }

    public String getSecondDriver() {
        return secondDriver;
    }

    public void setSecondDriver(String secondDriver) {
        this.secondDriver = secondDriver;
    }

    public String getThirdDriver() {
        return thirdDriver;
    }

    public void setThirdDriver(String thirdDriver) {
        this.thirdDriver = thirdDriver;
    }

    public String getForthDriver() {
        return forthDriver;
    }

    public void setForthDriver(String forthDriver) {
        this.forthDriver = forthDriver;
    }

    public String getFifthDriver() {
        return fifthDriver;
    }

    public void setFifthDriver(String fifthDriver) {
        this.fifthDriver = fifthDriver;
    }

    public String getSixthDriver() {
        return sixthDriver;
    }

    public void setSixthDriver(String sixthDriver) {
        this.sixthDriver = sixthDriver;
    }

    public String getSeventhDriver() {
        return seventhDriver;
    }

    public void setSeventhDriver(String seventhDriver) {
        this.seventhDriver = seventhDriver;
    }

    public String getEighthDriver() {
        return eighthDriver;
    }

    public void setEighthDriver(String eighthDriver) {
        this.eighthDriver = eighthDriver;
    }

    public String getNinthDriver() {
        return ninthDriver;
    }

    public void setNinthDriver(String ninthDriver) {
        this.ninthDriver = ninthDriver;
    }

    public String getTenthDriver() {
        return tenthDriver;
    }

    public void setTenthDriver(String tenthDriver) {
        this.tenthDriver = tenthDriver;
    }

    public int getFirstDriverPosition() {
        return firstDriverPosition;
    }

    public void setFirstDriverPosition(int firstDriverPosition) {
        this.firstDriverPosition = firstDriverPosition;
    }

    public int getSecondDriverPosition() {
        return secondDriverPosition;
    }

    public void setSecondDriverPosition(int secondDriverPosition) {
        this.secondDriverPosition = secondDriverPosition;
    }

    public int getThirdDriverPosition() {
        return thirdDriverPosition;
    }

    public void setThirdDriverPosition(int thirdDriverPosition) {
        this.thirdDriverPosition = thirdDriverPosition;
    }

    public int getForthDriverPosition() {
        return forthDriverPosition;
    }

    public void setForthDriverPosition(int forthDriverPosition) {
        this.forthDriverPosition = forthDriverPosition;
    }

    public int getFifthDriverPosition() {
        return fifthDriverPosition;
    }

    public void setFifthDriverPosition(int fifthDriverPosition) {
        this.fifthDriverPosition = fifthDriverPosition;
    }

    public int getSixthDriverPosition() {
        return sixthDriverPosition;
    }

    public void setSixthDriverPosition(int sixthDriverPosition) {
        this.sixthDriverPosition = sixthDriverPosition;
    }

    public int getSeventhDriverPosition() {
        return seventhDriverPosition;
    }

    public void setSeventhDriverPosition(int seventhDriverPosition) {
        this.seventhDriverPosition = seventhDriverPosition;
    }

    public int getEighthDriverPosition() {
        return eighthDriverPosition;
    }

    public void setEighthDriverPosition(int eighthDriverPosition) {
        this.eighthDriverPosition = eighthDriverPosition;
    }

    public int getNinthDriverPosition() {
        return ninthDriverPosition;
    }

    public void setNinthDriverPosition(int ninthDriverPosition) {
        this.ninthDriverPosition = ninthDriverPosition;
    }

    public int getTenthDriverPosition() {
        return tenthDriverPosition;
    }

    public void setTenthDriverPosition(int tenthDriverPosition) {
        this.tenthDriverPosition = tenthDriverPosition;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    //create compareTo method compare dates
    @Override
    public int compareTo(PlayRace driverOne){
        return this.date.compareTo(driverOne.getDate());
    }
}
