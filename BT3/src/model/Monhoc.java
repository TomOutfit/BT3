package model;

	public class Monhoc {
        private String idMonhoc, Tenmonhoc;
    
        public Monhoc(String idMonhoc, String tenmonhoc) {
            this.idMonhoc = idMonhoc;
            this.Tenmonhoc = tenmonhoc;
        }
    
        public String getIdMonhoc() {
            return idMonhoc;
        }
    
        public void setIdMonhoc(String idMonhoc) {
            this.idMonhoc = idMonhoc;
        }
    
        public String getTenmonhoc() {
            return Tenmonhoc;
        }
    
        public void setTenmonhoc(String tenmonhoc) {
            Tenmonhoc = tenmonhoc;
        }
    
        @Override
        public String toString() {
            return "Monhoc [idMonhoc=" + idMonhoc + ", Tenmonhoc=" + Tenmonhoc + "]";
        }
    } 