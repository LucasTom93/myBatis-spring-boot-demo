package com.lukasz.mybatisspringbootdemo.shoppinglist;

import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shoppingList")
class ShoppingListController {

    private final ShoppingListFacade shoppingListFacade;

    public ShoppingListController(ShoppingListFacade shoppingListFacade) {
        this.shoppingListFacade = shoppingListFacade;
    }

    @GetMapping("/all")
    Set<ShoppingListItemViewDto> getAll() {
        return shoppingListFacade.getAllShoppingListItems();
    }

    @PostMapping
    void create(@RequestBody ShoppingListItemCreateDto shoppingListItemCreateDto) {
        var itemName = shoppingListItemCreateDto.getName();
        var itemDescription = shoppingListItemCreateDto.getDescription();
        var amount = shoppingListItemCreateDto.getAmount();
        shoppingListFacade.createItem(itemName, itemDescription, amount);
    }
}
