package com.bjsxt.service;

import com.bjsxt.pojo.MarriedPerson;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bjsxt.pojo.PageResult;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2020-03-20
 */
public interface IMarriedPersonService extends IService<MarriedPerson> {
    //分页加载新人信息
    PageResult<MarriedPerson> selMarriedPersonInfoService(Integer page, Integer rows, String pname, String phone);
}
