import java.util.*;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        employee[] employees = new employee[100];

        int count = 0;

        while(true)
        {
            System.out.println("---Employee Management System---");
            System.out.println("1. Add Manager");
            System.out.println("2. Add Developer");
            System.out.println("3. Display All Employees");
            System.out.println("4. Find Employee with Highest Salary");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch(choice)
            {
                case 1:
                {
                    System.out.print("Enter Manager Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Bonus: ");
                    double bonus = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    manager manager = new manager(name, department, salary, bonus);
                    employees[count] = manager;
                    count++;
                    break;
                }
                case 2:
                {
                    System.out.print("Enter Developer Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Programming Language: ");
                    String proglang = scanner.nextLine();
                    developer developer = new developer(name, department, salary, proglang);
                    employees[count] = developer;
                    count++;
                    break;
                }
                case 3:
                {
                    System.out.println("All Employees:");
                    for(int i= 0; i < count; i++)
                    {
                        employees[i].displayInfo();
                        System.out.println();
                    }
                    break;
                }
                case 4:
                {
                    System.out.println("Employee with Highest Salary:");
                    if(count == 0) {
                        System.out.println("No employees found.");
                        break;
                    }
                    employee highest = employees[0];
                    for(int i = 1; i < count; i++)
                    {
                        if(employees[i].getSalary() > highest.getSalary())
                        {
                            highest = employees[i];
                        }
                    }
                    highest.displayInfo();
                    break;
                }
                case 5:
                {
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return; 
                }
                default:
                {
                    System.out.println("Invalid choice. Please try again.");
                }
                



            }

            if(count >= employees.length) {
                System.out.println("Employee list is full. Cannot add more employees.");
                break;
            }



        }

    }
    
}
