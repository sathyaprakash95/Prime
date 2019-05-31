class Prime {

    public static void main(String[] args) {

        int A = 20, B = 200;

        while (A<B) {
            boolean flag = false;

            for(int i = 2; i <= A/2; ++i) {
           
                if(A % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.print(A + "This are all prime number");

            ++A;
        }
    }
}