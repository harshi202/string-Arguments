class Vehical{
	public static void main (String []args){
		System.out.println("main ()startd");
		for (int i=0; i<args.length;i=i+1){
			if (i%5 == 0){
				System.out.println();
			}
			System.out.println(args[i]+"\t");
		}
		System.out.println("\nend of main () ");
	}
