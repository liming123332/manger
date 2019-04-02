package com.qf.oa.mapper;
import com.qf.oa.entity.Room;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class RoomMapperTest {

    @Autowired(required = false)
    private RoomMapper roomMapper;

    @Test
    public void test1(){
        Room room=new Room();
        //room.setCid(Long.parseLong("1"));
        room.setCname("java1810");
        roomMapper.insertSelective(room);
    }
    @Test
    public void test2(){
       Room room= roomMapper.selectByPrimaryKey(Long.parseLong("2"));
        System.out.println(room.getCname());
    }


}