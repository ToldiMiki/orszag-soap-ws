package com.toldi.soapws;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import toldi.soapws.gs_toldi_soap_ws.Country;
import toldi.soapws.gs_toldi_soap_ws.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
	private static final Map<String, Country> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
		Country hungary = new Country();
		hungary.setId("HU");
		hungary.setName("Magyarország");
		hungary.setCapital("BudaPest");
		hungary.setCurrency(Currency.HUF);
		hungary.setPopulation(9841587);

		countries.put(hungary.getName(), hungary);

		Country poland = new Country();
		poland.setId("PL");
		poland.setName("Lengyelország");
		poland.setCapital("Varsó");
		poland.setCurrency(Currency.PLN);
		poland.setPopulation(38186860);

		countries.put(poland.getName(), poland);

		Country uk = new Country();
		uk.setName("Anglia");
		uk.setCapital("London");
		uk.setCurrency(Currency.GBP);
		uk.setPopulation(63705000);

		countries.put(uk.getName(), uk);

		Country spain = new Country();
		spain.setName("Spanyolország");
		spain.setCapital("Madrid");
		spain.setCurrency(Currency.EUR);
		spain.setPopulation(46704314);

		countries.put(spain.getName(), spain);
	}

	public Country findCountry(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return countries.get(name);
	}
}
