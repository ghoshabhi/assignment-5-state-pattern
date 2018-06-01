package multiplesOf3;

public class MultiplesOf3 {
    private MultOf3State state;

    public MultiplesOf3() {
        state = MultOf3State.ZEROMOD3;
    }

    public Integer computeY(String _input) {
        Integer op = state.computeY(_input);
        return op;
    };

    public MultOf3State getState() {
        return state.getState();
    }

//    public void setState(MultOf3State newState) {
//        state = newState;
//    }
}
