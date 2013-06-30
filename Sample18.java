/*コンピュータが引き算の問題を出してそれの合否*/

import java.io.*;



class Sample18

{
 
   public static void main(String[]args) throws IOException

    {

	int inum1 = (int)(Math.random()*100);

	int inum2 = (int)(Math.random()*100);

	System.out.print(inum1 + "-" + inum2 + "=");



        BufferedReader br =
 
	  new BufferedReader(new InputStreamReader(System.in));



	String str = br.readLine();

	int res = Integer.parseInt(str);

	

if (res == inum1-inum2)

	    System.out.println("正解です。");
	
else 

	    System.out.println("不正解です。答えは" + (inum1-inum2) + "です。");

    }

}