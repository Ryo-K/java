/*２つの整数を入力した足し算、引き算、掛け算、割り算、剰余*/

import java.io.*;



class Sample5
{

    public static void main (String[] args)throws IOException

    {

	System.out.println("整数2つを入力してください。");

	BufferedReader br =

	    new BufferedReader(new InputStreamReader(System.in));


	String str1 = br.readLine();

	String str2 = br.readLine();


	int num1 = Integer.parseInt(str1);

	int num2 = Integer.parseInt(str2);


	System.out.println("足し算の結果は" + (num1+num2) + "です。");

	System.out.println("引き算の結果は" + (num1-num2) + "です。");

	System.out.println("掛け算の結果は" + (num1*num2) + "です。");

	double dnum1 = num1;

	double dnum2 = num2;

 	System.out.println("割り算の結果は" + (dnum1/dnum2) + "です。");

	System.out.println("剰余は" + (num1%num2) + "です。");

    }

}