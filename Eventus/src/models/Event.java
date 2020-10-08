package models;



/**
 * The class that will create objects to hold the events
 *
 * @author Salah Al-Dhaferi
 */
public class Event {
    /**
     * Variables
     * */
    private int id;
    private String eventName;
    private int numberOfGuests;
    private String startDateOfEvent;
    private boolean onlyOneDay;
    private float priceOfTicket;
    private String description;
    private boolean hasFoodAndBeverages;
    private boolean freeFoodAndBeverages;
    private String typeOfEvent;

    /**
     * Nullable variables
     */ 
    private int minimumAgeRestriction = 0;
  
    private boolean foodAndBeveragesRestriction;
 
    private String genderRestriction = null;

    private String nationalityRestriction = null;

    private String endDateOfEvent = null;


    /**
     * The constructor for the objects.
     * Items labelled with  can be inserted as null, others are required
     *
     * @author Salah Al-Dhaferi
     *
     */
    public Event(int id, String eventName, int numberOfGuests, String startDateOfEvent, boolean onlyOneDay, float priceOfTicket, String description, boolean hasFoodAndBeverages, boolean freeFoodAndBeverages, String typeOfEvent,int minimumAgeRestriction, boolean foodAndBeveragesRestriction, String genderRestriction, String nationalityRestriction,String endDateOfEvent) {
        this.id = id;
        this.eventName = eventName;
        this.numberOfGuests = numberOfGuests;
        this.startDateOfEvent = startDateOfEvent;
        this.onlyOneDay = onlyOneDay;
        this.priceOfTicket = priceOfTicket;
        this.description = description;
        this.hasFoodAndBeverages = hasFoodAndBeverages;
        this.freeFoodAndBeverages = freeFoodAndBeverages;
        this.typeOfEvent = typeOfEvent;
        this.minimumAgeRestriction = minimumAgeRestriction;
        this.foodAndBeveragesRestriction = foodAndBeveragesRestriction;
        this.genderRestriction = genderRestriction;
        this.nationalityRestriction = nationalityRestriction;
        this.endDateOfEvent = endDateOfEvent;
    }

    /**
     * Setters and getters for all variables
     *
     * @author Salah Al-Dhaferi
     */

    //region Setters and getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public String getStartDateOfEvent() {
        return startDateOfEvent;
    }

    public void setStartDateOfEvent(String startDateOfEvent) {
        this.startDateOfEvent = startDateOfEvent;
    }

    public boolean isOnlyOneDay() {
        return onlyOneDay;
    }

    public void setOnlyOneDay(boolean onlyOneDay) {
        this.onlyOneDay = onlyOneDay;
    }

    public float getPriceOfTicket() {
        return priceOfTicket;
    }

    public void setPriceOfTicket(float priceOfTicket) {
        this.priceOfTicket = priceOfTicket;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isHasFoodAndBeverages() {
        return hasFoodAndBeverages;
    }

    public void setHasFoodAndBeverages(boolean hasFoodAndBeverages) {
        this.hasFoodAndBeverages = hasFoodAndBeverages;
    }

    public boolean isFreeFoodAndBeverages() {
        return freeFoodAndBeverages;
    }

    public void setFreeFoodAndBeverages(boolean freeFoodAndBeverages) {
        this.freeFoodAndBeverages = freeFoodAndBeverages;
    }

    public String getTypeOfEvent() {
        return typeOfEvent;
    }

    public void setTypeOfEvent(String typeOfEvent) {
        this.typeOfEvent = typeOfEvent;
    }

    public int getMinimumAgeRestriction() {
        return minimumAgeRestriction;
    }

    public void setMinimumAgeRestriction(int minimumAgeRestriction) {
        this.minimumAgeRestriction = minimumAgeRestriction;
    }

    public boolean isFoodAndBeveragesRestriction() {
        return foodAndBeveragesRestriction;
    }

    public void setFoodAndBeveragesRestriction(boolean foodAndBeveragesRestriction) {
        this.foodAndBeveragesRestriction = foodAndBeveragesRestriction;
    }

    public String getGenderRestriction() {
        return genderRestriction;
    }

    public void setGenderRestriction(String genderRestriction) {
        this.genderRestriction = genderRestriction;
    }

    public String getNationalityRestriction() {
        return nationalityRestriction;
    }

    public void setNationalityRestriction(String nationalityRestriction) {
        this.nationalityRestriction = nationalityRestriction;
    }

    public String getEndDateOfEvent() {
        return endDateOfEvent;
    }

    public void setEndDateOfEvent(String endDateOfEvent) {
        this.endDateOfEvent = endDateOfEvent;
    }
    //endregion
}
