package example;

public class NumberOperationSample4 {
    public static void main(String[] args) {
        int totalAge = 23 + 24 + 25 + 25;
        int members = 4;

        double averageAge = totalAge / members;
        System.out.println(averageAge);

        double averageAge2 = (double) totalAge / members;
        System.out.println(averageAge2);
    }    
}
