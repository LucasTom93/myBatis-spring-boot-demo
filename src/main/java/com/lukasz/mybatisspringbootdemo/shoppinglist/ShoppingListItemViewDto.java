package com.lukasz.mybatisspringbootdemo.shoppinglist;

class ShoppingListItemViewDto {

    private String name;
    private int amount;

    ShoppingListItemViewDto() {
        //for Jackson
    }

    private ShoppingListItemViewDto(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    static ShoppingListItemViewDto of(String name, int amount) {
        return new ShoppingListItemViewDto(name, amount);
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
}
