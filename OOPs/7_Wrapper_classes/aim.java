
public class aim {
    //Java मधील काही ठिकाणी object लागतो, primitive चालत नाही
    //त्यासाठी wrapper class वापरतो, primitive ला object मध्ये convert करतो
    // Allow to use a Collection freamework into static context
    public static void main(String[] args) {

        //AutoBoxing
        Integer a = 10;
        Character ch = 'A';
        Double d = 3.14;
        Float f = 2.5f;
        Boolean b = true;
        
        //UnBoxing
        int x = a; // Integer to int
        char c = ch; // Character to char       
        double y = d; // Double to double
        float g = f; // Float to float
        boolean bool = b; // Boolean to boolean

        // tostring method

        String str1 = a.toString();
        String str2 = ch.toString();
        String str3 = d.toString();             
        String str4 = f.toString();
        String str5 = b.toString(); 
          
        String s = str1+str2+str3+str4+str5;
        System.out.println(s);
    
}
}