package top.sceve.service.impl;

import top.sceve.entity.User;
import top.sceve.mapper.UserMapper;
import top.sceve.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LeeSen
 * @since 2022-02-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
