package virtusa.com.msscbrevery.web.controller;

import java.util.UUID;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import virtusa.com.msscbrevery.services.BeerService;
import virtusa.com.msscbrevery.web.model.BeerDto;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {
	
	
	private final BeerService beerService;
	
	
	public BeerController(BeerService beerService) {
		super();
		this.beerService = beerService;
	}


	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){
		return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
		
	}

}
