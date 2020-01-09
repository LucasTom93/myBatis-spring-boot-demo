package com.lukasz.mybatisspringbootdemo.shoppinglist;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Mapper
@Repository
@Transactional
interface ShoppingListCommandRepository extends CommandRepository {

    @Override
    @Insert("INSERT INTO SHOPPING_LIST_ITEM (`NAME`, `DESCRIPTION`, `AMOUNT`) VALUES (#{name}, #{description}, #{amount})")
    void create(@Param("name") String name, @Param("description") String description, @Param("amount") int amount);
}
