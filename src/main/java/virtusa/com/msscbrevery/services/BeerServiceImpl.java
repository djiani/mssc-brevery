package virtusa.com.msscbrevery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import virtusa.com.msscbrevery.web.model.BeerDto;

@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {
		
		return BeerDto.builder().id(UUID.randomUUID())
				.beerName("Galaxy Cat")
				.beerStyle("Pale Ale")
				.build();
	}

}
