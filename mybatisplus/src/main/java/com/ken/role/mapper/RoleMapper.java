package com.ken.role.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ken.role.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**

 * @author ken
 * @since 2021-05-16
 */

@Mapper
public interface RoleMapper extends BaseMapper<Role> {


    /**
     *
     * 查询所有的Role
     *
     * @return
     */
    List<Map<String, Object>> testReturnListMap() ;


    /**
     *
     * 通过ID查询记录
     * @param id
     * @return
     */
    List<Map<String,Object>>  testReturnListMapById(@Param("id") Integer id);



    /**
     *
     * 通过ID查询记录
     * @param id
     * @return
     */
    List<Map<String, Object>> exePro(@Param("id") Integer id);


    /**
     * 通过ID查询记录
     * @param role
     * @return
     */

    @DS("master")
    List<Map<String, Object>> exeProByName(Role role);



}
