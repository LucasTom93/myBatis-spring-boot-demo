package com.lukasz.mybatisspringbootdemo.shoppinglist;

import java.util.Set;

interface QueryRepository {

    Set<ShoppingListItemViewDto> findAll();
}
