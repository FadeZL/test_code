package junit;
 
public class CalculatorTest {
	
	public int add(int a,int b) {
		return a + b;
	};
	
	public int subtract(int a,int b) {
		return a - b;
	};
	
	public int multiply(int a,int b) {
		return a * b;
	};
	
	public long divide(int a,int b) throws Exception{
		
		if(b == 0) {
			throw new Exception("��������Ϊ0!");
		}
		else {
		    return (long)(a/b);
		}
	};


public static void main(String[] args)
{
    CalculatorTest test=new CalculatorTest();
    System.out.println("�ӷ����㣺"+test.add(12, 13));
    System.out.println("�������㣺"+test.subtract(18, 2));
    System.out.println("�˷����㣺"+test.multiply(2, 6));
    try {
		System.out.println("�������㣺"+test.divide(4, 4));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}

