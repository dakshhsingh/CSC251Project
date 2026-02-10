import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Project_daksh_singh {
    public static void main(String[] args) throws IOException {
        
        ArrayList<Policy> policies = new ArrayList<>();
        
        int smokerCount = 0;
        int nonSmokerCount = 0;

        File file = new File("PolicyInformation.txt");
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext()) {
            int policyNumber = inputFile.nextInt();
            inputFile.nextLine(); 
            
            String providerName = inputFile.nextLine();
            String firstName = inputFile.nextLine();
            String lastName = inputFile.nextLine();
            
            int age = inputFile.nextInt();
            inputFile.nextLine(); 
            
            String smokingStatus = inputFile.nextLine();
            double height = inputFile.nextDouble();
            double weight = inputFile.nextDouble();
            
            if (inputFile.hasNext()) {
                inputFile.nextLine(); 
            }

            Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
            policies.add(policy);
        }
        
        inputFile.close();

        for (Policy policy : policies) {
            System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
            System.out.println("Provider Name: " + policy.getProviderName());
            System.out.println("Policyholder's First Name: " + policy.getFirstName());
            System.out.println("Policyholder's Last Name: " + policy.getLastName());
            System.out.println("Policyholder's Age: " + policy.getAge());
            System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + policy.getSmokingStatus());
            System.out.printf("Policyholder's Height: %.1f inches\n", policy.getHeight());
            System.out.printf("Policyholder's Weight: %.1f pounds\n", policy.getWeight());
            System.out.printf("Policyholder's BMI: %.2f\n", policy.calculateBMI());
            System.out.printf("Policy Price: $%.2f\n", policy.calculatePrice());

            if (policy.getSmokingStatus().equalsIgnoreCase("smoker")) {
                smokerCount++;
            } else {
                nonSmokerCount++;
            }
        }

        System.out.println("\nThe number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}