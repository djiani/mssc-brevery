package virtusa.com.msscbrevery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import virtusa.com.msscbrevery.web.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerServices {

	@Override
	public Customer getCustomerById(UUID customerId) {
		
		return Customer.builder()
				.id(UUID.randomUUID())
				.name("sam")
				.build();
	}

}
