package com.lukasz.mybatisspringbootdemo.shoppinglist;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
interface ShoppingListCommandRepository extends CommandRepository {

    @Override
    @Insert("INSERT INTO SHOPPING_LIST_ITEM (`NAME`, `DESCRIPTION`, `AMOUNT`) VALUES (#{name}, #{description}, #{amount})")
    void create(@Param("name") String name, @Param("description") String description, @Param("amount") int amount);
}
