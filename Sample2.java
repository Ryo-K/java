/*2つの整数を入力し、その商と余りただし答えは整数*/

import java.io.*;



class Sample2
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

	System.out.println("a÷bの商は" + num1/num2 + "です。");

	System.out.println("a÷bの余りは" + num1%num2 + "です。");

    }

}
