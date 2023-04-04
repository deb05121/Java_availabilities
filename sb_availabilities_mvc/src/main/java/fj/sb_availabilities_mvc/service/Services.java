package fj.sb_availabilities_mvc.service;

import java.util.ArrayList;
import java.util.List;

import fj.sb_availabilities_mvc.model.Address;
import fj.sb_availabilities_mvc.model.Availabilities;
import fj.sb_availabilities_mvc.model.Person;


public class Services {

	public List<String> allData(List<Person> userList, List<Address> addressList,
			List<Availabilities> availableList) {
		List<String> userAddressList = new ArrayList<>();
		String string  = "";
		for (Person user : userList) {
			
			string += user.getName() + ": ";
			
			for (Address address : addressList) {
				if (user.getId() == address.getUserId()) {
					string += address.getAddress() + "; ";					
				}
				for (Availabilities availabilities : availableList) {
					if ((address.getId() == availabilities.getAddressId()) && (user.getId() == address.getUserId())) {
						string += availabilities.toString() + "; ";						
					}
				}
			}
			System.out.println(string);
			userAddressList.add(string);
			string ="";
			System.out.println();
		}		
		
		
		
		
		
		return userAddressList;
	}	
	
}
