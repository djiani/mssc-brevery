package virtusa.com.msscbrevery.services;

import java.util.UUID;

import virtusa.com.msscbrevery.web.model.BeerDto;

public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {
		
		return BeerDto.builder().id(UUID.randomUUID())
				.beerName("Galaxy Cat")
				.beerStyle("Pale Ale")
				.build();
	}

}
