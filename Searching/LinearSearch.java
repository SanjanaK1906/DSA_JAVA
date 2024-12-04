package data_structure.Searching;
//linear or sequencial search
//time complexity- 
//best case - O(1)      worstcase- O(n)     avgcase -O(n)
public class LinearSearch {

	public void lsearch(int[]num,int searchval) {
		int index=0;//searching index
		while(index<num.length && num[index]!=searchval) {  //increase index until value found or till last index
			index++;
		}
		if (index==num.length) { //value not found
//			return -1;
			System.out.println("Value "+searchval+" not found");
		}else { //value found
//			return index; 
			System.out.println("Value "+searchval+" found at index "+index);
		}
	}
	
	
	public static void main(String[] args) { 
		LinearSearch l1= new LinearSearch();
		int [] num;
		num= new int[]{1,4,5,6,8,34,67,2,56,90}; 
		l1.lsearch(num, 56);
		l1.lsearch(num, 5);
		l1.lsearch(num, 7);
	}

}
