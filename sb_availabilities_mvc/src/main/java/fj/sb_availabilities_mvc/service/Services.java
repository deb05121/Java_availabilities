package fj.sb_availabilities_mvc.service;

import java.util.ArrayList;
import java.util.List;

import fj.sb_availabilities_mvc.model.Address;
import fj.sb_availabilities_mvc.model.Availabilities;
import fj.sb_availabilities_mvc.model.Person;


public class Services {

	public List<Object[]> allData(List<Person> userList, List<Address> addressList,
			List<Availabilities> availableList) {
		List<Object[]> userAddressList = new ArrayList<>();
		
		for (Person user : userList) {
			System.out.println(user.getName() + ": ");
			
			for (Address address : addressList) {
				if(user.getId() == address.getUserId()) {
					
					System.out.println(address.getAddress() + "; ");
				}
				for (Availabilities availabilities : availableList) {
					
					if((address.getId() == availabilities.getAddressId()) && (user.getId() == address.getUserId())) {
						
						System.out.println(availabilities.toString());
					}
				}
			}
			System.out.println();
		}
		
		
		return userAddressList;
	}	
	
}
