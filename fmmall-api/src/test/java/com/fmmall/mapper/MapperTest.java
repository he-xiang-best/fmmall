package com.fmmall.mapper;

import com.fmmall.FmmallApplication;
import com.fmmall.entity.Users;
import com.fmmall.service.UsersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author: 何翔
 * @date: 2022/7/8
 * @description:
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FmmallApplication.class)
public class MapperTest {

   @Autowired
   private UsersService usersService;

   @Test
   public void testUsers(){
      List<Users> users = usersService.list();
      users.forEach(System.out::println);
   }


}
