package virtusa.com.msscbrevery.services;

import java.util.UUID;

import virtusa.com.msscbrevery.web.model.BeerDto;

public interface BeerService {

	public BeerDto getBeerById(UUID beerId);

}
