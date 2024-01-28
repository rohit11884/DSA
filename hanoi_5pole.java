import java.util.Scanner;

public class hanoi_5pole {
    
    static void towerOfHanoi(int n, char source, char auxiliary1, char auxiliary2, char auxiliary3, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Move n-1 disks from source to auxiliary1
        towerOfHanoi(n - 1, source, auxiliary1, auxiliary2, auxiliary3, destination);

        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        
        // Move n-1 disks from auxiliary1 to destination
        towerOfHanoi(n - 1, auxiliary1, auxiliary2, auxiliary3, source, destination);
    }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of disks: ");
            int n = scanner.nextInt();
    
            // Assuming poles are labeled as A, B, C, D, E
            towerOfHanoi(n,'A', 'B', 'C', 'D', 'E');
        }
}
