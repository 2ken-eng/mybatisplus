package com.ken.role.controller;


import com.ken.role.mapper.RoleMapper;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**

 *
 * @author ken
 * @since 2021-05-16
 */
@RestController
//@RequestMapping("/role")
public class RoleController {





    @Autowired
    RoleMapper roleMapper;



    @RequestMapping("/getAllRoles")

    public String getAllRoles()
    {
//        throw  new MyException("异常了》。。。");



        List<Map<String, Object>> mapList = roleMapper.testReturnListMap();

            JSONArray json_arr=new JSONArray();


            for (Map<String, Object> li : mapList) {


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


            return json_arr.toString();



    }
}

