package fr.carbuddy.controller.search.driver.impl;

import java.util.List;
import java.util.Set;

import fr.carbuddy.bean.Criteria;
import fr.carbuddy.bean.Driver;
import fr.carbuddy.bean.User;
import fr.carbuddy.controller.search.driver.ISearchDriverController;

public class SearchDriverDBController implements ISearchDriverController {

	private User user;
	
	public SearchDriverDBController(User user) {
		this.user = user;
	}

	@Override
	public List<Driver> search(Set<Criteria> criterias) {
		return null;
	}

}
