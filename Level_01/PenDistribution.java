class PenDistribution{
      public static void main(String [] args){
		  
		//initializing the number of pen and student  
		  int totalPen=14;
		  int numberOfStudent=3;
		  
		//calculating pens per student  
		  int pensPerStudent=totalPen/numberOfStudent;
		  
		//calculating pens remaining after distribution  
		  int remainingPen=totalPen%numberOfStudent;
		  
		//displaying the result  
		  System.out.println("The Pen Per Student is "+pensPerStudent+" and the remaining pen not distributed is "+remainingPen);
	  }
}