package virtusa.com.msscbrevery.services;

import java.util.UUID;

import virtusa.com.msscbrevery.web.model.Customer;

public interface CustomerServices {
	
	public Customer getCustomerById(UUID customerId);
}
