package com.SpringCore.Injection;

import org.springframework.stereotype.Component;

@Component("IndianPhoneNumber")
public class IndianPhoneNumberService implements PhoneNumberService {
	public String getPhoneNumber() {
        return "+91 9876543210";
    }

}
