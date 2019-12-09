package com.lukasz.mybatisspringbootdemo.shoppinglist;

interface CommandRepository {

    void create(String name, String description, int amount);
}
