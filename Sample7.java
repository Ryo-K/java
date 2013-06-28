/*後置インクリメント、前置インクリメント
   後置インクリメントは、代入後にインクリメントする
   前置インクリメントは、代入前にインクリメントする*/

class Sample7
{

    public static void main(String[] args)

    {

	int a,b;

	a=3;

	b=a;

	a*=5;

	System.out.println("a=" + a + ",b=" + b);

	b=a++;

	System.out.println("a=" + a + ",b=" + b);

	b=++a;

	System.out.println("a=" + a + ",b=" + b);

    }

}