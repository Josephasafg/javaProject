import java.util.Date;

public class Item {

    private int id;
    private String name;
    private String rackNum;
    private int currentQuantity;
    private int originalQuantity;
    private String barcode;
    private String vendor;
    private Date purchaseDate;
    private Date addedDate;
    private String purchaseOrderNo;
    private double cost;




    public void purchase() {
        currentQuantity--;
    }

    public String getPurchaseOrderNo() {
        return this.purchaseOrderNo;
    }

    public void setPurchaseOrderNo(String purchaseOrderNo) {
        this.purchaseOrderNo = purchaseOrderNo;
    }

    public Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Date getAddedDate() {
        return this.addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public String getVendor() {
        return this.vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public int getCurrentQuantity() {
        return this.currentQuantity;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getrackNum() {
        return this.rackNum;
    }

    public void setrackNum(String rackNum) {
        this.rackNum = rackNum;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarcode() {
        return this.barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getOriginalQuantity() {
        return this.originalQuantity;
    }

    public void setOriginalQuantity(int originalQuantity) {
        this.originalQuantity = originalQuantity;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public double getRetail() {
        return this.cost;
    }

    public void setReail(int cost) {
        this.cost = cost;
    }




}
