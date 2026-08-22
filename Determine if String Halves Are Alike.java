class Solution {
    public boolean halvesAreAlike(String s) {
        int A=0;
        int B=0;
        int n=s.length();
        String vowel="aeiouAEIOU";
        for(int i=0;i<n/2;i++){
            if(vowel.indexOf(s.charAt(i))!=-1){
                B++;
            }
        }
         for(int i=n/2;i<n;i++){
            if(vowel.indexOf(s.charAt(i))!=-1){
                A++;
            }
         }
         return A==B;
        
    }
}
