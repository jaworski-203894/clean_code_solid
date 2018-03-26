package pl.ttpsc.solid.isp.contactbook.solution;

public class Contact implements Telephone, Email {
    private String emailAddres = "contact@example.com";
    private String phoneNumber = "+00 123 456 789";
    private String name;
    private String address;

    public Contact(String emailAddres, String phoneNumber, String name, String address) {
        this.emailAddres = emailAddres;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.address = address;
    }

    public void setEmailAddres(String emailAddres) {
        this.emailAddres = emailAddres;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getEmailAddress() {
        return emailAddres;
    }

    @Override
    public String getPhoneNumber() {
       return phoneNumber;
    }
}
