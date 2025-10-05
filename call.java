import java.util.Scanner;

class account {
    
    private String accno;
    private String name;
    private String address;
    private long phoneno;
    private String dob;
    public int balance;
    public int loan=500000;

    public String getaccno()
    {
        return accno;
    }

    public String getname()
    {
        return name;
    }

    public String getaddress()
    {
        return address;

    }

    public long getphoneno()
    {
        return phoneno;
    }

    public String getdob()
    {
        return dob;
    }

    public int getbalance()
    {
        return balance;
    }

    public int setbalance(int balance)
    {
        this.balance= balance;
        return balance;
    }

   //superconstuctor
    public account(String accno,String name,String address,long phoneno,String dob)
    {
        this.accno=accno;
        this.name=name;
        this.address=address;
        this.phoneno=phoneno;
        this.dob=dob;
        balance=50000;
    }

    public void close()
    {
        if(balance<10000)
        {
            System.out.println("Account is closed");
            System.exit(0);
        }
    }
}

class savingaccount extends account
{
    public int deposit()
    {
        System.out.println("enter the deposit amount");
        Scanner sc=new Scanner(System.in);
        int depo=sc.nextInt();

        balance=balance+depo;
        return balance;
        
    }

    public int withdraw()
    {
        System.out.println("enter the withdraw amount");
        Scanner sc=new Scanner(System.in);
        int draw=sc.nextInt();

        balance=balance-draw;
        return balance;
    }

    public int fixeddeposit(int fixdepo)
    {
        balance=balance+fixdepo;
        return balance;
    
    }

    public int liquidate()
    {
        return balance;
    }

}

class loanaccount extends account
{
    public int payemi(int emi)
    {
        loan=loan-emi;
        return loan;
    }

    public int topuploan(int topup)
    {
        if(loan<100000)
        {
            balance=balance+topup;
        }
        return balance;
    }

}

public class call
{
    public static void main(String[] args) 
    {
        account obj1=new account("22PN2411", "ashutosh", "sggs nanded", 992276, "22/11/2003");
        savingaccount obj2=new savingaccount();
        loanaccount obj3=new loanaccount();
    }
}

