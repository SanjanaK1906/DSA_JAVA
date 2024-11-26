package data_structure.assignment.array_assignment;
import java.io.*;
import java.util.Scanner;
public class Matrix_multi {
	static int [][]mat1= {{1,2,3},{4,5,6}};
	int [][]mat2;
	int row2;
	int col2;
	int row1=mat1.length;
	int col1=mat1[0].length;
	int[][]mulres;// Number of rows in mat1,Number of columns in mat2
	int [][]addres;
	int [][]transarr;
	
	static Scanner sc= new Scanner(System.in);
//	create matrix 
	void creatematrix(int row,int col) {
		this.row2=row;
		this.col2=col;
		mat2=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("enter value for arr ["+i+"] ["+j+"] ");
				mat2[i][j]=sc.nextInt();
			}
		}
	}
//	display according to mannual input else check for row and col value of mat 1 as it is defined by us here we are considering both matrix are of 2*3(r*c)
	void display(int[][]arr) { 
		for(int i=0;i<arr.length;i++) { //row
			for(int j=0;j<arr[0].length;j++) {//column
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	void multiplymatr(int[][]mat1,int[][]mat2) {
//		int common=mat1[0].length; //**no of col of mat1= no of row of mat2  //same as col1
		mulres=new int[row1][col2]; // result - Number of rows in mat1,Number of columns in mat2
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				mulres[i][j] = 0;
				for(int k=0;k<col1;k++) {
					mulres[i][j]+=mat1[i][k]*mat2[k][j];
				}
			}
		}
		
	}
	//mat1.length = row of mat1 ; mat1[0].length =col of mat1
	//for addition of two matrix size of both matrix is same
	void addmatrix(int[][]mat1,int[][]mat2) {
		addres=new int[mat1.length][mat1[0].length];
		if(mat1.length==mat2.length && mat1[0].length ==mat2[0].length) {
			for(int i=0;i<mat1.length;i++) { //row
				for(int j=0;j<mat1[0].length;j++) {//col
					addres[i][j]=mat1[i][j]+mat2[i][j];
				}
			}
		}
	}
	
	//transpose transarr [col of mat][row of mat];
	void transposematrix(int[][]mat) {
		transarr=new int[mat[0].length][mat.length];
		for(int i=0;i<mat1.length;i++) { //row
			for(int j=0;j<mat1[0].length;j++) {//col
				transarr[j][i]=mat[i][j];
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Multiplication
		System.out.println("multiplication logic --");
		Matrix_multi m1= new Matrix_multi();
		m1.creatematrix(3, 3);
		System.out.println("display matrix 1");
		m1.display(mat1);
		System.out.println("display matrix 2");
		m1.display(m1.mat2);
		System.out.println("multiplay mat1*mat2");
		m1.multiplymatr(mat1, m1.mat2);
		m1.display(m1.mulres);
		
		
		//addition
		System.out.println("addition  logic --");
		System.out.println("add m1.mat1+mat2");
		Matrix_multi m2= new Matrix_multi();
		m2.creatematrix(2, 3);
		System.out.println("display matrix 3");
		m2.display(m2.mat2);
		System.out.println("add matrix 1+ matrix 3");
		m2.addmatrix(mat1, m2.mat2);
		m2.display(m2.addres);
		
		//transpose
		m1.transposematrix(mat1);
		System.out.println("matrix 1");
		m1.display(mat1);
		System.out.println(" transpose of matrix 1");
		m1.display(m1.transarr);
		
	}

}
