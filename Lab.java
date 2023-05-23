package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Khai báo mảng để lưu thông tin
        String[] tenChiNhanh = new String[5];
        int[] soLuongNhanVien = new int[5];

        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin tên và số lượng nhân viên cho từng chi nhánh
        for (int i = 0; i < 5; i++) {
            System.out.println("\nNhập thông tin cho chi nhánh thứ " + (i + 1) + ":");
            System.out.print("Tên chi nhánh: ");
            tenChiNhanh[i] = scanner.nextLine();
            
            // Kiểm tra tính hợp lệ của số lượng nhân viên
            boolean hopLe = false;
            while (!hopLe) {
                System.out.print("Số lượng nhân viên: ");
                soLuongNhanVien[i] = scanner.nextInt();
                scanner.nextLine();

                if (soLuongNhanVien[i] >= 50 && soLuongNhanVien[i] < 1000) {
                    hopLe = true;
                } else {
                    System.out.println("Số lượng nhân viên không hợp lệ. Vui lòng nhập lại.");
                }
            }
        }

        // In ra thông tin của các chi nhánh
        for (int i = 0; i < 5; i++) {
            System.out.println("\nThông tin chi nhánh thứ " + (i + 1) + ":");
            System.out.println("Tên chi nhánh: " + tenChiNhanh[i]);
            System.out.println("Số lượng nhân viên: " + soLuongNhanVien[i]);

            // Tính và in ra chi phí dự trù
            int chiPhiDuTru = 0;
            if (soLuongNhanVien[i] > 600) {
                chiPhiDuTru = soLuongNhanVien[i] * 3000;
            } else if (soLuongNhanVien[i] > 400) {
                chiPhiDuTru = soLuongNhanVien[i] * 1500;
            } else if (soLuongNhanVien[i] > 200) {
                chiPhiDuTru = soLuongNhanVien[i] * 1000;
            } else if (soLuongNhanVien[i] > 50) {
                chiPhiDuTru = soLuongNhanVien[i] * 3800;
            }

            System.out.println("Chi phí dự trù: " + chiPhiDuTru);
        }
    }
}