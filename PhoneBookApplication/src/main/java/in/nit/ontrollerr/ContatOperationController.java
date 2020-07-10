package in.nit.ontrollerr;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.contact.dto.Contact;
import in.nit.service.IContactService;

@Controller
public class ContatOperationController {
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ContatOperationController.class);
	//*


	@Autowired
	private IContactService service;

	@PostMapping(value = "/save")
	public String saveStudent(@ModelAttribute("Contact") Contact contact,Model model ) {
		logger.info("Contact form submited"+contact);
		boolean isSave=	service.saveContact(contact);
		if(isSave) {
			model.addAttribute("sucMsg", "Thank You      "  +contact.getContName().toUpperCase());
		}else {
			model.addAttribute("errMsg", "Contact  not Saved");
		}
		return "redirect:/ContactSucCreat";
	}
	@RequestMapping(value = "/ContactSucCreat",method = RequestMethod.GET)
	public String contactCreationSucess(Model model) {
		logger.info("ContactCreate method call");
		model.addAttribute("Contact", new Contact());
		return "contact-register";
	}

	@RequestMapping(value = "/edit")
	public String editContact(@RequestParam("cid")Integer contId,Model model) {
		Contact c =service.getOneContact(contId);
		model.addAttribute("Contact",c);
		return"contact-register";
	}


	@RequestMapping("/delete")
	public String deleteContact(@RequestParam("cid")Integer contId,Model model) {
		boolean isdeleteContact = service.deleteContact(contId);
		if(isdeleteContact) {
			return "redirect:fetch";
		}
		return "";
	}

	@RequestMapping("/fetch")
	public String viewAllContacts(Model model) {
		List<Contact> contacts =service.getAllContact();
		model.addAttribute("contacts",contacts);
		return"contact-list";
	}
}
