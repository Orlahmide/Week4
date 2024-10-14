package service.impl;

import service.ApplicantService;

import java.util.Scanner;

public class ApplicantServiceImpl implements ApplicantService {


    @Override
    public void display() {

        System.out.println("Thank you for applying to our prestigious school!!!");
        System.out.println("Kindly input your name:");

        Scanner scanner = new Scanner(System.in);

        String appN = scanner.nextLine();
        System.out.println("Kindly input your age: ");
        int appA = scanner.nextInt();
        scanner.nextLine();

        if (appA >= 18) {

            System.out.println("Congratulations! " + appN + " You have been admitted to our prestigious school!");
        } else
            System.out.println("Unfortunately " + appN + ", you do not meet the required age, and your application has been denied by the Principal.");
    }

}
