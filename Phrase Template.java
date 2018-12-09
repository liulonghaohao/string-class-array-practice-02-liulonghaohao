public class Phrase
{
    private static String currentPhrase;

    /** Constructs a new Phrase object. */
    public Phrase(String p)
    {
         currentPhrase = p;
    }

    /** Returns the index of the nth occurrence of str in the current phrase;
     *  returns -1 if the nth occurrence does not exist.
     *  Precondition: str.length() > 0 and n > 0
     *  Postcondition: the current phrase is not modified.
     */
    public static int findNthOccurrence(String str, int n)
    { int loc = currentPhrase.indexOf(str);
     int i=1;
     int s=(currentPrase. substring(loc+1)).indexOf(str);
     while(i<n&&!a=-1){
    loc=(currentPrase. substring(loc+1)).indexOf(str)+1;
     i+1;
         s=(currentPrase. substring(loc+1)).indexOf(str);
     }
                
       
        return loc;
    }

    /** Modifies the current phrase by replacing the nth occurrence of str with repl.
     *  If the nth occurrence does not exist, the current phrase is unchanged.
     *  Precondition: str.length() > 0 and n > 0
     */
    public void replaceNthOccurrence(String str, int n, String repl)
    {
        if(currentPhrase.findNthOccrrence(str,n)==-1){
            str=str;
        }
        if(currentPhrase.findNthOccurrence(str,n)!=-1){
            str=str.substring(0,n)+repl+str.substring(n+currentPhrase.length(),str.length());
                                                      }
    }

    /** Return the index of the last occurrence of str in the current phrase;
     *  returns -1 if str is not found.
     *  Precondition: str.length() > 0
     *  Postcondition: the current phrase is not modified.
     */
    public int findLastOccurrence(String str)
    {
       int n = 1;
      while(findNthOccurrence(str,n) != -1){
      n++;
      }
      return findNthOccurrence(str,n-1);
              
    }
    /** Returns a string containing the current phrase */
    public String toString(){
        return currentPhrase;
    }
    public static void main(String[] args)
    {

    }
}
