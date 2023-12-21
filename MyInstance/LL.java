package MyInstance;

public class LL {

    public static void main(String[] args) {

        City city = new City();
        city.name = "天津";
        city.latitude = 39.08;
        city.longitude = 117.12;
        System.out.println(city.name + "的纬度是：" + city.latitude + " 经度是：" + city.longitude);

    }

}

class City {

    public String name;
    public double latitude;
    public double longitude;

}
