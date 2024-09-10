package september;

public class September_10{
    public static void main(String...args) {
        
        String a ="abc";
        String b = new String(a);
        
        int count = 0;
        if(a.intern() == "abc") {
            count++;
        }
        if(b.intern() == "abc") {
            count++;
        }
        if(a.intern() == b.intern()){
            count++;
        }
        // 出力3
        //3つすべて「参照」を確認してる？
        System.out.println(count);
    
    }
}