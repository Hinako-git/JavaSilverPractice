package september;
//pacage は小文字なので注意。
public class September_09 {

    public static void main(String[] args){
        int[] array = new int[0];
        System.out.println(array);
    }
}

// System.out.println(array); とすると、配列の中身ではなく、その配列のハッシュコード（16進数）が表示される。
// [I@<ハッシュコード> のような形で出力される。この <ハッシュコード> が配列のハッシュコードです。配列の中身を表示したい場合は、Arrays.toString(array) を使う。
// 出力 [I@2ff4acd0