package cn.qxb;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @projectName: lambda-stream-demo
 * @author: Qxb
 * @date: 2022/11/27 10:33
 * @description: 员工类
 */
@Data
@AllArgsConstructor
public class Employee {
    //员工id
    private Long id;
    //姓名
    private String name;
    //年龄
    private String age;
    //性别
    private String gender;
    //工资
    private Double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}
