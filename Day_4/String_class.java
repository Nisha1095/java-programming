class String_class
{
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Everyone";
        String s3 = "hello";

        //Inspection Methods
        System.out.println("Length of String1: "+s1.length());  //Length of the String
        System.out.println("Length of String2: "+s2.length());
        System.out.println(s1.isEmpty());
        System.out.println(s1.isBlank());

        //Comparision Methods
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.contains("ell"));

        //Extraction Methods
        System.out.println(s2.charAt(5));
        System.out.println(s1.substring(1));
        System.out.println(s2.substring(1,5));
        System.out.println(s1.indexOf('l'));
        System.out.println(s1.indexOf('k'));
        System.out.println(s2.indexOf(1,5));
        System.out.println(s1.lastIndexOf('l'));
        System.out.println(s1.startsWith("He")); 
        System.out.println(s1.startsWith("he")); 
        System.out.println(s1.endsWith("o")); 
        System.out.println(s1.endsWith("ghy")); 

        //Modification Methods
        String s4 = "  Hello World   ";
        System.out.println(s4.trim());
        System.out.println(s4.strip());
        System.out.println(s4.replace('l','L'));
        System.out.println(s4.repeat(3));
        System.out.println(s4.toUpperCase());
        System.out.println(s4.toLowerCase());      
    }
}