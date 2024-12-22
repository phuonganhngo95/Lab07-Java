package BaiTap;

import javax.xml.transform.sax.SAXResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class City {
    private String cityId, cityName, country;
    private double area;

    public City() {}
    public City(String cityId, String cityName, String country, double area) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.country = country;
        this.area = area;
    }

    String getCityId() {
        return cityId;
    }
    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id: ");
        cityId = sc.nextLine();
        System.out.print("Nhập tên thành phố: ");
        cityName = sc.nextLine();
        System.out.print("Nhập tên nước: ");
        country = sc.nextLine();
        System.out.print("Nhập diện tích: ");
        area = sc.nextDouble();
        System.out.println("\n");
    }

    public void hienthi() {
        System.out.println("ID: " + cityId);
        System.out.println("THÀNH PHỐ: " + cityName);
        System.out.println("NƯỚC: " + country);
        System.out.println("DIỆN TÍCH: " + area);
        System.out.println("\n");
    }
}

class ManagerCity {
    public static void main(String[] args) {
        ArrayList<City> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int lc;
        do {
            System.out.println("\nMENU:");
            System.out.println("1. Nhập thông tin");
            System.out.println("2. Hiển thị thông tin");
            System.out.println("3. Sắp xếp tên nước tăng dần");
            System.out.println("4. Tìm kiếm cityId đưa ra thông tin");
            System.out.println("5. Thoát");
            System.out.print("\nNhập lựa chọn: ");
            lc = sc.nextInt();

            switch (lc) {
                case 1:
                    System.out.print("Nhập số lượng thành phố: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập thành phố thứ " + (i+1) + ":");
                        City city = new City();
                        city.nhap();
                        a.add(city);
                    }
                    break;
                case 2:
                    System.out.println("\nDanh sách các thành phố:");
                    for (City city : a) {
                        city.hienthi();
                    }
                    break;
                case 3:
                    System.out.println("\nDanh sách sau khi sắp xếp:");
                    Collections.sort(a, Comparator.comparing(City::getCountry));
                    for (City city : a) {
                        city.hienthi();
                    }
                    break;
                case 4:
                    String id;
                    System.out.print("\nNhập id cần tìm: ");
                    id = sc.nextLine();
                    for (City city : a) {
                        if (city.getCityId().equals(id)) {
                            city.hienthi();
                            break;
                        }
                    }
                    break;
                case 5:
                    return;
            }
        }while (lc > 5);
    }
}