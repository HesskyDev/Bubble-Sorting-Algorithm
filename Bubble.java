package Sorting;

public class Bubble {
	
	static void bubbleSort(int numbers[]) {
		
		int n = numbers.length;
		int temp = 0;
		
		for(int i = 0; i < n; i++) {
			
			for(int j = 1; j < (n-i); j++) {
				
				if(numbers[j-1] > numbers[j]) {
				
					temp = numbers[j-1];
					numbers[j-1] = numbers[j];
					numbers[j] = temp;
				
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		int numbers[] = {8, 7, 3, 4, 5, 6, 2, 16, 12, 13, 15, 1, 14, 117, 111, 121, 122, 125, 1256, 1275, 12784, 578921, 5981, 169857, 1968, 18957, 15798, 189756, 856231, 185, 693, 185, 8935,372, 753, 80369, 3852, 8357, 3857,904586};
		
		String before = "";
		String after = "";
		
		System.out.println("Array Before Bubble Sorting");
		
		for(int i = 0; i < numbers.length; i++) {
			
			before += (numbers[i] + " ");
			
		}
		
		System.out.println(before);
		System.out.println();
		
		bubbleSort(numbers);
		
		System.out.println("Array After Bubble Sorting");
		
		for(int i = 0; i < numbers.length; i++) {
			
			after += (numbers[i] + " ");
			
		}
		
		System.out.println(after);
		
	}
	
}
