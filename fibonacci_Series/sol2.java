class sol2 {
    public int fib(int n){
        if(n==0){
            return 0;
        }else if (n==1){
            return 1;
        }else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {
        //  1 1 2 3 5 8 13
        int num=5;
        sol2 m1 = new sol2();
        for (int i = 1; i < num; i++) {
            System.out.print(m1.fib(i) + " ");
        }
    }
}
