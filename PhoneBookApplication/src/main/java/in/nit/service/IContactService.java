package in.nit.service;

import java.util.List;

import org.springframework.boot.autoconfigure.AutoConfigurationPackage;

import in.nit.contact.dto.Contact;
@AutoConfigurationPackage
public interface IContactService {
	//1- save the contact
	public boolean saveContact(Contact contact);
	//2- fetch all record from database
	public List<Contact> getAllContact();
	//3-  fetch by id
	public Contact getOneContact(Integer cid);
	//4- update contact
	public boolean updateContact(Contact contact);

	//5 -- delete contact
	public boolean deleteContact(Integer cid);
}
