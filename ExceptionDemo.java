class ExceptionDemo
{
		 public static void main (String [] args){
		 try{
			 String s1=args[0];
			 String s2=args[1];
			 int n1=Integer.parseInt(s1);
			 int n2=Integer.parseInt(s2);
			 int n3=n1/n2;
			 System.out.println ("Division= "+n3);
		 }
		 catch (ArithmeticException Ae){
		 
		 System.out.println ("Don't enter zero for denominator");
		 }
		 catch (NumberFormatException Nfe){
		 
		 System.out.println ("Pass only interger values");
		 }
		 catch (ArrayIndexOutOfBoundsException abe){
		 
		 System.out.println ("Pass data from command prompt");
		 }
		 finally{
		 
		 System.out.println ("I AM FROM FINALLY...");
		}
	}
}