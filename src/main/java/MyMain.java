import java.util.Arrays;

public class MyMain {

    // Rotates all values in an array to the left
    // Ex. rotateLeft([1, 2, 3, 4, 5]) => [2, 3, 4, 5, 1]
    public static int[] rotateLeft(int[] arr) {
        int[] roleft = new int[arr.length];
        int count = 0;
        for(int i = 1;i<arr.length;i++){
            roleft[count]=arr[i];
            count++;
        }
        roleft[roleft.length-1]=arr[0];
        return roleft;
    }

    // Rotates all values in an array to the right
    // Ex. rotateRight([1, 2, 3, 4, 5]) => [5, 1, 2, 3, 4]
    public static int[] rotateRight(int[] arr) {
        int[] roright = new int[arr.length];
        int count = 0;
        for(int i = 1;i<arr.length;i++){
            roright[i]=arr[count];
            count++;
        }
        roright[0]=arr[arr.length-1];
        return roright;
    }

    // Replaces all duplicate values with -1
    // Ex. duplicateReplacer([1, 2, 1, 2, 1, 1]) => [1, 2, -1, -1, -1, -1]
    public static int[] duplicateReplacer(int[] arr) {
        int[] nodupes = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            nodupes[i]=arr[i];
            for(int j = 0;j<arr.length;j++){
                if(i!=j&&arr[i]==nodupes[j])
                    nodupes[i]=-1;
            }
            System.out.println(nodupes[i]);
        }
        return nodupes;
    }


    public static void main(String[] args) {
        System.out.println(duplicateReplacer(new int[] {1, 2, 1, 2, 1, 1}));
    }
}
