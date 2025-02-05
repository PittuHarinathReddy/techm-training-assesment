package orgau;
import java.util.Scanner;

public class Studentavg {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of subjects: ");
        int subjectCount=scanner.nextInt();
        String[] names=new String[n];
        int[] totals=new int[n];      
        int[] averages=new int[n];    
        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = scanner.nextLine();

            int total = 0;
            for (int j = 0; j < subjectCount; j++) {
                System.out.print("Marks in Subject " + (j + 1) + ": ");
                total += scanner.nextInt();
            }
            totals[i]=total;      
            averages[i]=total/subjectCount; 
        }

        
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(totals[j] < totals[j + 1]) {
         
                    int tempTotal = totals[j];
                    totals[j] = totals[j + 1];
                    totals[j + 1] = tempTotal;

                 
                    int tempAvg = averages[j];
                    averages[j] = averages[j + 1];
                    averages[j + 1] = tempAvg;

                
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }
        
        System.out.println("Name\tTotal\tAverage");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + "\t" + totals[i] + "\t" + averages[i]);
        }

    }
}
