package com.qf.oa.mapper;

import com.qf.oa.entity.Room;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface RoomMapper {
    int deleteByPrimaryKey(Long cid);

    int insert(Room record);

    int insertSelective(Room record);

    Room selectByPrimaryKey(Long cid);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);
}