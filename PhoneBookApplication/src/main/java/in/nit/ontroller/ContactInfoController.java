package in.nit.ontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import in.nit.contact.dto.Contact;
@Controller
public class ContactInfoController {
	@RequestMapping(value = {"/","/load"})
	public String loadPage(Model model) {
		//Contact c =;
		model.addAttribute("Contact", new Contact());
		return "contact-register";
	}


}
