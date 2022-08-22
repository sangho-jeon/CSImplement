package OOP.SOLID.DependencyInversionPrinciple.WithSRP;

public abstract class Me {
    public abstract void work();
    public abstract void code();

    public Me(String role){
        this.role = role;
    }
    private String role;

    public void talk(){
        System.out.println("i can talk because im a person");
    }
    public void eat(){
        System.out.println("i can eat because im a person");
    }
}
