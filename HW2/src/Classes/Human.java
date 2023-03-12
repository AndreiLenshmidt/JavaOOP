package Classes;

public abstract class Human {
    
    private String name;
    private String surname;
    private String status;
    private int phoneNumber;
    private String mail;
    private String address;

    public Human(String name, String surname, String status, int phoneNumber, String mail, String addres) {
        this.name = name;
        this.surname = surname;
        this.status = status;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.address = addres;
    }

    public Human(String name, String surname, String status) {
        this(name, surname, status, 00000000, "DefultMail", "DefultAdress");
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getStatus() {
        return status;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format(
            "%s {name: %s,%nsurname: %s,%nstatus: %s;%nphone: %x;%nmail: %s;%naddress: %s;%n}", 
            getType(), 
            getName(),
            getSurname(), 
            getStatus(), 
            getPhoneNumber(), 
            getMail(),
            getAddress()
            );
    }


}
