class ParkingSystem {
    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1) {
            if (this.big >= 1) {
                this.big--;
                return true;
            } else {
                return false;
            }
        } else if (carType == 2) {
            if (this.medium > 0) {
                this.medium--;
                return true;
            } else {
                return false;
            }
        } else {
            if (this.small >= 1) {
                this.small--;
                return true;
            } else {
                return false;
            }
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small); boolean param_1 =
 * obj.addCar(carType);
 */
