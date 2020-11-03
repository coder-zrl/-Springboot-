package com.example.demo.mapper;

import com.example.demo.pojo.User;
import com.example.demo.pojo.Veg;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Map;

@Mapper
public interface AdmMapper {
    //增加蔬菜
    public  int insertVeg(Veg veg);

    //删除蔬菜
    public int deleteVegByName(String name);

    //修改蔬菜价格
    public int updateVegPrice(Veg veg);

    //查询蔬菜价格
    public String getVegPriceByName(String name);

    //查询密码
    public String getPwdById(String id);

    //用户列表
    public List<User> getUserList();
}
