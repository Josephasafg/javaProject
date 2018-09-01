package Shop;

import DB.ItemDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

public class Item {
    private int id;
    private String name;
    private int rackNum;
    private int currentQuantity;
    private int originalQuantity;
    private String barcode;
    private String vendor;
    private Date purchaseDate;
    private Date addedDate;
    private String purchaseOrderNo;
    private String size;
    private ItemType iType;
    private double cost;
    private ItemDB itemDB = new ItemDB();

    public Item() throws IOException, SQLException {
        addedDate = new Date();
    }


    public Item(int id, String name, int rackNum, int originalQuantity, String vendor, Date addedDate, String size, double cost, ItemType iType) throws IOException, SQLException {
        this.id = id;
        this.name = name;
        this.rackNum = rackNum;
        this.originalQuantity = this.currentQuantity = originalQuantity;
        this.vendor = vendor;
        this.addedDate = addedDate;
        this.size = size;
        this.cost = cost;
        this.iType = iType;
    }

    public Item selectItemID(int id) throws IOException, SQLException {
        Item item = itemDB.selectItemByID(id);
        return item;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rackNum='" + rackNum + '\'' +
                ", currentQuantity=" + currentQuantity +
                ", originalQuantity=" + originalQuantity +
                ", barcode='" + barcode + '\'' +
                ", vendor='" + vendor + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", addedDate=" + addedDate +
                ", purchaseOrderNo='" + purchaseOrderNo + '\'' +
                ", size='" + size + '\'' +
                ", cost=" + cost +
                '}';
    }

    public int getRackNum() {
        return rackNum;
    }

    public void setRackNum(int rackNum) {
        this.rackNum = rackNum;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ItemType getiType() {
        return iType;
    }

    public void setiType(ItemType iType) {
        this.iType = iType;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


    public void purchase() {
        this.currentQuantity--;
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


    public double getRetail() {
        return this.cost;
    }

    public void setReail(int cost) {
        this.cost = cost;
    }

}
