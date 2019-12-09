package com.lukasz.mybatisspringbootdemo.shoppinglist;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class InMemoryDatabase {

    static final ThreadLocal<Map<Long, ShoppingListItem>> DB_MAP = ThreadLocal.withInitial(ConcurrentHashMap::new);
}
