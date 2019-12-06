package com.lukasz.mybatisspringbootdemo.shoppinglist;

class ShoppingListItemViewDto {

    private String name;
    private int amount;

    ShoppingListItemViewDto() {
        //for Jackson
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
}
