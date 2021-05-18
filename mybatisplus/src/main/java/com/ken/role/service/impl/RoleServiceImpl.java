package com.ken.role.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ken.role.entity.Role;
import com.ken.role.mapper.RoleMapper;
import com.ken.role.service.RoleService;
import org.springframework.stereotype.Service;

/**

 *
 * @author ken
 * @since 2021-05-16
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {


/*@Autowired
RoleMapper roleMapper;


    public List<Map<String, Object>> ReturnListMap(int id) {


        System.out.println(roleMapper.testReturnListMap().size());

        return roleMapper.testReturnListMap();


    }*/


}
