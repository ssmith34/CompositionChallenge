public class DishWasher {

    private boolean hasWorkToDo;

    public void setHasWorkToDo (boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        System.out.println("Washing dishes");
        hasWorkToDo = false;
    }

}
