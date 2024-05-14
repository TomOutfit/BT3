package model;

public class GiaoVien {
   private String idGV, nameGV, numberGV, addressGV ;
public GiaoVien(String idGV, String nameGV, String numberGV, String addressGV) {
    this.idGV = idGV;
    this.nameGV = nameGV;
    this.numberGV = numberGV;
    this.addressGV = addressGV;
}
public String getIdGV() {
    return idGV;
}
public void setIdGV(String idGV) {
    this.idGV = idGV;
}
public String getNameGV() {
    return nameGV;
}
public void setNameGV(String nameGV) {
    this.nameGV = nameGV;
}
public String getNumberGV() {
    return numberGV;
}
public void setNumberGV(String numberGV) {
    this.numberGV = numberGV;
}
public String getAddressGV() {
    return addressGV;
}
public void setAddressGV(String addressGV) {
    this.addressGV = addressGV;
}
@Override
public String toString() {
    return "GiaoVien [idGV=" + idGV + ", nameGV=" + nameGV + "]";
}
}