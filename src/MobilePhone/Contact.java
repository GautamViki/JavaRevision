package MobilePhone;

import java.util.Objects;

public class Contact {
    private String name;
    private String phoneNum;

    public Contact() {

    }

    Contact(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public static Contact createContact(String name, String phoneNum) {
        Contact contact = new Contact(name, phoneNum);
        return contact;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return name.equals(contact.name) && phoneNum.equals(contact.phoneNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNum);
    }

    @Override
    public String toString() {
        return "Contact {" +
                "name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
