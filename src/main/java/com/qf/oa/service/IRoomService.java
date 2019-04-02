package com.qf.oa.service;

import com.qf.oa.entity.Room;

public interface IRoomService {
    int deleteByPrimaryKey(Long cid);

    int insert(Room record);

    int insertSelective(Room record);

    Room selectByPrimaryKey(Long cid);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);
}