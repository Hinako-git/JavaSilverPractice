public class Question3_13 {
    public static void main (String[] args){
        String a = new String("sample");
        String b = "sample";
        System.out.println(a == b);
        System.out.println(",");
        System.out.println(a.equals(b));
    }
}
//1つ目→参照が違うのでfalse
//2つ目→Stringのequals()メソッドは,参照の他に文字列が同じか確認するメソッドをオーバーライドしているのでtrue