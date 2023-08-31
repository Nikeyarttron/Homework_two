public class Phone {
    public long numbers;
    public String model;
    public float weight;

    public Phone(long numbers, String model, float weight){
        this.numbers = numbers;
        this.model = model;
        this.weight = weight;
    }

    public Phone(long numbers, String model){
        this.numbers = numbers;
        this.model = model;
    }

    public Phone(){

    }

    public void receiveCall(String name){
        System.out.println("Звонит: " + name);
    }
    public String getNumbers(){
        String num = "Номер: " + numbers;
        return num;
    }

}
