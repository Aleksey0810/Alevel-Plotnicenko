package com.plotnichenko.modul2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Product {
    private String series, screenType;
    private int price;
}