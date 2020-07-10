package in.nit.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.contact.dto.Contact;
import in.nit.model.ContactModel;
import in.nit.repo.ContactRepositary;
import in.nit.service.IContactService;
@Service
public class ContactServiceImpl implements IContactService{
	@Autowired
	private ContactRepositary crepo;
	@Override
	public boolean saveContact(Contact cont) {

		ContactModel entity = new ContactModel();
		BeanUtils.copyProperties(cont, entity);
		ContactModel	saveentity =crepo.save(entity);
		return saveentity.getContId() !=null;
	}

	@Override
	public List<Contact> getAllContact() {
		List<ContactModel> entity =crepo.findAll();
		List<Contact> contacts = new ArrayList<Contact>();
		// legacy apprach
		for(ContactModel entity1  :entity) {
			Contact contact = new Contact();
			BeanUtils.copyProperties(entity1, contact);
			contacts.add(contact);
		}
		return contacts;
	}
	

	@Override
	public Contact getOneContact(Integer cid) {
		Optional<ContactModel> findById = crepo.findById(cid);
		if(findById.isPresent()) {
			ContactModel entity = findById.get();
			Contact cida = new Contact();
			BeanUtils.copyProperties(entity,cida);
			return cida;
		}
		return null;
	}

	@Override
	public boolean updateContact(Contact cont) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContact(Integer cid) {
		crepo.deleteById(cid);
		return true;
	}

}
