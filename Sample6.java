/*小数の入力と出力*/

import java.io.*;



class Sample6
{

    public static void main (String[] args)throws IOException

    {

	System.out.println("円周率の値はいくつですか？");

	BufferedReader br =

	    new BufferedReader(new InputStreamReader(System.in));


	String str1 = br.readLine();


	double num1 = Double.parseDouble(str1);


	System.out.println("円周率の値は" + (num1) + "です。");

    }

}