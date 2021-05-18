package com.mybatis_plus.mybatisplus;


import com.Modle.User;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ken.role.entity.Role;
import com.ken.role.mapper.RoleMapper;
import com.mapper.UserMapper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class MybatisplusApplicationTests {



    @Autowired
    UserMapper userMapper;



    @Test
    void contextLoads() {


        List<User> roleList = userMapper.selectList(null);



        roleList.forEach((v)->{
            System.out.println(v);
        });


    }



    @Test

    void addUser(){


        User user = new User();

        user.setName("Fjhs");
        user.setAge(20);
        user.setEmail("73492948@qq.com");
        user.setId(24);


        Integer insert = userMapper.insert(user);

        System.out.println(insert);



    }

    @Test

    void upUser(){


        User user = new User();

        user.setId(1);
        user.setName("Yhhhs");


        int i = userMapper.updateById(user);


        System.out.println(i);
    }





//    自动填充
    @Test

       void fillfun(){


        System.out.println("");


    }



//    Mybatis Plus分页并且读取所有数据

    @Test



    void selectByPage(){


        Page<User> userPage = new Page<>(1,2);
        Page<User> userIPage = userMapper.selectPage(userPage, null);


        System.out.println(userIPage.getSize());

        System.out.println(userIPage.getCurrent());

        System.out.println(userIPage.getPages());


        System.out.println(userIPage.getTotal());


        System.out.println("hasNext"+userIPage.hasNext());


        List<User> userList = userIPage.getRecords();



        userList.forEach((v)->{


            System.out.println(v);


            System.out.println(v.getName());
        });


    }






    @Autowired

    RoleMapper roleMapper;


    @Test

    void  getAllRoles(){


        System.out.println("1");


        List<Map<String, Object>> mapList = roleMapper.testReturnListMap();



        System.out.println("解析成Json对象");


        JSONArray json_arr=new JSONArray();
        for (Map<String, Object> map : mapList) {
            JSONObject json_obj=new JSONObject();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                try {
                    json_obj.put(key,value);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            json_arr.put(json_obj);
        }
        System.out.println(json_arr.toString());




        /*System.out.println("解析成Json对象");

        for (Map<String, Object> m :mapList){
            String s = new JSONObject(m).toString();


            System.out.println(s);


        }*/


    }



    @Test

    void getRolesById(){


        List<Map<String, Object>> lis = roleMapper.testReturnListMapById(2);


        System.out.println("记录数："+lis.size());

        JSONArray json_arr=new JSONArray();


        for (Map<String, Object> li : lis) {


            JSONObject jsonObject = new JSONObject();

            for (Map.Entry<String, Object> entry : li.entrySet()) {


                try {
                    System.out.println(entry.getKey());
                    System.out.println(entry.getValue());
                    jsonObject.put(entry.getKey(),  entry.getValue());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }


            json_arr.put(jsonObject);


        }
        System.out.println(json_arr.toString());



    }


@Test
    void getRolesByPro(){


        List<Map<String, Object>> lis = roleMapper.exePro(5);


        System.out.println("记录数："+lis.size());

        JSONArray json_arr=new JSONArray();


        for (Map<String, Object> li : lis) {


            JSONObject jsonObject = new JSONObject();

            for (Map.Entry<String, Object> entry : li.entrySet()) {


                try {
                    System.out.println(entry.getKey());
                    System.out.println(entry.getValue());
                    jsonObject.put(entry.getKey(),  entry.getValue());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }


            json_arr.put(jsonObject);


        }
        System.out.println(json_arr.toString());



    }





@Test


    void getRolesByPro2(){


    Role role = new Role();

    role.setName("人事专员");
    role.setId(5);
    List<Map<String, Object>> lis = roleMapper.exeProByName(role);


        System.out.println("记录数："+lis.size());

        JSONArray json_arr=new JSONArray();


        for (Map<String, Object> li : lis) {


            JSONObject jsonObject = new JSONObject();

            for (Map.Entry<String, Object> entry : li.entrySet()) {


                try {
                    System.out.println(entry.getKey());
                    System.out.println(entry.getValue());
                    jsonObject.put(entry.getKey(),  entry.getValue());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }


            json_arr.put(jsonObject);


        }
        System.out.println(json_arr.toString());



    }























}
