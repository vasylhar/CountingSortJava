
// Implementation of CountingSort algorithm

public class CountingSort {

public static int[] CountingSort(int[] input){
    int min = 0; 
    int max = input.length-1;
    
    // defining max as maximum from input array would make algorithm work faster 
    // but defining max will require sorting in itself - hence length(n)-1 is used
    
    int[] count= new int[max - min + 1];
	for(int number : input){
		count[number - min]++;
	}
	int temp= 0;
	for(int i= min;i <= max;i++){
		while(count[i - min] > 0){
			input[temp]= i;
			temp++;
			count[i - min]--;
		}
	}
    return input;
}

	public static void main(String[] args) {
        
		int input[]={9,8,7,6,5,4,3,2,1,0};
		int output[] = new CountingSort().CountingSort(input);
        for(int i=0;i<output.length;i++){
    		System.out.print(output[i]);
		}
	}
}
