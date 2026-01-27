import java.util.Scanner;

public class Project_daksh_singh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int policyNumber;
        String providerName;
        String firstName;
        String lastName;
        int age;
        String smokingStatus;
        double height;
        double weight;

        System.out.print("Enter the Policy Number: ");
        policyNumber = input.nextInt();
        input.nextLine(); 

        System.out.print("Enter the Provider Name: ");
        providerName = input.nextLine();

        System.out.print("Enter the Policyholder's First Name: ");
        firstName = input.nextLine();

        System.out.print("Enter the Policyholder's Last Name: ");
        lastName = input.nextLine();

        System.out.print("Enter the Policyholder's Age: ");
        age = input.nextInt();
        input.nextLine(); 

        System.out.print("Enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        smokingStatus = input.nextLine();

        System.out.print("Enter the Policyholder's Height (in inches): ");
        height = input.nextDouble();

        System.out.print("Enter the Policyholder's Weight (in pounds): ");
        weight = input.nextDouble();

        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);

        System.out.println();
        System.out.println("Policy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder Name: " + policy.getFirstName() + " " + policy.getLastName());
        System.out.println("Policyholder Age: " + policy.getAge());
        System.out.println("Policyholder Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholder Height: " + policy.getHeight());
        System.out.println("Policyholder Weight: " + policy.getWeight());
        System.out.printf("Policyholder BMI: %.2f\n", policy.calculateBMI());
        System.out.printf("Policy Price: $%.2f\n", policy.calculatePrice());

        input.close();
    }
}