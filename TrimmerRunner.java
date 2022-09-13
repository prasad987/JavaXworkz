class TrimmerRunner{
	
	public static void main(String[] blade){
		
		System.out.println(Trimmer.brand);
		System.out.println(Trimmer.color);
		System.out.println(Trimmer.price);
		System.out.println(Trimmer.working);
		System.out.println(Trimmer.warranty);
		
		for (int i=0;i<Trimmer.totalsetting.length;i++)
		{
			int ref = Trimmer.totalsetting[i];
			System.out.println("Size is : " +ref);
		}
		
		System.out.println("\n");
		
		Trimmer.brand = "bajaj";
	    Trimmer.color = "blue";
	    Trimmer.price = 7080.78;
	    Trimmer.working = false;
	    Trimmer.warranty = 1;
		
		System.out.println(Trimmer.brand);
		System.out.println(Trimmer.color);
		System.out.println(Trimmer.price);
		System.out.println(Trimmer.working);
		System.out.println(Trimmer.warranty);
		
	}
}