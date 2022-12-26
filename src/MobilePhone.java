import java.util.Scanner;

public class MobilePhone implements PhoneInterface{
    private boolean powerOn;
    MobilePhone(){
        this.powerOn= false;
    }

    void setPowerOn(boolean power){
        this.powerOn= power;
    }

    @Override
    public String dialNo(int PhoneNo) {
        if(powerOn)
            return "Calling "+PhoneNo+"...";
        else
            return "Power is Off!";
    }

    @Override
    public void ansPhoneCall(int PhoneNo) {
        if(powerOn)
        {
            System.out.println(PhoneNo+" is calling! Do you want to pick up the call?");
            Scanner sc= new Scanner(System.in);
            boolean flag= sc.nextBoolean();
            if(flag)
                System.out.println("Talking with "+PhoneNo+"!");
            else
                System.out.println("Call hung up!");
        }
        else
            System.out.println("Power is Off!");
    }
}
