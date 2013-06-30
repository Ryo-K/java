/*血液型の判別*/

import java.io.*;



class Sample13
{

    public static void main(String[]args) throws IOException

    {

	System.out.println("大文字を２つ入力してください。");



        BufferedReader br = 

	  new BufferedReader(new InputStreamReader(System.in));

	String str = br.readLine();

	char res1 = str.charAt(0);

	char res2 = str.charAt(1);


	if(res1 == 'A' && res2 == 'O' || res1 == 'O' && res2 == 'A'|| res1 == 'A' && res2 ==  'A')

	    System.out.println("A型");

	else if(res1 == 'B' && res2 == 'O' || res1 == 'O' && res2 == 'B'|| res1 == 'B' && res2 ==  'B')

	    System.out.println("B型");
	else if(res1 == 'A' && res2 == 'B' || res1 == 'B' && res2 == 'A')

	    System.out.println("AB型");
	else if(res1 == 'O' && res2 == 'O')

	    System.out.println("O型");

	else
 
	    System.out.println("回答不能");

    }

}