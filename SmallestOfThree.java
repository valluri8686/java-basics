class  SmallestOfThree{
	public static void main(String[] args) {
		int a=100,b=30,c=50;
		if (a<b && a<c)
		{
			System.out.println("a is Smallest");
		}
		else if(b<a && b<c){
			System.out.println("b is Smallest");
		}
		else if(c<a && c<b){
			System.out.println("c is Smallest");
		}
	}
}
