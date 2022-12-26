import java.util.Scanner;
public class LandLine implements PhoneInterface{

    @Override
    public String dialNo(int PhoneNo) {
        return "Calling "+PhoneNo+"...";
    }

    @Override
    public void ansPhoneCall(int PhoneNo) {
        System.out.println(PhoneNo+" is calling! Do you want to pick up the call?");
        Scanner sc= new Scanner(System.in);
        boolean flag= sc.nextBoolean();
        if(flag)
            System.out.println("Talking with "+PhoneNo+"!");
        else
            System.out.println("Call hung up!");
    }
}
