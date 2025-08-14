package com.SpringCore.Injection;

import org.springframework.stereotype.Component;

@Component("usNumber")
public class USPhoneNumberService implements PhoneNumberService {
	 @Override
	    public String getPhoneNumber() {
	        return "+1 555-123-4567";
	    }

	
}
