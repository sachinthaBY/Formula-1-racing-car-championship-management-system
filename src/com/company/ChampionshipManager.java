package com.company;

import java.io.IOException;

public interface ChampionshipManager {

    //void method
    void addDriver(Formula1Driver formula1Driver);
    void deleteDriver(String name, String team);
    void printDriverList();
    void addRace();
    void displayStatistics(String name);
    void displayFormula1DriverTable();
    void saveData();
    void loadData() throws IOException;
    void generate_random_race();

}
