class large
  {
    public static void main(String args[])
     {
       int[] a={5,4,3,8,12,45,85,96,100};
       int large=0;
        large=a[0];
       int secl=0;
       for(int i:a)
         {
            
             if(i>large)
             large=i;
           
          }
       System.out.println("largest " + large);
	for(int i:a)
          {
            if(i>large)
               {  
                  secl=large;  
                  large=i;
               }
            else if(i>secl && i!=large)
              {  
 		 secl=i;
		}
          }
        System.out.println("second largest " + secl);
      
    }
}