/*入力された数字の範囲を表示*/

import java.io.*;



class Sample11
{

    public static void main(String[]args) throws IOException

    {

	System.out.println("正の整数を入力してください");



        BufferedReader br =
 
	  new BufferedReader(new InputStreamReader(System.in));

	String str = br.readLine();

	int res = Integer.parseInt(str);


	if (res >=0 && res <= 9){

	    System.out.println("入力された数は0以上9以下の整数です。");

	}

	else if(res >=10 && res <=19){

	    System.out.println("入力された数は10以上19以下の整数です。");

	}

	else {

	    System.out.println("入力された数は20以上の整数です。");

	}

    }

}