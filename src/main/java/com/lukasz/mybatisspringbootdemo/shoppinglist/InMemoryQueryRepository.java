package com.lukasz.mybatisspringbootdemo.shoppinglist;

import java.util.Set;
import java.util.stream.Collectors;

class InMemoryQueryRepository implements QueryRepository {

    @Override
    public Set<ShoppingListItemViewDto> findAll() {
        return InMemoryDatabase.DB_MAP
                .get()
                .values()
                .stream()
                .map(entity -> ShoppingListItemViewDto.of(entity.getName(), entity.getAmount()))
                .collect(Collectors.toSet());
    }
}
