package Question2;
/*
     Question number 2
*/
public class Room {
    int roomNo;
    float roomArea;
    String roomType;
    boolean acMachine;

    public void setData(int roomno, String roomtype, float roomarea, boolean acmachine){
        roomNo= roomno;
        roomArea= roomarea;
        roomType= roomtype;
        acMachine= acmachine;
    }

    public void displayData(){
        System.out.println(
                " Room number: "+ roomNo +'\n'+
                " Room Type: "+roomType+"\n" +
                " Room Area: "+ roomArea+"\n"+
                " Room have Ac: "+((acMachine)? "Yes":"No")
        );
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("Question number Two ");
        Room roomObj = new Room();
        roomObj.setData(1,"Super Deluxe",30.0f,true);
        roomObj.displayData();
    }

}
