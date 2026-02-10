/**
 * The Policy class represents an insurance policy for a policyholder.
 */
public class Policy
{
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    /**
     * No-arg constructor that initializes fields with default values.
     */
    public Policy()
    {
        this.policyNumber = 0;
        this.providerName = "";
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smokingStatus = "non-smoker";
        this.height = 0.0;
        this.weight = 0.0;
    }

    /**
     * Constructor that accepts arguments for each field.
     * @param policyNumber The policy identification number.
     * @param providerName The name of the insurance provider.
     * @param firstName The policyholder's first name.
     * @param lastName The policyholder's last name.
     * @param age The policyholder's age.
     * @param smokingStatus The smoking status ("smoker" or "non-smoker").
     * @param height The policyholder's height in inches.
     * @param weight The policyholder's weight in pounds.
     */
    public Policy(int policyNumber, String providerName, String firstName, String lastName, int age, String smokingStatus, double height, double weight)
    {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    // --- Setters and Getters ---

    /** @param policyNumber Sets the policy number. */
    public void setPolicyNumber(int policyNumber) { this.policyNumber = policyNumber; }
    /** @return The policy number. */
    public int getPolicyNumber() { return policyNumber; }

    /** @param providerName Sets the provider name. */
    public void setProviderName(String providerName) { this.providerName = providerName; }
    /** @return The provider name. */
    public String getProviderName() { return providerName; }

    /** @param firstName Sets the first name. */
    public void setFirstName(String firstName) { this.firstName = firstName; }
    /** @return The first name. */
    public String getFirstName() { return firstName; }

    /** @param lastName Sets the last name. */
    public void setLastName(String lastName) { this.lastName = lastName; }
    /** @return The last name. */
    public String getLastName() { return lastName; }

    /** @param age Sets the age. */
    public void setAge(int age) { this.age = age; }
    /** @return The age. */
    public int getAge() { return age; }

    /** @param smokingStatus Sets the smoking status. */
    public void setSmokingStatus(String smokingStatus) { this.smokingStatus = smokingStatus; }
    /** @return The smoking status. */
    public String getSmokingStatus() { return smokingStatus; }

    /** @param height Sets the height. */
    public void setHeight(double height) { this.height = height; }
    /** @return The height. */
    public double getHeight() { return height; }

    /** @param weight Sets the weight. */
    public void setWeight(double weight) { this.weight = weight; }
    /** @return The weight. */
    public double getWeight() { return weight; }

    /**
     * Calculates the Body Mass Index (BMI) of the policyholder.
     * @return The calculated BMI.
     */
    public double calculateBMI()
    {
        return (weight * 703) / Math.pow(height, 2);
    }

    /**
     * Calculates the total price of the insurance policy based on age, smoking status, and BMI.
     * @return The total policy price.
     */
    public double calculatePrice() 
    {
        double price = 600.0;

        if (age > 50) 
        {
            price += 75.0;
        }

        if (smokingStatus.equalsIgnoreCase("smoker")) 
        {
            price += 100.0;
        }

        double bmi = calculateBMI();
        if (bmi > 35) 
        {
            price += (bmi - 35) * 20;
        }

        return price;
    }
}