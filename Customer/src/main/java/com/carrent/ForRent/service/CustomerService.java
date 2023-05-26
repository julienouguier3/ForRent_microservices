package com.carrent.ForRent.service;

import java.util.Calendar;

public class CustomerService implements ICustomerService {

    @Override
    public Integer ageOfCustomer(Calendar birthDate) {
        Calendar calendar = Calendar.getInstance();
        int birthYear = birthDate.get(Calendar.YEAR);
        int birthMonth = birthDate.get(Calendar.MONTH);
        int birthday = birthDate.get(Calendar.DAY_OF_MONTH);
        return birthday + birthMonth + birthYear;
    }
}
