package homework2;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double flatNumber;
        double floorNumber;
        double porchNumber;

        System.out.println("Insert flat number: ");
        flatNumber = sc.nextInt();
        if (flatNumber >0 && flatNumber <= 144) {
            porchNumber = Math.ceil(flatNumber/(36));
            System.out.println("Porch number is "+ porchNumber);
            if (flatNumber <= 36) {
                floorNumber = Math.ceil((flatNumber) / 4);
                System.out.println("Floor number is "+ floorNumber);
            }
            else if (flatNumber <= 72) {
                floorNumber = Math.ceil((flatNumber-36) / 4);
                System.out.println("Floor number is "+ floorNumber);
            }
            else if (flatNumber <= 108) {
                floorNumber = Math.ceil((flatNumber-72) / 4);
                System.out.println("Floor number is "+ floorNumber);
            }
            else if (flatNumber <= 144) {
                floorNumber = Math.ceil((flatNumber-108) / 4);
                System.out.println("Floor number is "+ floorNumber);
            }
        }
        else {
            System.out.println("There is no such flat in the building");
        }
        sc.close();
    }
}
