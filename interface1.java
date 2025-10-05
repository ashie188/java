interface member
{
    void callback();
}

class store
{
    member mem[]=new member[100];
    int count=0;

    public void register(member m)
    { 
        mem[count ++]=m;
    }

    public void invite()
    {
        for(int i=1;i<=100;i++)
        {
            mem[i].callback();
        }
    }
}

class customer implements member
{
    String name;

    public customer(String n)
    {
        name=n;
    }

    public void callback()
    {
        System.out.println("yes , i will visit "+name);
    }
}

public class interface1 
{
    public static void main(String[] args) 
    {
        store s=new store();
        s.register();
        s.invite();
        
        customer c1=new customer("ashie");
        customer c2=new customer("aditii");
        c1.callback();
        c2.callback();
    
    }
    
}
