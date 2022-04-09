package ss6_ke_thua.thuc_hanh;
//         hinh chu nhat
public class Rectangle extends Shape{
        double width=1.0;
        double height=1.0;

        public Rectangle(){

        }
        public Rectangle(double width, double height) {
                this.width = width;
                this.height = height;
        }

        public Rectangle(String color, boolean filled, double width, double height) {
                super(color, filled);
                this.width = width;
                this.height = height;
        }
        public double  getArea(){
                return width*height;
        }
        public double getPerimeter(){
                return (width+height)*2;
        }

        public double getWidth() {
                return width;
        }

        public void setWidth(double width) {
                this.width = width;
        }

        public double getHeight() {
                return height;
        }

        public void setHeight(double height) {
                this.height = height;
        }

        @Override
        public String toString() {
                return "A Rectangle with " +
                        "width=" +getWidth() +
                        ", height=" + getHeight() +"\n"+
                        "which is a subclass of"+"\n"+
                        super.toString()+
                        '}';
        }
}
