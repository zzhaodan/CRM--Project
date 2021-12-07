package com.zhaodan.blog.api.service.impl;

import com.zhaodan.blog.api.entity.User;
import com.zhaodan.blog.api.mapper.UserMapper;
import com.zhaodan.blog.api.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhaodan
 * @since 2021-12-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
