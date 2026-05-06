class Task_5{
    public static void main(String[] args) {
        int a[] = {100,250,355,840,950};
        int b[] = new int[5];
        for(int i=0;i<5;i++)
        {
            b[i] = a[i];
        }
        for(int i=0;i<5;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}