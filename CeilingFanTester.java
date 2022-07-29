// Developer: Cassidy Barr

import java.util.Scanner;

public class CeilingFanTester {

    public static void main(String[] args) {

        // Developer Tests
        CeilingFan myFan = new CeilingFan();
        myFan.getFanState(myFan);
        myFan.pullSpeedCord();
        myFan.pullRotationCord();
        myFan.getFanState(myFan);
        myFan.pullSpeedCord();
        myFan.pullRotationCord();
        myFan.getFanState(myFan);
        myFan.pullSpeedCord();
        myFan.pullRotationCord();
        myFan.getFanState(myFan);
        myFan.pullSpeedCord();
        myFan.pullRotationCord();
        myFan.getFanState(myFan);

        // User Tests
        CeilingFan testerFan = new CeilingFan();
        int exit = 0, command;
        Scanner input = new Scanner(System.in);

        while(exit == 0) {
            System.out.print("Please enter a command for the ceiling fan. \n(1 = Get current state of fan. 2 = Pull speed cord. 3 = Pull rotation cord. 4 = Exit Fan Tester.): ");

            command = 0;

            try {
                command = input.nextInt();
            } catch (Exception e) {
                // Handle InputMismatchException
                System.out.println("\nInvalid input! Please enter a command number 0 - 4.\n");
                input.nextLine();
                continue;
            }

            
            System.out.print("\n");
            if(command <= 0 || command >= 5) {

                System.out.println("Invalid Command!\n");

            } else {

                if(command == 1) {

                    testerFan.getFanState(testerFan);

                } else if(command == 2) {

                    testerFan.pullSpeedCord();

                } else if(command == 3) {

                    testerFan.pullRotationCord();
                    
                } else if(command == 4) {

                    exit = 1;

                }

            }
            
        }

        System.out.println("Thank you for using my fan!\n");

        input.close();

    }
}