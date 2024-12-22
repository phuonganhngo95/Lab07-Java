package BaiTap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Flower {
    private String flowerID, flowerName, color;
    private int kindOfFlower;

    public Flower() {}
    public Flower(String flowerID, String flowerName, String color, int kindOfFlower) {
        this.flowerID = flowerID;
        this.flowerName = flowerName;
        this.color = color;
        this.kindOfFlower = kindOfFlower;
    }

    String getFlowerID() {
        return flowerID;
    }
    public void setFlowerID(String flowerID) {
        this.flowerID = flowerID;
    }

    String getFlowerName() {
        return flowerName;
    }
    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    int getKindOfFlower() {
        return kindOfFlower;
    }
    public void setKindOfFlower(int kindOfFlower) {
        this.kindOfFlower = kindOfFlower;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id: ");
        flowerName = sc.nextLine();
        System.out.print("Nhập tên: ");
        flowerName = sc.nextLine();
        System.out.print("Nhập màu: ");
        color = sc.nextLine();
        System.out.print("Nhập loại hoa: ");
        kindOfFlower = sc.nextInt();
        System.out.print("\n");
    }

    public void output() {
        System.out.print("ID: " + flowerID);
        System.out.print("TÊN: " + flowerName);
        System.out.print("MÀU: " + color);
        if (kindOfFlower == 1) {
            System.out.println("LOẠI: HOA HỒNG ĐỎ");
        } else if (kindOfFlower == 2) {
            System.out.println("LOẠI: HOA HÔNG VÀNG");
        } else if (kindOfFlower == 3) {
            System.out.println("LOẠI: HOA HỒNG TRẮNG");
        } else {
            return;
        }
        System.out.print("\n");
    }
}

class FlowerTest {
    public static void main(String[] args) {
        ArrayList<Flower> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int lc;
        do {
            System.out.println("\nMENU:");
            System.out.println("1. Nhập thông tin");
            System.out.println("2. Hiển thị thông tin");
            System.out.println("3. Sắp xếp tên hoa tăng dần");
            System.out.println("4. Tìm kiếm theo flowerId");
            System.out.println("5. Hiển thị hoa màu trắng");
            System.out.println("6. Thoát");
            System.out.print("\nNhập lựa chọn: ");
            lc = sc.nextInt();

            switch (lc) {
                case 1:
                    System.out.print("Nhập số lượng hoa: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập hoa thứ " + (i+1) + ":");
                        Flower flower = new Flower();
                        flower.input();
                        a.add(flower);
                    }
                    break;
                case 2:
                    System.out.println("\nDanh sách hoa:");
                    for (Flower flower : a) {
                        flower.output();
                    }
                    break;
                case 3:
                    System.out.println("\nDamh sách sau khi săp xếp:");
                    Collections.sort(a, Comparator.comparing(Flower::getFlowerName));
                    for (Flower flower : a) {
                        flower.output();
                    }
                    break;
                case 4:
                    String id;
                    System.out.println("\nNhập id càn tìm: ");
                    id = sc.nextLine();
                    for (Flower flower : a) {
                        if (flower.getFlowerID().equals(id)) {
                            flower.output();
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("\nDanh sách hoa hồng trắng:");
                    for (Flower flower : a) {
                        if (flower.getKindOfFlower() == 3) {
                            flower.output();
                        }
                    }
                    break;
                case 6:
                    return;
            }
        } while (lc > 6);
    }
}
