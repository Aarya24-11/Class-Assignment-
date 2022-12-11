
public class OneTwoPattern {

	public static void main(String[] args) {
		int k, i, j,
		number= 0;
		k=6;
		for(i=1; i <= k; i++){
		for(j=1; j <= i; ++j){
		System.out.print(number);
		++number;
		}
		System.out.print("\n");
		}
		

	}

}
