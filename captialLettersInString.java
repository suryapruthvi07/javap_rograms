public class captialLettersInString {
    public static void main(String[] args) {
        String str="Bright Path";
        Capital(str);

        
    }

    public static void Capital(String str){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
                System.out.println(str.charAt(i));
            }
        }

    }
}
