package multiplesOf3;

public enum MultOf3State implements State {
    ZEROMOD3 {
        @Override
        public void changeState(MultiplesOf3 wrapper) {
            MultOf3State.calculateState(wrapper);
        }
    },
    ONEMOD3 {
        @Override
        public void changeState(MultiplesOf3 wrapper) {
            MultOf3State.calculateState(wrapper);
        }
    },
    TWOMOD3 {
        @Override
        public void changeState(MultiplesOf3 wrapper) {
            MultOf3State.calculateState(wrapper);
        }
    };

    private static void calculateState(MultiplesOf3 wrapper) {
        Integer mod = wrapper.getCurrentSum() % 3;
        if(mod == 0) {
            wrapper.setState(MultOf3State.ZEROMOD3);
        } else if (mod == 1) {
            wrapper.setState(MultOf3State.ONEMOD3);
        } else if (mod == 2) {
            wrapper.setState(MultOf3State.TWOMOD3);
        }
    }
}
