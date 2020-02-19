package com.api.service.impl;

import com.api.mapper.mis_managerMapper;
import com.api.module.mis_manager;
import com.api.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private mis_managerMapper mis_managerMapper;

    public List<mis_manager> getList(){

       return  mis_managerMapper.getAll();
    }
    public     int getCount(){
        return  mis_managerMapper.getCount();
    }


}
