package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CustomerMapper {
//    //查询蔬菜价格
//    @Select("select price from test.veg where name=#{name}")
//    public int selectVegPrice(String name);
//
    //查询个人密码
    @Select("select pwd from test.user where account=#{account}")
    public String getPwdById(String id);

    //修改个人信息

    //修改密码

}
