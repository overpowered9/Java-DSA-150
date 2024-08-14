public class removeelement {
    public static void main(String[] args) {
        int[] array={1,2,3,4};
        int a=2;
        int i=0;
        for(int j=0; j<array.length;j++){
            if (array[j]==a) {
                array[j]=array[j+1];
            }

        }
    }
}
