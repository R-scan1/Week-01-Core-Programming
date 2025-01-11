class VolumeOfEarth{
      public static void main(String [] args){
		  
		//assigning radius to variable  
		  double radiusInKM=6378;
		  
		//calculating radius in miles 1km=0.6mile 
		  double radiusInMiles=radiusInKM*0.6;
		  
		//calculating volume in cubic kilometers  
		  double volumeInKM3=((double)4/3)*Math.PI*Math.pow(radiusInKM,3);
		  
		//calculating volume in cubic miles  
		  double volumeInMile3=((double)4/3)*Math.PI*Math.pow(radiusInMiles,3);
		  
		//displaying the result  
		  System.out.println("The volume of earth in cubic kilometers is "+volumeInKM3+" and cubic miles is "+volumeInMile3);
		  
		  
	  }
}