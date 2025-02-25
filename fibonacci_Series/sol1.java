class sol1 {
    public static void main(String[] args) {
        //  1 1 2 3 5 8 13
        int num=10;
        int n=0; int n1=1 ; int next;
        System.out.println(n1 );
        for(int i=0;i<num;i++){
            next = n1+n;
            System.out.println(next); //1
            n=n1;
            n1=next;
        }
    }
}
