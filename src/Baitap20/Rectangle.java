package Baitap20;

class Rectangle implements baitap20 {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
        @Override
        public double getArea() {
            return length * width;
        }

        @Override
        public double getPerimeter() {
            return (length + width) * 2;
        }
}
