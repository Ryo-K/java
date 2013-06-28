/*2つの整数を入力し、その商ただし答えは小数でもよい*/

import java.io.*;



class Sample3
{

    public static void main(String[] args) throws IOException

    {

	System.out.println("2つの整数a,b入力してください");

	BufferedReader br=

	   new BufferedReader(new InputStreamReader(System.in));


	String stra=br.readLine();

	String strb=br.readLine();

	int num1=Integer.parseInt(stra);

	int num2=Integer.parseInt(strb);

	double dnum1=num1;

	double dnum2=num2;

	System.out.println("a÷bの商は" + dnum1/dnum2 + "です。");

    }

}
