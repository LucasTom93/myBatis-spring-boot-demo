package com.lukasz.mybatisspringbootdemo.shoppinglist;

import java.util.Set;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
interface SoppingListQueryRepository extends QueryRepository {

    @Override
    @Select("SELECT * FROM SHOPPING_LIST_ITEM")
    Set<ShoppingListItemViewDto> findAll();
}
