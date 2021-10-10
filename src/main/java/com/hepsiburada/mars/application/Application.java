package com.hepsiburada.mars.application;

import com.hepsiburada.mars.common.Constants;
import com.hepsiburada.mars.plateau.Plateau;
import com.hepsiburada.mars.rover.Rover;
import static com.hepsiburada.mars.parser.InputParser.parsePlateau;
import static com.hepsiburada.mars.parser.InputParser.parsePosition;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        ArrayList<Rover> rovers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // First input is size of plateau
        Plateau plateau = parsePlateau(scanner.nextLine());
        while(scanner.hasNext()) {
            Rover rover;
            String roverInput = scanner.nextLine();
            if(roverInput.equals(Constants.EXIT_COMMAND))
                break;
            else {
                rover = new Rover(plateau, parsePosition(roverInput));
            }
            rovers.add(rover);
            rover.process(scanner.nextLine());
        }
        System.out.println("Output ..");
        rovers.forEach(r -> System.out.println(r.getPosition()));
    }
}
