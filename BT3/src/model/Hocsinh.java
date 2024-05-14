package model;

    public class Hocsinh {
        private String idS, nameS, numberS, addressS, gioitinhS ;
    
        public Hocsinh(String idS, String nameS, String numberS, String addressS, String gioitinhS) {
            this.idS = idS;
            this.nameS = nameS;
            this.numberS = numberS;
            this.addressS = addressS;
            this.gioitinhS = gioitinhS;
        }
    public String getIdS() {
            return idS;
        }
        public void setIdS(String idS) {
            this.idS = idS;
        }
        public String getNameS() {
            return nameS;
        }
        public void setNameS(String nameS) {
            this.nameS = nameS;
        }
        public String getNumberS() {
            return numberS;
        }
        public void setNumberS(String numberS) {
            this.numberS = numberS;
        }
        public String getAddressS() {
            return addressS;
        }
        public void setAddressS(String addressS) {
            this.addressS = addressS;
        }
        public String getGioitinhS() {
            return gioitinhS;
        }
        public void setGioitinhS(String gioitinhS) {
            this.gioitinhS = gioitinhS;
        }
    @Override
        public String toString() {
            return "Student [idS=" + idS + ", nameS=" + nameS + ", gioitinhS=" + gioitinhS + "]";
        }
    }