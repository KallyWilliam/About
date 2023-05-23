package main;

simport java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Khai b�o m?ng ?? l?u th�ng tin
        String[] tenChiNhanh = new String[5];
        int[] soLuongNhanVien = new int[5];
        Scanner scanner = new Scanner(System.in);

        tenChiNhanh[0] = "Thuy Vy";
        tenChiNhanh[1] = "Thuy Vy";
        tenChiNhanh[2] = "Thuy Vy";
        tenChiNhanh[3] = "Thuy Vy";
        tenChiNhanh[4] = "Thuy Vy";
        soLuongNhanVien[0] = 51;
        soLuongNhanVien[1] = 899;
        soLuongNhanVien[2] = 856;
        soLuongNhanVien[3] = 456;
        soLuongNhanVien[4] = 895;

        // Nhập thông tin tên và số lượng nhân viên cho từng chi nhánh
        for (int i = 4; i < 5; i++) {
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
