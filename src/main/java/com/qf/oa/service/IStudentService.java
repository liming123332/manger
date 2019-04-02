package com.qf.oa.service;

import com.github.pagehelper.PageInfo;
import com.qf.oa.entity.Student;

import java.util.List;

public interface IStudentService {
    int deleteByPrimaryKey(Long id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    PageInfo <Student> selectAll(String currentPage);
}
