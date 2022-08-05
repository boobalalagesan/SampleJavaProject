package Package01;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		
		
		for(int i=15;i<=100;i++) {
		int count =0;
		for(int j=1;j<=i;j++) {
			//System.out.println(j);
			if(i%j==0) {
				count++;	
			}
		}
		//System.out.println("count is "+count);
			if(count==2) {
				System.out.print(i+",");
			}	
		}

}
}


