package cn.qxb;

import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: lambda-stream-demo
 * @author: Qxb
 * @date: 2022/11/27 10:39
 * @description: 获取employ集合类
 */
public class EmployeeService {

   /*
   * @author: Qxb
   * @date: 11:21 2022/11/27
   * @param: []
   * @return: java.util.List<cn.qxb.Employee>
   * @description: 获取一个员工集合
   */
   public static List<Employee> getEmployeeList(){
       //创建一个list集合用于装employee
      List<Employee> list=new ArrayList<>();
      //创建employee对象
       Employee employee1 = new Employee(1L, "张三", "23", "男", 5700.09);
       Employee employee2 = new Employee(2L, "李四", "32", "女", 7600.09);
       Employee employee3 = new Employee(3L, "王麻子", "26", "男", 7700.09);
       Employee employee4 = new Employee(4L, "张海", "32", "女", 9000.09);
       Employee employee5 = new Employee(5L, "张飞", "37", "男", 8800.09);
       Employee employee6 = new Employee(6L, "关羽", "28", "男", 5000.09);
       //将employee对象装到list集合中
       list.add(employee1);
       list.add(employee2);
       list.add(employee3);
       list.add(employee4);
       list.add(employee5);
       list.add(employee6);
       return list;
   }
}
