

class Ascending_Descending
{
    public static void main(String[] args)
    {
        int a[] = {2,5,3,9,10,45,4,1};  
        int temp = 0; 
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Descending Order...");
        int b[] = {2,5,3,9,10,45,4,1};  
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] < a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }

    }   
}
