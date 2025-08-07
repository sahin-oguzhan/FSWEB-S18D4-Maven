package com.workintech.s18d1.util;

import com.workintech.s18d1.entity.BreadType;
import com.workintech.s18d1.entity.Burger;
import com.workintech.s18d1.exceptions.BurgerException;
import org.springframework.http.HttpStatus;

public class BurgerValidation {
    public static void idIsValid(long id){
        if (id < 0) {
            throw new BurgerException("ID Cannot be less than 0!", HttpStatus.BAD_REQUEST);
        }
    }

    public static void checkId(long id, Burger burger) {
        if (burger == null) {
            throw new BurgerException("No matching found with ID: " + id, HttpStatus.NOT_FOUND);
        }
    }

    public static void burgerIsNull(Burger burger) {
        if (burger == null) {
            throw new BurgerException("Burger cannot be null!", HttpStatus.BAD_REQUEST);
        }
    }

    public static void priceIsValid(double price) {
        if (price < 0) {
            throw new BurgerException("Price cannot be less than 0!", HttpStatus.BAD_REQUEST);
        }
    }

}
