package MobilePhone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContact;

    public MobilePhone() {
    }

    MobilePhone(ArrayList<Contact> list) {

        this.myContact = list;
    }

    public boolean addNewContact(Contact contact) {
        if (myContact.contains(contact)) {
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact old, Contact newC) {
        if (myContact.contains(old)) {
            myContact.remove(old);
            myContact.add(newC);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        if (myContact.contains(contact)) {
            myContact.remove(contact);
            return true;
        }
        return false;
    }

    public int findContact(Contact contact) {
        if (myContact.contains(contact)) {
            return myContact.indexOf(contact);
        }
        return -1;
    }

    public Contact queryContact(String name) {
        for (Contact contacts : myContact) {
            if (contacts.getName().equals(name)) {
                return contacts;
            }
        }
        return null;
    }

    public void printContacts() {
        int i = 1;
        for (Contact contact : myContact) {
            System.out.println(i + ". " + contact.getName() + " -> " + contact.getPhoneNum());
            i++;
        }
    }
}
