public class Main {

    public static void main(String[] args) {
        Contact myContact = new Contact("Ahmed", "Ahmed@hotmail.com");
        PhoneNumber myNumber = new PhoneNumber(012666666);
        int number = myNumber.setPhoneNumber(012000000);
        String name = myContact.setName("Ahmed");
        String email = myContact.setEmail("hello@hello.com");
        System.out.println("First contact: " + name + " " + email);
        System.out.println("Second contact: " + name + " " + "Phone number:  " + number + " " + "Email address: " + email);

        System.out.println(myContact);

    }
}
