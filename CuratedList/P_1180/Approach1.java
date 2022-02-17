package P_1180;

public class Approach1 {
    public int countLetters(String s) {
        if(s.length() == 0 || s == null){
            return 0;
        }
        
        int count = 1;
        int[] substring = new int[s.length()];
        substring[0] = 1;
        
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                substring[i] = substring[i-1] + 1;
            }
            else {
                substring[i] = 1;
            }
            count += substring[i];
        }
        return count;
    }
}

/**
TC = O(N)
SC = O(N) --> for creaitng extra array

Approach :

Eg: s = "aaaabbaccc"
    int[] arr = [1], count = 1

    s =  a  a  a  a  b  b  a  c  c  c   
            i
    Since s.charAt(i) == s.charAt(i-1), we insert arr[1] = arr[0]+1. And count = arr[1]+count = 3
    arr = [1  2 ]

    s =  a  a  a  a  b  b  a  c  c  c   
               i
    Since s.charAt(i) == s.charAt(i-1), we insert arr[2] = arr[1]+1. And count = arr[2]+count = 6
    arr = [1  2  3]

    s =  a  a  a  a  b  b  a  c  c  c   
                  i
    Since s.charAt(i) == s.charAt(i-1), we insert arr[3] = arr[2]+1. And count = arr[3]+count = 10
    arr = [1  2  3  4]

    s =  a  a  a  a  b  b  a  c  c  c   
                     i
    Since s.charAt(i) != s.charAt(i-1), we insert arr[4] = 1. And count = arr[4]+count = 11
    arr = [1  2  3  4  1]


    s =  a  a  a  a  b  b  a  c  c  c   
                        i
    Since s.charAt(i) == s.charAt(i-1), we insert arr[5] = arr[4]+1. And count = arr[5]+count = 13
    arr = [1  2  3  4  1  2]

    Slly we continue & at the end we get count.


    



 */
