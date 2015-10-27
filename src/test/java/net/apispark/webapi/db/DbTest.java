package net.apispark.webapi.db;

import net.apispark.webapi.representation.Contact;
import net.apispark.webapi.representation.Gender;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by SamNag on 27/10/15.
 * Unit tests for the database
 */
public class DbTest {

    /**
     * Adding new Contact should return the created contact with an assigned id
     * (Method: ContactPersistence.INSTANCE.addContact(contact))
     */
    @Test
    public void creating_new_contact(){
        Contact contact = ContactPersistence.INSTANCE.addContact(new Contact());
        assertNotNull(contact);
        assertNotNull(contact.getId());
    }

    /**
     * Add a new Contact then requesting it by id returns the contact
     * (Method: ContactPersistence.INSTANCE.getContact(contactId))
     */
    @Test
    public void requesting_added_contact(){
        String s = "string";
        Contact contact = new Contact(s,s,s, Gender.Female, s);
        ContactPersistence.INSTANCE.addContact(contact);
        assertNotNull(ContactPersistence.INSTANCE.getContact(s));
    }



}
