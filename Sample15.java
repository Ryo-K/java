/*閏年の判別*/
import java.io.*;



class Sample15

{

    public static void main(String[]args) throws IOException

    {

	System.out.println("西暦年を入力してください。");


        BufferedReader br =
 
	  new BufferedReader(new InputStreamReader(System.in));

	String str = br.readLine();

	int res = Integer.parseInt(str);



	if(res%400 == 0)

	    System.out.println("閏年");

	else if(res%100 == 0)

	    System.out.println("閏年ではない");

	else if(res%4 == 0)

	    System.out.println("閏年");

	else
 
	    System.out.println("閏年ではない");

    }

}