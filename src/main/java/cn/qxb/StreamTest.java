package cn.qxb;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @projectName: lambda-stream-demo
 * @author: Qxb
 * @date: 2022/11/27 15:56
 * @description: stream测试
 */
public class StreamTest {
    @Test

    public void test1() throws Exception{
        List<Integer> collect = Arrays.asList(1, 2, 3, 4, 5).stream().map(num -> num * num).collect(Collectors.toList());
        System.out.println(collect);
    }
    @Test
    public void test2() throws Exception{
        long count = EmployeeService.getEmployeeList().stream().count();
        System.out.println(count);
        /*(sa1, sa2) -> {
           return Double.sum(sa1, sa2);
        }*/
        Optional<Double> sum = EmployeeService.getEmployeeList().stream().map(/*e -> e.getSalary()*/Employee::getSalary).reduce(Double::sum);
        System.out.println(sum);
    }
}
