package com.lukasz.mybatisspringbootdemo.shoppinglist;

import java.util.Set;

public class ShoppingListFacade {

    private final QueryRepository queryRepository;
    private final CommandRepository commandRepository;

    public ShoppingListFacade(QueryRepository queryRepository, CommandRepository commandRepository) {
        this.queryRepository = queryRepository;
        this.commandRepository = commandRepository;
    }

    public Set<ShoppingListItemViewDto> getAllShoppingListItems() {
        return queryRepository.findAll();
    }

    public void createItem(String itemName, String itemDescription, int amount) {
        commandRepository.create(itemName, itemDescription, amount);
    }
}
