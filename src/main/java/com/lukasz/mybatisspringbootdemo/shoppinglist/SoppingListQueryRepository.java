package com.lukasz.mybatisspringbootdemo.shoppinglist;

import java.util.Set;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Mapper
@Repository
@Transactional
interface SoppingListQueryRepository extends QueryRepository {

    @Override
    @Select("SELECT * FROM SHOPPING_LIST_ITEM")
    Set<ShoppingListItemViewDto> findAll();
}
