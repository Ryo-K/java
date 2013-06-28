/*“ü—Í‚µ‚½•¶Žš‚Ì•\Ž¦*/

import java.io.*;

class Sample1
{
    public static void main(String[] args) throws IOException
    {
	System.out.println("Please input your name");
	BufferedReader br=
	   new BufferedReader(new InputStreamReader(System.in));

	String str=br.readLine();
	System.out.println("You are " + str + ". ");
    }
}
