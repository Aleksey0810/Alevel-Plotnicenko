package com.plotnichenko.modul2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class Main {
        public static void main(String[] args) throws IncorrectStringExc {
        ShopService shopService = new ShopService();
        shopService.startShopService("target/invoices.log", 15);
        Map<LocalDateTime, Invoice> invoiceMap = shopService.getInvoiceMap();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss:SSS");
        invoiceMap.forEach((x, y) -> System.out.printf("[%s]=[%s]\n", x.format(formatter), y));

        Analytics.printNumbersSoldPhones(invoiceMap);
        Analytics.printNumbersSoldTelevisions(invoiceMap);
        Analytics.printSmallestInvoice(invoiceMap,shopService);
        Analytics.printSumOfAllPurchases(invoiceMap,shopService);
        Analytics.printQuantityRetails(invoiceMap);
        Analytics.printInvoicesWithOneTypeProducts(invoiceMap);
        Analytics.printFirstThreeInvoices(invoiceMap);
        Analytics.printLowAgeInvoices(invoiceMap);
        Analytics.Sorter(invoiceMap, shopService);
    }
    }
