package dev.lpa;

public class Main {
    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone("655238975");

        Contact contact1 = new Contact("Luna", "633145896");
        Contact contact2 = new Contact("Aisha", "631285497");
        Contact contact3 = new Contact("Youssef", "743512678");
        Contact contact4 = new Contact("Sara", "693214876");
        Contact contact5 = new Contact("Luna", "655748923");

        // ADD CONTACTS
        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);
        mobilePhone.addNewContact(contact3);
        mobilePhone.addNewContact(contact5);
        mobilePhone.printContacts();
        System.out.println("---------------------");

        // UPDATE A CONTACT
        mobilePhone.updateContact(contact2, contact4);
        mobilePhone.printContacts();
        System.out.println("---------------------");

        //REMOVE A CONTACT
        mobilePhone.removeContact(contact1);
        mobilePhone.printContacts();
        System.out.println("---------------------");

        //QUERY A CONTACT
        System.out.println("Sara -> " + mobilePhone.queryContact("Sara").getPhoneNumber());
        System.out.println("---------------------");

        //PRINT THE LIST OF CONTACTS
        mobilePhone.printContacts();
    }
}
