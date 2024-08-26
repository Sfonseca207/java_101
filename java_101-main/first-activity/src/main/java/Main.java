public class Main {
	public int addTwoNumbers(int a, int b) {

		return a + b;
	}

	public int multiplyTwoNumbers(int a, int b) {

		return a * b;
	}

	public float divideTwoNumbers(int a, int b) {

		return a / b;
	}

	public int substractTwoNumbers(int a, int b) {

		return a - b;

	}

	public boolean isNumberEven(int a){

		if(a % 2 == 0){

			return true;

		}else{

			return false;

		}
		
	}

	public int calculateFirstRightDigit(int a){
		
		if(a < 0){

			a = a * - 1;

			return a % 10;

		}else if(a > 0){

			return a % 10;

		}

		return a;

	}

	public float celciusToFahrenheit(float a){

		return a * 9/5 + 32;
		
	}

	public float areaOfATriangle(float height, float base){

		return base * height / 2;


	}

	public boolean isLeapYear(int year){

		if(year % 4 == 0){

			return true;

		}else if(year % 100 == 0 && year % 400 == 0){

			return true;

		}else{

			return false;

		}
		
	}

    public boolean isPrime(int number) {
		
		int x = 0;

		for(int i = 1; i <= number; i++){

			if(number % i == 0){

				x = x + 1;

			}

		}

		if(x == 2){
			
			return true;

		}else{

			return false;

		}

		

    }

    public int calculateFactorial(int number){

		int x = number;

		if(number == 0){

			return 1;

		}

		for(int i = 1; i < number; i++){

			x = x * i;

		}

		return x;
		

    }

    public int calculateLastNFibonnacci(int n){

		int x = 0;
		int y = 1;
		int z;

		for(int i = 1; i < n; i++){

			z = x;
			x = y;
			y = y + z;

		}

		return y;
		

    }

    public int getNumberOfDigits(int number){

		int x = 0;

		while(number > 0){

			number = Math.floorDiv(number, 10);

			x = x + 1;


		}

		return x;
		
    }



    public int rotateNumber(int number){

		int x = 0;
		int y = 0;

		while(number > 0){

			y = number % 10;
			x = x * 10 + y;
			number = Math.floorDiv(number, 10);


		}

		return x;



    }

    public int sumOffirstNNumbersMultiplesOfFiveOrThree(int N){

		int x = 0;

		for(int i = 1; i <= N; i++){

			if(i % 3 == 0 || i % 5 == 0){

				x = x + i;

			}

		}

		return x;

    }
}