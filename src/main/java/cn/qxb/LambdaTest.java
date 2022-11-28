package cn.qxb;


/**
 * @projectName: lambda-stream-demo
 * @author: Qxb
 * @date: 2022/11/27 15:04
 * @description: 声明类LambdaTest，类中编写方法使用接口作为参数，将一个字符串转换成大写，并作为方法的返回值。再将一个字符串的第2个到第4个索引位置进行截取子串。
 */
public class LambdaTest {
    public static String getUpLower(String str,StringFunction sf){
        return sf.getValue(str);
    }
    public static Long getSumTwo(Long l,IntegerFunction it){
       return (Long) it.getSum(l);
    }
}
