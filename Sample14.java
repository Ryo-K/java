/*西暦から元号の判別*/
import java.io.*;



class Sample14

{

    public static void main(String[]args) throws IOException

    {

	System.out.println("西暦年を入力してください。");



        BufferedReader br =
 
	  new BufferedReader(new InputStreamReader(System.in));

	String str = br.readLine();

	int res = Integer.parseInt(str);



	if(res > 1988)

	    System.out.println("H" + (res-1988));

	else if(res > 1925)

	    System.out.println("S" + (res-1925));

	else if(res > 1911)

	    System.out.println("T" + (res-1911));

	else if(res > 1867)

	    System.out.println("M" + (res-1867));

	else 

	    System.out.println("明治時代以前です。");

    }

}