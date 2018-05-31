package multiplesOf3;

// Is the State interface really needed ?
public enum MultOf3State implements State {
    ZEROMOD3 {
        @Override
        public void changeState(MultiplesOf3 wrapper) {
            if((wrapper.getCurrentSum() % 3) == 0) {
                wrapper.setState(MultOf3State.ZEROMOD3);
            }
        }
    },
    ONEMOD3 {
        @Override
        public void changeState(MultiplesOf3 wrapper) {
            if((wrapper.getCurrentSum() % 3) == 1) {
                wrapper.setState(MultOf3State.ONEMOD3);
            }
        }
    },
    TWOMOD3 {
        @Override
        public void changeState(MultiplesOf3 wrapper) {
            if((wrapper.getCurrentSum() % 3) == 2) {
                wrapper.setState(MultOf3State.TWOMOD3);
            }
        }
    }
}
