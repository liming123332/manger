package com.qf.oa.service;

import com.github.pagehelper.PageInfo;
import com.qf.oa.entity.Teacher;

public interface ITeacherService {
    int deleteByPrimaryKey(Long id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    PageInfo getList(Integer pn);
}
