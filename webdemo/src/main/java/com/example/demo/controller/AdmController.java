package com.example.demo.controller;

import com.example.demo.mapper.AdmMapper;
import com.example.demo.pojo.Veg;
import com.example.demo.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class AdmController {
@Autowired
private  AdmMapper mapper;

    //添加蔬菜
    @RequestMapping(value = "/addveg/{name}{price}",method = RequestMethod.GET)
    public String insertVeg(@RequestParam("name") String name,@RequestParam("price") double price){  //@PathVariable("id") 取出路径变量

        int res = mapper.insertVeg(new Veg(name,price));
        if (res>0){
            System.out.println("添加成功！");
        }
        return "添加蔬菜成功";
    }

    //删除蔬菜
    @RequestMapping(value = "/deleteveg/{name}",method = RequestMethod.GET)
    public String deleteVegByName(@RequestParam("name") String name){  //@PathVariable("id") 取出路径变量
        SqlSession sqSession = MybatisUtils.getSqSession();
        AdmMapper mapper = sqSession.getMapper(AdmMapper.class);

        int res = mapper.deleteVegByName(name);
        if (res>0){
            System.out.println("删除蔬菜成功");
        }
        sqSession.commit();
        sqSession.close();
        return "删除蔬菜成功";
    }

    //修改蔬菜价格
    @RequestMapping(value = "/updatevegprice",method = RequestMethod.GET)
    public String updateVegPrice(@RequestParam("name") String name,@RequestParam("price") double price){  //@PathVariable("id") 取出路径变量
        SqlSession sqSession = MybatisUtils.getSqSession();
        AdmMapper mapper = sqSession.getMapper(AdmMapper.class);
        int res = mapper.updateVegPrice(new Veg(name,price));
        sqSession.commit();
        sqSession.close();
        return "修改价格成功";
    }

    //查询蔬菜价格---->myabatis
    @RequestMapping(value = "/selectveg",method= RequestMethod.GET)
    public String getPriceByName(@RequestParam("name") String name){  //@PathVariable("id") 取出路径变量
        SqlSession sqSession = MybatisUtils.getSqSession();
        AdmMapper mapper = sqSession.getMapper(AdmMapper.class);
        String price = mapper.getVegPriceByName(name);
        sqSession.commit();
        sqSession.close();
        return String.valueOf(price);
    }
}
