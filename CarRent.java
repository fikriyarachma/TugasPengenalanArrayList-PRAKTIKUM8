import java.util.ArrayList;

public class CarRent {
    private CarRider rider;
    private Car car;
    private int rentDur;
    
    public CarRent(CarRider rider, Car car, int rentDur) {
        this.rider = rider;
        this.car = car;
        this.rentDur = rentDur;
    }
    public CarRider getRider() {
        return rider;
    }
    public Car getCar() {
        return car;
    }
    public int getRentDur() {
        return rentDur;
    }
}

class RentArchive {
    ArrayList <CarRent> rentData = new ArrayList<CarRent>();
    
    public void Rent (CarRider rider, Car car, int RentDur) {
      
       if (car.isStatus() == true) {
            System.out.println("Mobil berhasil disewa");
            car.setStatus(false);
            rentData.add(new CarRent(rider, car, RentDur));
        } else if (car.isStatus() == false) {
            System.out.println("Maaf, mobil sudah disewa");
        }
       
      
    }
    public void info() {
        System.out.println("========================================================");
        System.out.println("                   INFORMASI PELANGGAN               ");
        System.out.println("========================================================");
        
        for (CarRent rentData1 : rentData) {
            System.out.println("NAMA PEMINJAM   :" + rentData1.getRider().getName());
            System.out.println("TIPE MOBIL      :" + rentData1.getCar().getCarType());
            System.out.println("NO. POLISI      :" + rentData1.getCar().getPolNum());
            System.out.println("LAMA RENTAL     :" + rentData1.getRentDur() + " hari");
            System.out.println("----------------------------------------------------");
        }
    }
}

class CarRider {
    private String name;
    private int age;
    private String phone;
    
    public CarRider (String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }
}

class Car {
    private String carType;
    private String polNum;
    private String merk;
    private boolean status;
    
    public Car (String carType,String polNum, String merk,boolean status) {
        this.carType = carType;
        this.polNum = polNum;
        this.merk = merk;
        this.status = status;
    }
    public String getCarType() {
        return carType;
    }
    public String getPolNum() {
        return polNum;
    }
    public String getMerk() {
        return merk;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
}

class CarData {
   ArrayList <Car> carList = new ArrayList <Car>();
    
    public void addCar(String carType, String polNum, String merk){
    boolean status = true;
      
    Car isi = new Car(carType, polNum, merk, status); 
    carList.add(isi);
    }
    
    public void listOfCar () {
        System.out.println("========================================================");
        System.out.println("                      DAFTAR MOBIL                    ");
        System.out.println("========================================================");
        for (Car carList1 : carList) {
            System.out.println("TIPE MOBIL  : " + carList1.getCarType());
            System.out.println("NO. POLISI  : " + carList1.getPolNum());
            System.out.println("MERK MOBIL  : " + carList1.getMerk());
            System.out.println("----------------------------------------------------");
        }
    }
}
