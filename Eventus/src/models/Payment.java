package models;



public class Payment {
    /**
     * Variables
     */
    private int invoiceId;
    private int userID;
    private int eventID;
   
    private byte[] receiptPicture;

    /**
     * The constructor for the objects.
     * Items labeled with  can be inserted as null, others are required
     *
     * @author Salah Al-Dhaferi
     *
     **/
    public Payment(int invoiceId, int userID, int eventID,byte[] receiptPicture) {
        this.invoiceId = invoiceId;
        this.userID = userID;
        this.eventID = eventID;
        this.receiptPicture = receiptPicture;
    }

    /**
     * Setters and getters for all variables
     *
     * @author Salah Al-Dhaferi
     */
    //region Setters and getters

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public byte[] getReceiptPicture() {
        return receiptPicture;
    }

    public void setReceiptPicture(byte[] receiptPicture) {
        this.receiptPicture = receiptPicture;
    }

    //endregion
}
