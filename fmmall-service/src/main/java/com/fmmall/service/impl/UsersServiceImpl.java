package com.fmmall.service.impl;

import com.fmmall.entity.Users;
import com.fmmall.mapper.UsersMapper;
import com.fmmall.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户  服务实现类
 * </p>
 *
 * @author 何翔
 * @since 2022-07-08
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

}
