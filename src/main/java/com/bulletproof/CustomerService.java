package com.bulletproof;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class CustomerService {

    @RequestMapping(value = "/rest/customer", method = RequestMethod.POST)
    public String getAllCustomers() {
	return CsvJsonApplication.jsonCustomer.toString();
    }

}
