public class T200301 {
	public static void main(String[] args) {
		double x = 2.0;
		int y = 4;
		x /= ++y;
		System.out.println(x); 
	}

	public static void main8(String[] args) {
		short a = 128;
		byte b = (byte) a;
		System.out.println(a);//128
		System.out.println(b);//-128
	}

	public static void main7(String[] args) {
        System.out.println("\\\"hello\\\"");//  \"hallo\"
	}

	public static void main6(String[] args) {
		//逻辑运算符的操作数和返回值都是boolean;
		//&& 和 || 支持短路求值(只算前半部分）；
		boolean num1 = true;
		boolean num2 = false;
		System.out.println(num1 && num2);//false

		int a = 1;
		int b = 2;
		System.out.println(a<b && a>b);//false
	}
	public static void main5(String[] args) {
		//关系运算符
		//关系运算符的返回值都是boolean类型
		int a = 10;
		int b = 20;
		System.out.println(a == b);//false
		System.out.println(a != b);//true
		System.out.println(a < b);//true
		System.out.println(a > b);//false
		System.out.println(a <= b);//true
		System.out.println(a >= b);//false
	}
	public static void main4(String[] args) {
		int i = 10;
		int a = i++;//a=i;i=i+1;
		System.out.println(a);//10
		System.out.println(i);//11
	}

	public static void main3(String[] args) {
		int i = 10;
		i = i++;
		System.out.println(i);//java中：10   C中：11
		//System.out.println(a);
	}

	public static void main2(String[] args) {
        int i = 10;
        int a = ++i;//i=i+1;a=i
		System.out.println(a);//11
		System.out.println(i);//11  
	}

	public static void main1(String[] args) {
		//在java中，除数不能为0；
		System.out.println(10%3);//1
		System.out.println(10%-3);//1
		System.out.println(-10%3);//-1
		System.out.println(-10%-3);//-1
	}
}