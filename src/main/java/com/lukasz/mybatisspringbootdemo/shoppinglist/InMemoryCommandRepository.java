package com.lukasz.mybatisspringbootdemo.shoppinglist;

import java.util.List;
import java.util.stream.Collectors;

class InMemoryCommandRepository implements CommandRepository {

    @Override
    public void create(String name, String description, int amount) {
        List<Long> sortedIds = InMemoryDatabase.DB_MAP.get().keySet().stream().sorted().collect(Collectors.toList());
        long nextId = 1L;
        if (!sortedIds.isEmpty()) {
            nextId = sortedIds.get(sortedIds.size() - 1) + 1L;
        }

        ShoppingListItem newItem = new ShoppingListItem();
        newItem.setId(nextId);
        newItem.setName(name);
        newItem.setDescription(description);
        newItem.setAmount(amount);
        InMemoryDatabase.DB_MAP.get().putIfAbsent(nextId, newItem);
    }
}
