public class teststring {

    public static void main(String[] args)
    {
        String s1 = "tstr1";
        String s2 = "tstr1";
        String s3 = new String("tstr1");

        System.out.println((s1==s2)? "true":"false");
        System.out.println((s1==s3)? "true":"false");
        System.out.println((s2==s3)? "true":"false");
        System.out.println((s1.equals(s2))? "true":"false");
        System.out.println((s1.equals(s3))? "true":"false");

    }

}
