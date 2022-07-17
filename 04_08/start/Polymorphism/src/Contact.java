public class Contact {
    private String name;
    private String email;

    public Contact(String name, String email){
        this.name = name;
        this.email = email;
    }

    public Contact() {

    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String email) {
        this.email = email;
        return email;
    }
}
