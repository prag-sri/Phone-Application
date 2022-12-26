public class Main {
    public static void main(String[] args) {
        LandLine l1= new LandLine();
        System.out.println(l1.dialNo(1234567890));
        l1.ansPhoneCall(1234567890);

        MobilePhone m1= new MobilePhone();
        m1.setPowerOn(true);
        System.out.println(m1.dialNo(1234567890));
        m1.ansPhoneCall(1234567890);

        m1.setPowerOn(false);
        System.out.println(m1.dialNo(1234567890));
        m1.ansPhoneCall(1234567890);
    }
}