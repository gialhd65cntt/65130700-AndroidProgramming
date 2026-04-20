package thigk2.LeHoangDangGia.thigk;

    public class DiaDiem {
        private int hinhAnh; // ID của ảnh trong thư mục drawable
        private String ten;
        private String diaChi;

        public DiaDiem(int hinhAnh, String ten, String diaChi) {
            this.hinhAnh = hinhAnh;
            this.ten = ten;
            this.diaChi = diaChi;
        }

        // Getter
        public int getHinhAnh() { return hinhAnh; }
        public String getTen() { return ten; }
        public String getDiaChi() { return diaChi; }
    }
