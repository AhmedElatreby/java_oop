public class PhoneNumber extends Contact{
   private int phoneNumber;
    PhoneNumber(int phoneNumber){
        super();
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return phoneNumber;
    }
}
