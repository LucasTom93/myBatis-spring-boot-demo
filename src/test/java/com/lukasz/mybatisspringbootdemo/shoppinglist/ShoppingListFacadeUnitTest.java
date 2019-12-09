package com.lukasz.mybatisspringbootdemo.shoppinglist;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShoppingListFacadeUnitTest {

    private ShoppingListFacade shoppingListFacade;

    @BeforeEach
    void setUp() {
        InMemoryDatabase.DB_MAP.get().clear();
        shoppingListFacade = new ShoppingLIstConfiguration().shoppingListFacade();
    }

    @Test
    void getAllShoppingListItems() {
        //given
        createSimpleItem();
        createSimpleItem();
        createSimpleItem();

        //when
        var shoppingListItemSet = shoppingListFacade.getAllShoppingListItems();

        //then
        assertThat(shoppingListItemSet).hasSize(3);
    }

    @Test
    void createItem() {
        //given //when
        shoppingListFacade.createItem("Cakes", "Sweet pack", 1);

        //then
        assertThat(shoppingListFacade.getAllShoppingListItems()).hasSize(1);

    }

    void createSimpleItem() {
        shoppingListFacade.createItem("Name", "Description", 1);
    }
}