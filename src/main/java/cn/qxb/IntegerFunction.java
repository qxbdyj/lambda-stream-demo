package cn.qxb;

/**
 * @projectName: lambda-stream-demo
 * @author: Qxb
 * @date: 2022/11/27 15:30
 * @description: ①声明一个带两个泛型的函数式接口，泛型类型为<T,R>:T为参数，R为返回值。
 * ②接口中声明对应抽象方法
 * ③在LambdaTest类中声明方法，使用接口作为参数，计算两个long型参数的和。
 * ④再计算两个long型参数的乘积
 */
@FunctionalInterface
public interface IntegerFunction<T,R>{
    //抽象方法求和
    public R getSum(T t);
    //默认方法
    default String getValue(){
       return "System.out.println()";
    }
}
