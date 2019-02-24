package com.nmefc.hpcmmp.service.management;

import com.nmefc.hpcmmp.entity.management.User;
import com.nmefc.hpcmmp.entity.management.UserExample;
import com.nmefc.hpcmmp.service.BaseService;

import java.util.List;

/**
 * @Author: QuYuan
 * @Description:
 * @Date: Created in 9:53 2019/2/22
 * @Modified By:
 */
public interface UserService extends BaseService<User,UserExample,Integer>{
    /**
     * @description: 查询账号是否唯一
     * @author: QuYuan
     * @date: 21:36 2019/2/24
     * @param: [user, example]
     * @return: java.util.List<com.nmefc.hpcmmp.entity.management.User>
     */
    List<User> accountDetected(User user);
}
