class ForestRunner{
	
	static public void main (String[] arge){
		
	 System.out.println(Forest.name);
	 System.out.println(Forest.totalarea);
     System.out.println(Forest.location);
	 System.out.println(Forest.establish);
	 
	 
		 for(int index=0;index<Forest.primaryanimals.length;index++)
		 {
			 String ref=Forest.primaryanimals[index];
			 System.out.println("accessing animals at index: "+index+" value: "+ref);
		 }
		 
		 
		 Forest.name = "amazon";
		 Forest.totalarea = 520;
		 Forest.location = "u.s.a";
		 Forest.establish = 1000;
		 
		 
	 	 System.out.println(Forest.name);
	     System.out.println(Forest.totalarea);
         System.out.println(Forest.location);
	     System.out.println(Forest.establish);
	}
}