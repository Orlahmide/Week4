package service.impl;

import enums.Gender;
import model.Principal;
import service.PrincipalService;

import java.util.Scanner;

public class PrincipalServiceImpl implements PrincipalService {

    @Override
    public void display(Principal principal) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome input your name: ");

        String userName1 = scanner.next();

        System.out.println("Kindly input your age: ");
        int age1 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Input gender: ");
        Gender gender1 = Gender.valueOf(scanner.nextLine());

        principal = new Principal(userName1, age1, 250000, gender1);
 
        System.out.println("Welcome! "+ userName1 + "\n" +
                "Current age according to you:  "+ age1 + "\n" +
                "Gender: "+ gender1 + "\n" +
                "Current fixed salary: "+ principal.getSalary() +".");




    }
}
