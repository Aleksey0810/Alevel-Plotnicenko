package com.plotnichenko.hw11;

public class Service {
public String foundError(Phone phone) {
        if (phone.call() == null) {
        return "Calling fold";
        }
        if (phone.sms() == null) {
        return "SMS fold";
        } else {
        return "All Ok";
        }
}

public void giveMethod(Phone phone) {
        if (phone instanceof Smartphone smartphone) {
                smartphone.serfInternet();
        }
        if (phone instanceof RotaryPhone rotaryPhone) {
                rotaryPhone.app();
        }
        if (phone instanceof CellularPhone cellularPhone) cellularPhone.calculator();
}

public void testPhone(Phone phone) {

        String result = foundError(phone);

        if (result.equals("Calling fold") || result.equals("SMS fold")) {
        System.out.println("Calling or SMS fold");
        phone.app();
        phone.menu();
        phone.call();
        phone.sms();
        giveMethod(phone);
        } else {
        System.out.println("All Ok");

        }
}
}
