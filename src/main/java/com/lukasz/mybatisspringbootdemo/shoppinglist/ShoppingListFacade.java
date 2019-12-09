package com.lukasz.mybatisspringbootdemo.shoppinglist;

import java.util.Set;

public class ShoppingListFacade {

    private final QueryRepository soppingListQueryRepository;
    private final CommandRepository shoppingListCommandRepository;

    public ShoppingListFacade(QueryRepository queryRepository, CommandRepository commandRepository) {
        this.soppingListQueryRepository = queryRepository;
        this.shoppingListCommandRepository = commandRepository;
    }

    public Set<ShoppingListItemViewDto> getAllShoppingListItems() {
        return soppingListQueryRepository.findAll();
    }

    public void createItem(String itemName, String itemDescription, int amount) {
        shoppingListCommandRepository.create(itemName, itemDescription, amount);
    }
}
