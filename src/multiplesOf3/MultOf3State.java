package multiplesOf3;

// Is the State interface really needed ?
public enum MultOf3State implements State {
    ZEROMOD3 {
        @Override
        public void changeState(MultiplesOf3 wrapper) {
            System.out.println("0mod3::sum: " + wrapper.getCurrentSum());
            if((wrapper.getCurrentSum() % 3) == 0) {
                wrapper.setState(MultOf3State.ZEROMOD3);
                System.out.println("wrapper::state: " + wrapper.getState());
            }
        }
    },
    ONEMOD3 {
        @Override
        public void changeState(MultiplesOf3 wrapper) {
            System.out.println("1mod3::sum: " + wrapper.getCurrentSum());
//            if((wrapper.getCurrentSum() % 3) == 1) {
//                wrapper.setState(MultOf3State.ONEMOD3);
//            }
        }
    },
    TWOMOD3 {
        @Override
        public void changeState(MultiplesOf3 wrapper) {
            System.out.println("2mod3::sum: " + wrapper.getCurrentSum());
//            if((wrapper.getCurrentSum() % 3) == 2) {
//                wrapper.setState(MultOf3State.TWOMOD3);
//            }
        }
    }
}
