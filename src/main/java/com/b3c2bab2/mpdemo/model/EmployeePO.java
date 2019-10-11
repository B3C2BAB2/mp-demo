package com.b3c2bab2.mpdemo.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author b3c2bab2
 * created on 2019/10/10
 */
@TableName("EMPLOYEE")
public class EmployeePO implements Serializable {
    @TableId
    private int id;
    private String name;
    private BigDecimal salary;
    private int departmentId;
    @TableLogic
    private Integer deleted;

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "EmployeePO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", departmentId=" + departmentId +
                ", deleted=" + deleted +
                '}';
    }
}
