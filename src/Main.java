// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String str=in.nextLine();

            String []str1=str.split(" ");
            String []s1=str1[0].split("[.]");

            String[]s2=str1[1].split("[.]");

            String[]s3=new String[3];

            if(Integer.valueOf(s2[2])>=Integer.valueOf(s1[2]))
            {
                s3[2]=String.valueOf(Integer.valueOf(s2[2])-Integer.valueOf(s1[2]));
            }else{
                s3[2]=String.valueOf(29+Integer.valueOf(s2[2])-Integer.valueOf(s1[2]));
                s2[1]=String.valueOf(Integer.valueOf(s2[1])-1);
            }
            if(Integer.valueOf(s2[1])>=Integer.valueOf(s1[1]))
            {
                s3[1]=String.valueOf(Integer.valueOf(s2[1])-Integer.valueOf(s1[1]));
            }else{
                s3[1]=String.valueOf(17+Integer.valueOf(s2[1])-Integer.valueOf(s1[1]));
                s2[0]=String.valueOf(Integer.valueOf(s2[0])-1);
            }
            if(Integer.valueOf(s2[0])>=Integer.valueOf(s1[0]))
            {
                s3[0]=String.valueOf(Integer.valueOf(s2[0])-Integer.valueOf(s1[0]));
            }else{
                s3[0]=String.valueOf(+Integer.valueOf(s2[0])-Integer.valueOf(s1[0]));
            }
            for (int i = 0; i <3-1 ; i++) {
                System.out.print(s3[i]);
                System.out.print(".");
            }
            System.out.print(s3[2]);
        }
    }
}
