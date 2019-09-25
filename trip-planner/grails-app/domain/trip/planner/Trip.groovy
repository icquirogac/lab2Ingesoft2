package trip.planner

class Trip {

    private String name;
    private String location;
    private int upVotes;
    private String hotel;
    private Date startDate;
    private Date endDate;
    private String publisherName;

    public Trip(String nombre, String lugar, String hote, Date startD, Date endD, String publisher){
    	this.name = nombre;
    	this.location = lugar;
    	this.upVotes = 0;
    	this.hotel = hote;
    	this.startDate = startD;
    	this.endDate = endD;
    	this.publisherName = publisher;
    }
    static constraints = {
    }
}
