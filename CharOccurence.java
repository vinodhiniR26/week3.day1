package week3.day1;

public class CharOccurence {

		public static void main(String[] args) {
			String s1 = "welcome to chennai";
			char c = 'e';
			System.out.println("Character for the occurance is: "+ c);
			int count=0;
			char[] charArray = s1.toCharArray();
			int size=charArray.length;
			//System.out.println("Length of the Array is: " + size);
			
			for(int i=0;i<size;i++)
			{	
				if(s1.charAt(i) == c)
					count++;
			}
			
			System.out.println( c +" occurs " + count + " times in " + "'"+s1+"'");
		}

	

}
