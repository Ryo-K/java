/*干支の判別*/

import java.io.*;



class Sample16

{

    public static void main(String[]args) throws IOException

    {

	System.out.println("西暦年を入力してください。");



        BufferedReader br =
 
	  new BufferedReader(new InputStreamReader(System.in));

	String str = br.readLine();

	int res = Integer.parseInt(str);



	switch(res%12) {

	case 0:

	    System.out.println("申");

	    break;

	case 1:

	    System.out.println("酉");

	    break;

	case 2:

	    System.out.println("戌");

	    break;

	case 3:

	    System.out.println("亥");

	    break;

	case 4:

	    System.out.println("子");

	    break;

	case 5:

	    System.out.println("丑");

	    break;

	case 6:

	    System.out.println("寅");

	    break;

	case 7:

	    System.out.println("卯");

	    break;

	case 8:

	    System.out.println("辰");

	    break;

	case 9:

	    System.out.println("巳");

	    break;

	case 10:

	    System.out.println("午");

	    break;

	case 11:

	    System.out.println("羊");

	    break;

	}

    }

}