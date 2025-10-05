import java.util.Scanner; 

public class Roughs {

    int a;
    int b;
    int c; 
    float dvd;

    void show() 
    {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter value for a: ");
        a = scanner.nextInt(); 
        System.out.print("Enter value for b: ");
        b = scanner.nextInt(); 
        scanner.close(); 
        dvd = (float)a / b; 
    }
}

class Output {
    public static void main(String[] args) 
    {
        Roughs obj = new Roughs();
        obj.show();
        System.out.print("value is: " + obj.dvd); 
    }
} 
