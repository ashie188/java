public class udemy9 {
    static boolean validate(String name)
    {
        return (name.matches("[a-z A-Z\\s]+"));


    }

     static boolean validate(int age)
    {
        return (age>=3 && age<=20 );
        
        
    }

    public static void main(String[] args)
    {
        String name= "ashie";
        validate(name);

        int a=10;
        boolean b=validate(a);
        System.out.println(b);
    }
    
}
