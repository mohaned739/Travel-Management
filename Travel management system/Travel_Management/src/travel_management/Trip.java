/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel_management;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
class Trip
{
 ArrayList<Integer> tickets=new ArrayList<Integer>();
private int day,year;
private String ID1;
private String month;
private String name;
private String Date;
private int number_of_tourists,number_of_joined;
private double price; 
private double profit;
private String category;
private Tour_Guide Guide;
protected ArrayList<Client> Client=new ArrayList<Client>();
private String description ;
private int endday,endyear;
private String endmonth;
private String End_Date;
private String path;
    public String getID1() {
        return ID1;
    }

    public void setID1(String ID1) {
        this.ID1 = ID1;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber_of_tourists() {
        return number_of_tourists;
    }

    public void setNumber_of_tourists(int number_of_tourists) {
        this.number_of_tourists = number_of_tourists;
    }

    public int getNumber_of_joined() {
        return number_of_joined;
    }

    public void setNumber_of_joined(int number_of_joined) {
        this.number_of_joined = number_of_joined;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Tour_Guide getGuide() {
        return Guide;
    }

    public void setGuide(Tour_Guide Guide) {
        this.Guide = Guide;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public int getEndday() {
        return endday;
    }

    public void setEndday(int endday) {
        this.endday = endday;
    }

    public int getEndyear() {
        return endyear;
    }

    public void setEndyear(int endyear) {
        this.endyear = endyear;
    }

    public String getEndmonth() {
        return endmonth;
    }

    public void setEndmonth(String endmonth) {
        this.endmonth = endmonth;
    }
    
public String getEnd_Date() {
        return End_Date;
    }

    public void setEnd_Date(String End_Date) {
        this.End_Date = End_Date;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}