class ParkingSystem {

    int small, medium, big;
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1){
            this.big -= 1;
            return this.big < 0 ? false: true;
        }
         if(carType == 2){
            this.medium -= 1;
            return this.medium < 0 ? false: true;
        }
         if(carType == 3){
            this.small -= 1;
            return this.small < 0 ? false: true;
        }

        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */