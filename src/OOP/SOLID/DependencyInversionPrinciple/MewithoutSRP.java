package OOP.SOLID.DependencyInversionPrinciple;

import java.util.Objects;

public class MewithoutSRP {
    // 사람 객체의 생성자로 타입을 넘겨주고 하나의 클래스 안에서 모든걸 해결할려고 한다. 이는 잘못된 설계.
    public MewithoutSRP(String role) {
        this.role = role;
    }

    private String role;

    public void talk(){
        System.out.println("i can talk because im a person");
    }
    public void eat(){
        System.out.println("i can eat because im a person");
    }

    public void work() {
        switch (role) {
            case "student":
                System.out.println("studing is work!");
                break;
            case "son":
                System.out.println("im working as son");
                break;
            case "engineer":
                System.out.println("im working as engineer");
                break;
        }
    }

    public void code(){
        if(Objects.equals(role, "engineer")){
            System.out.println("i can code!");
        }
        else{
            System.out.println(" im not engineer");
        }
    }
}
