package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.dto.DishDto;
import com.itheima.reggie.pojo.Dish;

public interface DishService extends IService<Dish> {

    //新增菜品，同时插入菜品对应的口味数据，需要操作2张表，dish，dish_flavor
    public void saveWithFlavor(DishDto dishDto);

    //根据id查询菜品信息对应的口味信息
    public DishDto getByIdWihFlavor(Long id);

    //根据id修改菜品和口味
    public void updateWithFlavor(DishDto dishDto);
}
