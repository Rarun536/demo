class Tata {
    public void providingJobs() {
        System.out.println("The Company provides jobs in all the Industries");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Tata obj = new Tata() 
        {
            public void providingJobs() 
            {
                System.out.println("Getting job is difficult ");
            }
        };
        obj.providingJobs();
    }
}
