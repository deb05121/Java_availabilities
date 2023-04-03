package fj.sb_availabilities_mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fj.sb_availabilities_mvc.db.Database;
import fj.sb_availabilities_mvc.model.Address;
import fj.sb_availabilities_mvc.model.Availabilities;
import fj.sb_availabilities_mvc.model.Person;
import fj.sb_availabilities_mvc.service.Services;

@Controller
public class AppController {
	
	@GetMapping("/dbread")
	public String getDbData(Model model) {
		List<Person> personList = new ArrayList<>();
		List<Address> addressList = new ArrayList<>();
		List<Availabilities> availableList = new ArrayList<>();
		
		Database db = new Database();
		
		personList = db.getPersons();
		addressList = db.getAddresses();
		availableList = db.getAvailabilities();		
		
		db.closeDb();
		
		Services service = new Services();
		List<Object[]> userAddressList = new ArrayList<>();
		userAddressList = service.allData(personList, addressList, availableList);
		
		model.addAttribute("users", userAddressList);
				
		return "/showusers";
	}
	
}
