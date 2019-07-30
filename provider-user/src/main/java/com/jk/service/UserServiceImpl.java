package com.jk.service;





import com.jk.mapper.SysPermissionMapper;
import com.jk.mapper.SysUserMapper;
import com.jk.model.SysPermission;
import com.jk.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserMapper userMapper;

    @Autowired
    private SysPermissionMapper permissionMapper;

    public SysUser findUserByUsername(String username){

        return userMapper.findUserByUsername(username);
    }

    public List<SysPermission> findMenuByUserId(String id){
        return permissionMapper.findMenuByUserId(id);
    }

    @Override
    public List<SysPermission> findPermissionByUserId(String id) {
        return permissionMapper.findPermissionByUserId(id);
    }

}
