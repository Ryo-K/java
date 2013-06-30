/*コンピュータとのじゃんけん*/

import java.io.*;



class Sample17
{

    public static void main(String[]args) throws IOException

    {

	System.out.println("グー(0),チョキ(1),パー(2)のどれを出すか決めてください。");



        BufferedReader br =
 
	  new BufferedReader(new InputStreamReader(System.in));

	String str = br.readLine();

	int res = Integer.parseInt(str);


	
int inum = (int)(Math.random()*3);



	if (inum == 0)

	    System.out.println("コンピュータはグーを出しました。");
	
else if (inum == 1)

	    System.out.println("コンピュータはチョキを出しました。");

	else
 
	    System.out.println("コンピュータはパーを出しました。");


	
if(inum == res)

	    System.out.println("あいこ");

	else if(inum-res == 1 || inum-res == -2)

	    System.out.println("あなたの勝ちです。");

	else 

	    System.out.println("コンピューターの勝ちです。");

    }

}