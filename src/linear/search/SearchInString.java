package linear.search;

public class SearchInString {
//basically find the character in the given
//string of the input and keep track of the time complexity
    public static void main(String[] args){
        String name = "jayesh";
        char target = 's';
        System.out.println(search(name, target));
    }
    static boolean search(String name, char target){
        if(name.isEmpty()){ //Here we can directly change the name.length() == 0 into name.isEmpty()
            return false;
        }
        else{
            for(char ch : name.toCharArray()){
                if(ch == target){
                    System.out.println("in progress");
                    return true;
                }

            }
        }

        return false;
    }
}
