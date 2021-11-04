public class Tutorial
{

	public static void main(String[] args){
		
		int size = 10;
		int sum = 0;
		int[] x = foo(size);
		
		for(int i=0;i<size;i++){
			x[i] = i;
			sum = sum + i;
		}
		
		System.out.println("Sum is "+sum+".");
	}


	/* foo2
	* 
	* Description:
	* Returns an array of given size
	* 
	* Arguments:
	* -int size
	*
	* Return
	* -int[size] 
	*/
	public static int[] foo2(int size){
		return new int[size];
	}
	/*
	public static int bar({
	int one = 1;
	int two = 2;
	for(int i=0;i<10;i++{
	one = one+two;
	two = two+one;
	return two;
	*/
	
	/*
	public static int bar(){
	int one = 1;
	int two = 2;
	for(int i=0;i<10;i++{
	one = one+two;
	two = two+one;
	}
	return two;
	}
	*/
	
	public static int bar(){
		int one = 1;
		int two = 2;
		for(int i=0;i<10;i++{
			one = one+two;
			two = two+one;
		}
		return two;
	}
}