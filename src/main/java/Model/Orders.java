package Model;

import java.util.*;

public class Orders {
int ord_id;
int cust_id;
Date ord_date;
String status;
Date dlv_date;
public int getOrd_id() {
	return ord_id;
}
public void setOrd_id(int ord_id) {
	this.ord_id = ord_id;
}
public int getCust_id() {
	return cust_id;
}
public void setCust_id(int cust_id) {
	this.cust_id = cust_id;
}
public Date getOrd_date() {
	return ord_date;
}
public void setOrd_date(Date ord_date) {
	this.ord_date = ord_date;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Date getDlv_date() {
	return dlv_date;
}
public void setDlv_date(Date dlv_date) {
	this.dlv_date = dlv_date;
}



}
