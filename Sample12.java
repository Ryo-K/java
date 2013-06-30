/*0.0～1.0の小数を入力し、入力した数字が0.5より大きいと「あたり」。
  入力した数字が0.5以下だと「はずれ」。

import java.io.*;



class Sample12
{

    public static void main(String[]args) throws IOException

    {

	System.out.println("0.0～1.0 の少数を入力してください。");


        BufferedReader br =
 
	  new BufferedReader(new InputStreamReader(System.in));

	String str = br.readLine();

	double res = Double.parseDouble(str);


	String ans = (res > 0.5) ? "あたり" : "はずれ" ;

	System.out.println(ans);

    }

}