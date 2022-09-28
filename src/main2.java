public class main2 {
    public static void main2(String[] args){
        Door d1 = new BankVaultDoor();
        Door d2 = new HouseFrontDoor();
        Door d3 = new CarDoor();
    }

    if(arg[0] == "car"){
        d3.open();
    }else if (arg[0] == "bank"){
        d1.open();
    }else{
        d2.open();
    }
    
}
