class NullPointer
{
    public static void main(String[] args)
    {
        String student_name = null;  
        try{
            System.out.println(student_name.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("Student name is not available");          
        }
    }
}