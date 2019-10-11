package com.b3c2bab2.mpdemo;

import com.b3c2bab2.mpdemo.mapper.EmployeeMapper;
import com.b3c2bab2.mpdemo.model.EmployeePO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
//@SpringBootTest(properties = {"spring.datasource.url=?", "spring.datasource.username=?", "spring.datasource.password=?"})
public class MpDemoApplicationTests {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    public void select() {
        employeeMapper.selectList(null).forEach(System.out::println);
    }

    @Test
    public void delete() {
        int count = employeeMapper.selectCount(null);
        int randomId = (int) (Math.random() * count) + 1;
        System.out.println(employeeMapper.deleteById(randomId));
    }

    @Test
    public void update() {
        int count = employeeMapper.selectCount(null);
//        int randomId = (int) (Math.random() * count) + 1;
        int randomId = 1;
        System.out.println("id: " + randomId);
        System.out.println("before: " + employeeMapper.selectById(randomId));
        EmployeePO entity = new EmployeePO();
        entity.setDepartmentId((int) (Math.random() * 10) + 1);
        entity.setId(randomId);
        entity.setName(String.valueOf((char) (Math.random() * 26 + 'a')));
        entity.setSalary(new BigDecimal(Math.random() * 10 + 1));
        entity.setDeleted(0);
        employeeMapper.updateById(entity);
        System.out.println("after: " + employeeMapper.selectById(randomId));
    }

    @Test
    public void insert() {
        EmployeePO entity = new EmployeePO();
        entity.setDepartmentId((int) (Math.random() * 10) + 1);
        entity.setName(String.valueOf((char) (Math.random() * 26 + 'a')));
        entity.setSalary(new BigDecimal(Math.random() * 10 + 1));
        entity.setDeleted(0);
        employeeMapper.insert(entity);
        System.out.println(employeeMapper.selectById(employeeMapper.selectCount(null)));
    }
}
