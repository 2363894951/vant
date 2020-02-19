package com.api.mapper;

import com.api.module.mis_manager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface mis_managerMapper {
    @Select("SELECT * FROM mis_manager")
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "address", column = "addres"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "subject", column = "subject"),
            @Result(property = "class1", column = "class"),
            @Result(property = "logDate", column = "logDate"),
            @Result(property = "remarks", column = "remarks")

    })
    List<mis_manager> getAll();
    @Select("SELECT count(*) FROM mis_manager")
    int getCount();
}
