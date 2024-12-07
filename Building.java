public class Building	  	   	  	        	    		        	
{	  	   	  	        	    		        	
  private int streetNumber;	  	   	  	        	    		        	
  private String streetName;	  	   	  	        	    		        	
  private String postCode;	  	   	  	        	    		        	
  private String ownerName;	  	   	  	        	    		        	
	  	   	  	        	    		        	
  private Room[] rooms;	  	   	  	        	    		        	
	  	   	  	        	    		        	
	  	   	  	        	    		        	
	  	   	  	        	    		        	
	  	   	  	        	    		        	
  public void setRooms(Room[] room)	  	   	  	        	    		        	
  {	  	   	  	        	    		        	
    this.rooms=room;	  	   	  	        	    		        	
	  	   	  	        	    		        	
  }	  	   	  	        	    		        	
	  	   	  	        	    		        	
  public Room[] getRooms()	  	   	  	        	    		        	
  {	  	   	  	        	    		        	
    return this.rooms;	  	   	  	        	    		        	
	  	   	  	        	    		        	
  }	  	   	  	        	    		        	
	  	   	  	        	    		        	
	  	   	  	        	    		        	
  public void setStreetNumber(int streetNumber)	  	   	  	        	    		        	
  {	  	   	  	        	    		        	
     this.streetNumber = streetNumber;	  	   	  	        	    		        	
  }	  	   	  	        	    		        	
	  	   	  	        	    		        	
  public int getStreetNumber()	  	   	  	        	    		        	
  {	  	   	  	        	    		        	
     return this.streetNumber;	  	   	  	        	    		        	
  }	  	   	  	        	    		        	
	  	   	  	        	    		        	
  public void setStreetName(String streetName)	  	   	  	        	    		        	
  {	  	   	  	        	    		        	
     this.streetName = streetName;	  	   	  	        	    		        	
  }	  	   	  	        	    		        	
	  	   	  	        	    		        	
  public String getStreetName()	  	   	  	        	    		        	
  {	  	   	  	        	    		        	
     return this.streetName;	  	   	  	        	    		        	
  }	  	   	  	        	    		        	
	  	   	  	        	    		        	
  public void setPostCode(String postCode)	  	   	  	        	    		        	
  {	  	   	  	        	    		        	
     this.postCode = postCode;	  	   	  	        	    		        	
  }	  	   	  	        	    		        	
	  	   	  	        	    		        	
  public String getPostCode()	  	   	  	        	    		        	
  {	  	   	  	        	    		        	
     return this.postCode;	  	   	  	        	    		        	
  }	  	   	  	        	    		        	
	  	   	  	        	    		        	
  public void setOwnerName(String ownerName)	  	   	  	        	    		        	
  {	  	   	  	        	    		        	
     this.ownerName = ownerName;	  	   	  	        	    		        	
  }	  	   	  	        	    		        	
	  	   	  	        	    		        	
  public String getOwnerName()	  	   	  	        	    		        	
  {	  	   	  	        	    		        	
     return this.ownerName;	  	   	  	        	    		        	
  }	  	   	  	        	    		        	
	  	   	  	        	    		        	
  public double getTotalFloorSpace()	  	   	  	        	    		        	
  {	  	   	  	        	    		        	
    double area=0;	  	   	  	        	    		        	
    double totalArea=0;	  	   	  	        	    		        	
    for(int i = 0; i<this.rooms.length; i++)	  	   	  	        	    		        	
    {	  	   	  	        	    		        	
     area = this.rooms[i].getWidth()*this.rooms[i].getLength();	  	   	  	        	    		        	
     totalArea+=area;	  	   	  	        	    		        	
	  	   	  	        	    		        	
    }	  	   	  	        	    		        	
    return totalArea;	  	   	  	        	    		        	
  }	  	   	  	        	    		        	
	  	   	  	        	    		        	
}