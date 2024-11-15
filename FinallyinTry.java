/*Java Finally Block 
--> in java the finally block is always executed no matter whether there is exception or not, this block is optional and for each try block there can be only one finally block.

Syntax:-
try
{
	----
	----
	----
}
catch(Exception e)
{
	----
	----
	----
}
finally
{
	----
	----
	----
}*/

public class FinallyinTry {
    public static void main(String[] args) {
        int i=0;
        String greetings[]={"Java Programming",
        "Python","Angular"};
        while(i<3){
            try{
                System.out.println(greetings[i++]);
            }
            catch(Exception e){
                System.out.println(e.toString());
                //Message of exception e in String format
            }
            finally{
                System.out.println("You should quit and reset index value < 3");
            }
        }//while()
    }//main
}//class