package cn.qxb;

import org.junit.Test;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @projectName: lambda-stream-demo
 * @author: Qxb
 * @date: 2022/11/27 10:30
 * @description: 集合测试类
 */

public class ListTest {
    @Test
    public void test1() throws Exception{
        //按照员工工资是否大于6000分为两部分
        Map<Boolean, List<Employee>> collect = EmployeeService.getEmployeeList().stream().collect(Collectors.partitioningBy(employee -> employee.getSalary() > 6000));
        //得到一个map
        System.out.println(collect);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        Set<Boolean> booleans = collect.keySet();
       /* List<Employee> list = collect.get(false);
        list.forEach(System.out::println);*/
        //遍历拿到所有数据
        booleans.forEach(b->{
            System.out.println(b);
            List<Employee> list = collect.get(b);
            list.forEach(System.out::println);
        });
    }

    @Test
    public void test2() throws Exception{
//        EmployeeService.getEmployeeList().stream().map(employee -> employee.getGender()).forEach(System.out::println);
        List<Employee> list = EmployeeService.getEmployeeList();
        //排序前遍历
        list.forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++");
        //排序操作
        Collections.sort(list,(e1,e2)->{
            int i = e1.getAge().compareTo(e2.getAge());
            if (i == 0) {
               // System.out.println(1);
                return e1.getSalary().compareTo(e2.getSalary());
            }
            return i;
        });
        //排序后遍历
        list.forEach(System.out::println);
    }
    @Test
    public void test3() throws Exception{
        String strf = LambdaTest.getUpLower("abcdefg", str -> str.toUpperCase().substring(2, 4));
        System.out.println(strf);
    }
    @Test
    public void test4() throws Exception{
        Long sumTwo = LambdaTest.getSumTwo(45L, l -> l);
        System.out.println(sumTwo);
    }
}
