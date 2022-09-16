package MobilePhone;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contact> list = new ArrayList<>();
        list.add(Contact.createContact("Vikas", "5156654"));
        list.add(Contact.createContact("Raj", "445464564"));
        MobilePhone phone = new MobilePhone((ArrayList<Contact>) list);
        System.out.println(list);
        Contact oldContact = new Contact("Vikas", "5156654");
        Contact newContact = new Contact("Akash", "568970000");
        System.out.println(phone.addNewContact(oldContact));
        System.out.println(list);
        System.out.println(phone.updateContact(oldContact, newContact));
        System.out.println(list);
//        System.out.println(phone.removeContact(newContact));
        System.out.println(list);
        System.out.println(phone.findContact(newContact));
        System.out.println(phone.queryContact("Raj"));
//        System.out.println(list);
        phone.printContacts();
    }
}
