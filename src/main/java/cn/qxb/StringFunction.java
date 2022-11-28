package cn.qxb;

/**
 * @projectName: lambda-stream-demo
 * @author: Qxb
 * @date: 2022/11/27 14:58
 * @description: 函数式接口Student
 * ①声明函数式接口接口中声明抽象方法 ：public String getValue(String str);
 * ②声明类LambdaTest，类中编写方法使用接口作为参数，将一个字符串转换成大写，并作为方法的返回值。
 * ③再将一个字符串的第2个到第4个索引位置进行截取子串。
 */
@FunctionalInterface
public interface StringFunction {
    public String getValue(String str);
}
