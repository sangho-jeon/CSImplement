package OOP.SOLID.DependencyInversionPrinciple;

public class Main {
    public static void main(String[] args) {
        MewithoutSRP mewithoutSRP = new MewithoutSRP("student");
        mewithoutSRP.work();
        mewithoutSRP.code();
    }
}
