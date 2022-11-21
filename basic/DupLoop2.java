class DupLoop2 
{
	public static void main(String[] args) 
	{
		/*구구단 중 5단 출력
		5 x 1 = 5
		5 x 2 = 10
		...
		5 x 9 = 45
		*/
		for(int i = 1; i < 10; i++){
			System.out.println("5 x " + i + " = " + (5 * i));			
		}
		System.out.println();
		/*
		2 ~ 4단 출력 - 중첩 for문 이용
		*/

		for(int i = 2; i < 5; i++){
			for(int j = 1; j < 10; j++){
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}

	}
}
