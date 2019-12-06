package com.lukasz.mybatisspringbootdemo.shoppinglist;

import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class ShoppingListFacade {

    private final SoppingListQueryRepository soppingListQueryRepository;
    private final ShoppingListCommandRepository shoppingListCommandRepository;

    public ShoppingListFacade(SoppingListQueryRepository soppingListQueryRepository, ShoppingListCommandRepository shoppingListCommandRepository) {
        this.soppingListQueryRepository = soppingListQueryRepository;
        this.shoppingListCommandRepository = shoppingListCommandRepository;
    }

    public Set<ShoppingListItemViewDto> getAllShoppingListItems() {
        return soppingListQueryRepository.findAll();
    }

    public void createItem(String itemName, String itemDescription, int amount) {
        shoppingListCommandRepository.create(itemName, itemDescription, amount);
    }
}
