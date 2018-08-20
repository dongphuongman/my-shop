package com.fengdu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fengdu.dao.ApiAddressMapper;
import com.fengdu.entity.AddressVo;

import java.util.List;
import java.util.Map;


@Service
public class ApiAddressService {
    @Autowired
    private ApiAddressMapper addressDao;


    public AddressVo queryObject(Integer id) {
        return addressDao.queryObject(id);
    }


    public List<AddressVo> queryList(Map<String, Object> map) {
        return addressDao.queryList(map);
    }


    public int queryTotal(Map<String, Object> map) {
        return addressDao.queryTotal(map);
    }


    public void save(AddressVo address) {
        addressDao.save(address);
    }


    public void update(AddressVo address) {
        addressDao.update(address);
    }


    public void delete(Integer id) {
        addressDao.delete(id);
    }


    public void deleteBatch(Integer[] ids) {
        addressDao.deleteBatch(ids);
    }

}
