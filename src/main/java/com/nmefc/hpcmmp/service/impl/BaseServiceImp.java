package com.nmefc.hpcmmp.service.impl;

import com.nmefc.hpcmmp.dao.BaseMapper;
import com.nmefc.hpcmmp.exception.ServiceException;
import com.nmefc.hpcmmp.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: QuYuan
 * @Description: 公共Service实现方法抽取
 * @Date: Created in 9:57 2019/2/22
 * @Modified By:
 */

public abstract class BaseServiceImp<T,E,PK extends Serializable> implements BaseService<T,E,PK> {
    @Autowired
    private BaseMapper<T,E,PK> baseMapper;

    @Override
    public int deleteByPrimaryKey(PK pk) {
        return 0;
    }

    @Override
    public int insert(T record) {
        return 0;
    }

    @Override
    public int insertSelective(T record) throws ServiceException {
        int row = 0;
        try{
            row = baseMapper.insertSelective(record);
        }catch (Exception e){
            throw  new ServiceException("Insert Exception in Service :" + e.getMessage());
        }

        return row;
    }

    @Override
    public T selectByPrimaryKey(PK pk) throws ServiceException {
            return baseMapper.selectByPrimaryKey(pk);
    }

    @Override
    public int updateByPrimaryKeySelective(T record) throws ServiceException{
        int row = 0;
        try{
            row  = baseMapper.updateByPrimaryKeySelective(record);
        }catch (Exception e){
            throw  new ServiceException("update exception in Service ：" + e.getMessage());
        }
        return row;
    }

    @Override
    public int updateByPrimaryKey(T record) {
        return 0;
    }

    @Override
    public long countByExample(E example) {
        return 0;
    }

    @Override
    public int deleteByExample(E example) {
        return 0;
    }

    @Override
    public List<T> selectByExample(E example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(T record, E example) {
        return 0;
    }

    @Override
    public int updateByExample(T record, E example) {
        return 0;
    }


}
