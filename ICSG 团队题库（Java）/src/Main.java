import java.util.Scanner;

public class Main {//主方法所在的类

    public static void main(String[] args)//主方法
    {
        Scanner sc = new Scanner(System.in);//定义扫描器 sc
        Functions functions = new Functions();//实例化 Functions 类的对象 functions

        int first_num = sc.nextInt();//输入第一个数
        int second_num = sc.nextInt();//输入第二个数

        if(functions.judgeNum(first_num, second_num))//输入数据并判断数据是否合法
        {//如果输入的数据合法，则调用 GCD 方法，算出输入的两个数的最大公因数并输出
            System.out.println(functions.GCD(first_num, second_num));
        }
        else{//如果输入的数据不合法，则显示报错信息
            System.out.println("Error:输入数据有误！");
        }
    }
}

class Functions {//定义类 Functions 用以存放一些功能性的方法体
    int Num1;//定义第一个输入的数字
    int Num2;//定义第二个输入的数字

    public boolean judgeNum(int num1,int num2){//判断数据是否合法，即是否都大于零
        if(num1 > 0 && num2 > 0)
        {//如果合法则赋值给全局变量以进行后续操作
            this.Num1 = num1;
            this.Num2 = num2;
            return true;//返回判断结果为合法
        }
        else//如果不合法
        {
            return false;//返回判断结果为非法
        }
    }

    public int GCD(int num1, int num2)//欧几里得算法（辗转相除法）
    {
        int dividend = num1;//定义被除数
        int divisor = num2;//定义除数
        int remainder = dividend % divisor;//定义余数, 并且初始化为较小数使下列循环开始，以避免最大公因数是一个较小数的情况
        while(remainder != 0)
        {
            dividend = divisor;
            divisor = remainder;
            remainder = dividend % divisor;
            if(remainder == 0) break;
        }
        return divisor;
    }
}