package com.junruyue.simple.mapper;

import com.junruyue.simple.model.SysRole;
import com.junruyue.simple.model.SysUser;

import java.util.List;

public interface UserMapper {

    SysUser selectById(Long id);

    List<SysUser> selectAll();

    List<SysRole> selectRolesById(long id);
}
